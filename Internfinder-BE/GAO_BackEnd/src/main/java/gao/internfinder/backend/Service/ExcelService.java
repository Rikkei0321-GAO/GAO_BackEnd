package gao.internfinder.backend.Service;

import org.jxls.common.Context;

import javax.servlet.http.HttpServletResponse;


public interface ExcelService {
    String getExcel(String s, String s1, Context context, HttpServletResponse response);
}
