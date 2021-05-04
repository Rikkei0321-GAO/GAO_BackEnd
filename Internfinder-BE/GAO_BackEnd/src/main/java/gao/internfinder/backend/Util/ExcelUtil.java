package gao.internfinder.backend.Util;

import gao.internfinder.backend.BackendApplication;
import org.jxls.area.Area;
import org.jxls.builder.AreaBuilder;
import org.jxls.builder.xls.XlsCommentAreaBuilder;
import org.jxls.common.CellRef;
import org.jxls.common.Context;
import org.jxls.expression.JexlExpressionEvaluator;
import org.jxls.transform.Transformer;
import org.jxls.util.JxlsHelper;
import org.jxls.util.TransformerFactory;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import org.jxls.template.SimpleExporter;

public class ExcelUtil {
    public static void exportExcel(String fileName, InputStream templateFile, Context context,
                                   HttpServletResponse response) throws IOException {
//        response.reset();
//        response.setHeader("Accept-Ranges", "bytes");
        OutputStream os = null;
        response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));
        response.setContentType("application/octet-stream;charset=UTF-8");
        try {
            os = response.getOutputStream();
//            exportExcels(templateFile, params, os);
            JxlsHelper jxlsHelper = JxlsHelper.getInstance();
            Transformer transformer = jxlsHelper.createTransformer(templateFile,os);
            JexlExpressionEvaluator evaluator = (JexlExpressionEvaluator) transformer.getTransformationConfig().getExpressionEvaluator();
            jxlsHelper.processTemplate(context,transformer);

        } catch (IOException e) {
            throw e;
        }
    }

    public static void exportExcel(InputStream templateFile, Map<String, Object> params, OutputStream os) throws IOException {
        try {
            Context context = new Context();
            Set<String> keySet = params.keySet();
            for (String key : keySet) {
                //设置参数变量
                context.putVar(key, params.get(key));
            }
            Map<String, Object> myFunction = new HashMap<>();
            myFunction.put("fun", new ExcelUtil());
            // 启动新的jxls-api 加载自定义方法
            Transformer trans = TransformerFactory.createTransformer(templateFile, os);
            JexlExpressionEvaluator evaluator = (JexlExpressionEvaluator) trans.getTransformationConfig().getExpressionEvaluator();
            evaluator.getJexlEngine().setFunctions(myFunction);

            AreaBuilder areaBuilder = new XlsCommentAreaBuilder(trans);
            List<Area> areaList = areaBuilder.build();
            areaList.get(0).applyAt(new CellRef("sheet1!A1"), context);
            trans.write();
        } catch (IOException e) {
            throw e;
        } finally {
            try {
                if (os != null) {
                    os.flush();
                    os.close();
                }
                if (templateFile != null) {
                    templateFile.close();
                }
            } catch (IOException e) {
                throw e;
            }
        }
    }

    public static void exportExcels(InputStream templateFile, Context context, OutputStream os) throws IOException {

            JxlsHelper.getInstance().processTemplate(templateFile,os,context);

    }
}
