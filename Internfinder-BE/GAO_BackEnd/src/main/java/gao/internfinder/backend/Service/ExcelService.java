package gao.internfinder.backend.Service;

import gao.internfinder.backend.Entity.data_cv;
import org.jxls.common.Context;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.OutputStream;
import java.util.Map;

public interface ExcelService {
    boolean getExcel(String templateFile, Map<String,Object> params, OutputStream os);

    boolean getExcel(String templateFile, String fileName, Context context, HttpServletResponse response, data_cv cvtest);

    boolean getExcel(String templateFile, Map<String,Object> params, File outputFile);

    boolean getExcel(String s, String s1, Context context, HttpServletResponse response);
}
