package gao.internfinder.backend.Service.Imp;


import gao.internfinder.backend.Service.ExcelService;

import gao.internfinder.backend.Util.ExcelUtil;
import org.jodconverter.core.office.OfficeException;
import org.jxls.common.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@Service
public class ExcelServiceImpl implements ExcelService {


    private static final Logger logger = LoggerFactory.getLogger(gao.internfinder.backend.Service.Imp.ExcelServiceImpl.class);

    @Value("${jxls.template.path}")
    private String templatePath;

      @Override
    public String  getExcel(String templateFile, String fileName, Context params, HttpServletResponse response) {
        FileInputStream inputStream = null;
        String path =null;
        try {
            inputStream = new FileInputStream(ResourceUtils.getFile(templatePath + templateFile));
            path = ExcelUtil.exportExcel(fileName,inputStream,params,response);
        } catch (IOException | OfficeException e) {
            logger.error("excel export has error" + e);
        }
          return path;
    }



}

