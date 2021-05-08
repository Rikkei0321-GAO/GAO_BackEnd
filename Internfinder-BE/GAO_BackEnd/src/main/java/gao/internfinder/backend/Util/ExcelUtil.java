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
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;


public class ExcelUtil {

    String pathFileOP = "C:\\Users\\hoang\\OneDrive\\Máy tính\\D\\GAO_BackEnd\\Internfinder-BE\\GAO_BackEnd\\src\\main\\resources\\FileOutput\\";

    static LocalOfficeManager officeManager = LocalOfficeManager.builder()
            .install()
            .officeHome("C:\\Program Files (x86)\\LibreOffice")
            .portNumbers(1999)
            .build();

    public static String exportExcel(String fileName, InputStream templateFile, Context context,
                                   HttpServletResponse response) throws IOException, OfficeException {
        String urlFileOut = "G:\\FullStack_Version05\\BE\\GAO_BackEnd\\Internfinder-BE\\GAO_BackEnd\\src\\main\\resources\\FileOutput\\"+fileName;
        officeManager.start();
        response.reset();
        response.setHeader("Accept-Ranges", "bytes");
        response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));
        response.setContentType("application/octet-stream;charset=UTF-8");
        File osFile = new File("G:\\FullStack_Version05\\BE\\GAO_BackEnd\\Internfinder-BE\\GAO_BackEnd\\src\\main\\resources\\target\\res.xlsx");
        File pdf = new File(urlFileOut);
        OutputStream os = response.getOutputStream();
        OutputStream osExcel = null;
        osExcel = new FileOutputStream(osFile);

        JxlsHelper jxlsHelper = JxlsHelper.getInstance();
        Transformer transformer = jxlsHelper.createTransformer(templateFile,osExcel);
        // JexlExpressionEvaluator evaluator = (JexlExpressionEvaluator) transformer.getTransformationConfig().getExpressionEvaluator();
        jxlsHelper.processTemplate(context,transformer);
            if(osExcel != null ){
                //JodConverter.convert(osFile).to(os);
                DocumentFormat converter =
                        DocumentFormat.builder()
                                .from(DefaultDocumentFormatRegistry.PDF)
                                .storeProperty(DocumentFamily.TEXT, "FilterOptions", "EmbedImages")
                                .build();
                LocalConverter.make().convert(osFile).to(pdf).as(converter).execute();
                LocalConverter.make().convert(osFile).to(os).as(converter).execute();
//            }
        }
            officeManager.stop();
            return urlFileOut;
    }
}
