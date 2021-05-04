package gao.internfinder.backend.Service.Impl;

import gao.internfinder.backend.BackendApplication;
import gao.internfinder.backend.Entity.data_cv;
import gao.internfinder.backend.Service.ExcelService;
import gao.internfinder.backend.Util.ExcelUtil;
import org.jxls.common.Context;
import org.jxls.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;

@Service
public class ExcelServiceImpl implements ExcelService {
    private static final Logger logger = LoggerFactory.getLogger(ExcelServiceImpl.class);

    @Value("${jxls.template.path}")
    private String templatePath;
    @Override
    public boolean getExcel(String templateFile, Map<String, Object> params, OutputStream os) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(ResourceUtils.getFile("classpath:jxls/"+templateFile));
            ExcelUtil.exportExcel(inputStream, params, os);
        } catch (IOException e) {
            logger.error("excel export has error" + e);
            return false;
        }
        return true;
    }

    @Override
    public boolean getExcel(String templateFile, String fileName, Context context, HttpServletResponse response ,data_cv cvtest) {
        FileInputStream inputStream = null;
        try{
            inputStream =new FileInputStream(ResourceUtils.getFile(templatePath + templateFile));
            ExcelUtil.exportExcel(fileName,inputStream,context,response);
        } catch (IOException e) {
            logger.error("excel export has error" + e);
            return false;
        }
        return true;
    }

    @Override
    public boolean  getExcel(String templateFile, String fileName, Context params, HttpServletResponse response) {
        FileInputStream inputStream = null;
        try {
            //获取模板文件的输入流
            inputStream = new FileInputStream(ResourceUtils.getFile(templatePath + templateFile));
            //导出文件到response
            ExcelUtil.exportExcel(fileName,inputStream,params,response);
        } catch (IOException e) {
            logger.error("excel export has error" + e);
            return false;
        }
        return true;
    }

    @Override
    public boolean getExcel(String templateFile, Map<String, Object> params, File outputFile) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(ResourceUtils.getFile("classpath:jxls/" + templateFile));
            File dFile = outputFile.getParentFile();
            if(dFile.isDirectory()){
                if(!dFile.exists()){
                    dFile.mkdir();
                }
            }
            if(!outputFile.exists()){
                outputFile.createNewFile();
            }
            ExcelUtil.exportExcel(inputStream, params, new FileOutputStream(outputFile));
        } catch (IOException e) {
            logger.error("excel export has error" + e);
            return false;
        }
        return true;
    }

}

