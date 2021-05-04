package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.DTO.User;
import gao.internfinder.backend.Repository.data_cv_repo;
import gao.internfinder.backend.Service.ExcelService;
import lombok.Builder;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.jodconverter.core.DocumentConverter;
import org.jodconverter.core.document.DefaultDocumentFormatRegistry;
import org.jodconverter.core.document.DocumentFamily;
import org.jodconverter.core.document.DocumentFormat;
import org.jodconverter.core.office.OfficeException;
import org.jodconverter.core.office.OfficeManager;
import org.jodconverter.core.office.OfficeUtils;
import org.jodconverter.core.util.StringUtils;
import org.jodconverter.local.JodConverter;
import org.jodconverter.local.LocalConverter;
import org.jodconverter.local.office.LocalOfficeManager;
import org.jxls.common.Context;
import org.jxls.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;


@RestController
//@SessionAttributes("todos")
@RequestMapping(value = "/cv")
public class CV_createdController {
    @Autowired
    ServletContext servletContext;
    @Autowired
    ExcelService excelService;
    @Autowired
    private data_cv_repo data_cvRepo;
    String pdfUrl= "C:/Users/hoang/OneDrive/Máy tính/fa/";
//    @RequestMapping(value = "/forms", method = RequestMethod.POST)internfinder_offical
//    public void create(@RequestBody user todo,@ModelAttribute("todos") ToDoLisst todos) {
//        todos.add(todo);
//
//    }
//    @RequestMapping(value = "/forms", method = RequestMethod.POST)
//    public data_cv createcv(@RequestBody data_cv userData) {
//        return data_cvRepo.save(userData);
//    }
//
//    @RequestMapping(value = "test_cv/{id}", method = RequestMethod.GET)
//    public ResponseEntity<Void> testc(@PathVariable Integer id,HttpServletResponse response ) {
//
//        data_cv cv = data_cvRepo.findById(id).get();
//        Context context1 = new Context();
//        context1.putVar("user",cv);
//        excelService.getExcel("template-hoanganh_demo.xlsx",System.currentTimeMillis()+".xlsx", context1,response, cv);
//        return new ResponseEntity<>(HttpStatus.OK);
//
//    }

    Context context = new Context();
    @RequestMapping(value = "/postdata", method = RequestMethod.POST)
    public ResponseEntity<Void> inputData(@RequestBody User user) throws IOException {
        StringBuffer fileName = new StringBuffer();
        fileName.append(UUID.randomUUID().toString().replaceAll("-", ""));
        String avatar = user.getAvatar();
        if (avatar.indexOf("data:image/png;") != -1) {
            avatar = avatar.replace("data:image/png;base64,", "");
            fileName.append(".png");
        } else if (avatar.indexOf("data:image/jpeg;") != -1) {
            avatar = avatar.replace("data:image/jpeg;base64,", "");
            fileName.append(".jpeg");
        }
        File file = new File(pdfUrl, fileName.toString());
        byte[] fileBytes = Base64.getDecoder().decode(avatar);
        try {
            FileUtils.writeByteArrayToFile(file, fileBytes);
            InputStream inputStream = new FileInputStream(ResourceUtils.getFile(pdfUrl + fileName.toString()));
            user.setImage(Util.toByteArray(inputStream));
            context.putVar("user",user);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        BufferedImage img = null;
//        byte[] imageByte ;
//
//        try {
//            imageByte = Base64.getMimeDecoder().decode(avatar.getBytes(StandardCharsets.UTF_8));
//            InputStream bis = new ByteArrayInputStream(imageByte);
//            ByteArrayOutputStream os = new ByteArrayOutputStream();
////            img = ImageIO.read(bis);
////            ImageIO.write(img,"jpeg",os);
////            bis.close();
//
//            InputStream isImg= new ByteArrayInputStream(os.toByteArray());
//            user.setImage(Util.toByteArray(isImg));
//            context.putVar("user", user);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getcv", method = RequestMethod.GET)
    public ResponseEntity<Void> getCV(HttpServletResponse response){
        excelService.getExcel("template-hoanganh_demo.xlsx",System.currentTimeMillis()+".xlsx", context,response);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/filePreview", method = RequestMethod.POST)
    public void filePreview() throws Exception {
        OfficeManager officeManager = LocalOfficeManager.builder()
                .install()
                .officeHome("C:\\Program Files (x86)\\OpenOffice 4")
                .portNumbers(2222)
                .build();
        officeManager.start();
        File file = new File("C:\\Users\\hoang\\OneDrive\\Máy tính\\1620101216887.xlsx");
        if (!file.exists()) throw new Exception("File does not exist, no preview");
        String name = file.getName().substring(0, file.getName().lastIndexOf("."));
        File pdfFile = new File(pdfUrl +  "abc.pdf");
        try {
            JodConverter.convert(file).to(pdfFile).execute();
//            DocumentFormat converter =
//                    DocumentFormat.builder()
//                            .from(DefaultDocumentFormatRegistry.PDF)
//                            .storeProperty(DocumentFamily.TEXT, "FilterOptions", "EmbedImages")
//                            .build();
//            LocalConverter.make().convert(file)
//                    .as(DefaultDocumentFormatRegistry.getFormatByMediaType(file.getName())).to(pdfFile).as(converter).execute();
        } catch (OfficeException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }

    }

    @RequestMapping(value="/uploadImage2",method = RequestMethod.POST)
    public @ResponseBody String uploadImage2(@RequestParam("imageValue") String imageValue, HttpServletRequest request)
    {
        try
        {
            byte[] imageByte=Base64.getMimeDecoder().decode(imageValue);
            String directory=servletContext.getRealPath("/")+"images/sample.jpeg";

            new FileOutputStream(directory).write(imageByte);
            return "success ";
        }
        catch(Exception e)
        {
            return "error = "+e;
        }

    }
}
