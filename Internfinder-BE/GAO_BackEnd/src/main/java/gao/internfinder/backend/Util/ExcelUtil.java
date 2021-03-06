package gao.internfinder.backend.Util;


import org.jodconverter.core.document.DefaultDocumentFormatRegistry;
import org.jodconverter.core.document.DocumentFamily;
import org.jodconverter.core.document.DocumentFormat;
import org.jodconverter.core.office.OfficeException;
import org.jodconverter.local.LocalConverter;
import org.jodconverter.local.office.LocalOfficeManager;
import org.jxls.common.Context;
import org.jxls.transform.Transformer;
import org.jxls.util.JxlsHelper;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class ExcelUtil {


    private static String pfdOut = "G:\\FullStack_Version05\\BE\\GAO_BackEnd\\Internfinder-BE\\GAO_BackEnd\\src\\main\\resources\\FileOutput\\";
    private static String xlsxTarget= "G:\\FullStack_Version05\\BE\\GAO_BackEnd\\Internfinder-BE\\GAO_BackEnd\\src\\main\\resources\\target\\";


    static LocalOfficeManager officeManager = LocalOfficeManager.builder()
            .install()
            .officeHome("C:\\Program Files (x86)\\OpenOffice 4")
            .portNumbers(1999)
            .build();

    public static String exportExcel(String fileName, InputStream templateFile, Context context,
                                   HttpServletResponse response) throws IOException, OfficeException {
        String urlFileOut = pfdOut +fileName;
        try {
            officeManager.start();
            response.reset();
            response.setHeader("Accept-Ranges", "bytes");
            response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));
            response.setContentType("application/octet-stream;charset=UTF-8");
            File osFile = new File(xlsxTarget+"res.xlsx");
            File pdf = new File(urlFileOut);
            OutputStream os = response.getOutputStream();
            OutputStream osExcel = null;
            osExcel = new FileOutputStream(osFile);

            JxlsHelper jxlsHelper = JxlsHelper.getInstance();
            Transformer transformer = jxlsHelper.createTransformer(templateFile,osExcel);// JexlExpressionEvaluator evaluator = (JexlExpressionEvaluator) transformer.getTransformationConfig().getExpressionEvaluator();
            jxlsHelper.processTemplate(context,transformer);
            if(osExcel != null ){
                DocumentFormat converter =
                        DocumentFormat.builder()
                                .from(DefaultDocumentFormatRegistry.PDF)
                                .storeProperty(DocumentFamily.TEXT, "FilterOptions", "EmbedImages")
                                .build();
                LocalConverter.make().convert(osFile).to(pdf).as(converter).execute();
                LocalConverter.make().convert(osFile).to(os).as(converter).execute();
                return urlFileOut;
            }
        }
        catch (Exception e){
        }
        finally {
            officeManager.stop();
        }
            return null;
    }
}
