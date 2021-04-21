package gao.internfinder.backend.Service;

import org.jxls.common.Context;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.OutputStream;
import java.util.Map;

public interface ExcelService {
    boolean getExcel(String templateFile, Map<String,Object> params, OutputStream os);

    void getExcel(String templateFile, String fileName, Context context, HttpServletResponse response);

    boolean getExcel(String templateFile, Map<String,Object> params, File outputFile);
}
