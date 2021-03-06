package gao.internfinder.backend.controllers;

import gao.internfinder.backend.Entity.Account;
import gao.internfinder.backend.Entity.Created_cv;
import gao.internfinder.backend.Entity.News;
import gao.internfinder.backend.Entity.Template_cv;
import gao.internfinder.backend.Service.ExcelService;
import gao.internfinder.backend.Service.ICreateCV;
import gao.internfinder.backend.Service.ITeampleCV;
import gao.internfinder.backend.dto.CVDTO;
import gao.internfinder.backend.dto.DataCVDTO;
import gao.internfinder.backend.dto.User;
import gao.internfinder.backend.repository.AccountRepository;
import gao.internfinder.backend.repository.CreateCVRepository;
import org.apache.commons.io.FileUtils;

import org.jxls.common.Context;
import org.jxls.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Base64;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/cv")
public class CV_createdController {
    @Autowired
    CreateCVRepository createCVRepository;
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    ITeampleCV teampleCV;
    @Autowired
    ExcelService excelService;
    @Autowired
    ICreateCV createCV;

    String pdfUrl="G:\\FullStack_Version05\\BE\\GAO_BackEnd\\Internfinder-BE\\GAO_BackEnd\\src\\main\\resources\\trash\\";
//    String pdfUrl="C:\\Users\\hoang\\OneDrive\\Máy tính\\D\\New folder\\GAO_BackEnd\\Internfinder-BE\\GAO_BackEnd\\src\\main\\resources\\trash\\";
    Context context = new Context();
    @RequestMapping(value = "/postdata", method = RequestMethod.POST)
    public ResponseEntity<Void> inputData(@RequestBody DataCVDTO data) throws IOException {
        User user = new User();
        user = createCV.postdata(data);
        String avatar = data.getAvatar();
        boolean bl = false;
        StringBuffer fileName = new StringBuffer();
        fileName.append(UUID.randomUUID().toString().replaceAll("-", ""));
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
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bl = file.delete();
        System.out.println(bl);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getcv/{idAccout}/{idTemlate}", method = RequestMethod.GET)
    public ResponseEntity<Void> getCV(@PathVariable int idAccout, @PathVariable int idTemlate,  HttpServletResponse response){
        CVDTO cvdto = new CVDTO();
        String filename = System.currentTimeMillis()+".pdf"/*" .xlsx"*/;
        cvdto.setAccount(idAccout);
        cvdto.setTemplate_cv(idTemlate);
        cvdto.setFile_name(filename);
        cvdto.setCreate_date(Date.valueOf(LocalDate.now()));
        Template_cv template_cv = teampleCV.getTemplate(idTemlate).get();
        String templateUrl = template_cv.getPath();
        String path = excelService.getExcel(templateUrl,filename, context,response);
        cvdto.setPath(path);
        createCV.addCV(cvdto);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public List<Created_cv> getAll(){
        return createCVRepository.findAll();
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    private void delete(@PathVariable Integer id){
            createCVRepository.deleteById(id);
    }


    @RequestMapping(value = "file/{id}", method = RequestMethod.GET)
    public ResponseEntity<Created_cv> get(@PathVariable("id") Integer id) {
        try {
            Created_cv st = createCVRepository.findById(id).get();
            return new ResponseEntity<Created_cv>(st, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Created_cv>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/index/{idAccount}", method = RequestMethod.GET)
    public ResponseEntity<List<Created_cv>> getOneAccount(@PathVariable int idAccount){
        List<Created_cv> list = createCV.findOneAccount(idAccount);
        if (list.isEmpty()) {
            return new ResponseEntity<List<Created_cv>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
