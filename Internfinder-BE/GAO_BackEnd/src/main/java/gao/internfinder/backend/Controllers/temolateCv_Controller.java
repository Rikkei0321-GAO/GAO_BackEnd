package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.DTO.templateDto;
import gao.internfinder.backend.Entity.Template_cv;
import gao.internfinder.backend.Repository.TemplateCV_Repo;
import gao.internfinder.backend.Service.Impl.TemplateCV_ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

@RestController
@RequestMapping(value="/admincv")
public class temolateCv_Controller {
    @Autowired
    private TemplateCV_ServiceImpl templateCV_service;
    @Autowired
    private TemplateCV_Repo templateCV_repo;

    @RequestMapping(value = "/template_all", method = RequestMethod.GET)
    public ResponseEntity<List<Template_cv>> showAllQuestion() {
        List<Template_cv> list = templateCV_repo.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
        @RequestMapping(value = "/addTemplate", method = RequestMethod.POST)
    public ResponseEntity<Void> addTemplateCV(@RequestBody Template_cv template_cv) {
        templateCV_repo.save(template_cv);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/save/template",method = RequestMethod.POST, consumes = { "multipart/form-data" } )
    public ResponseEntity<Void> saveTempalate(@ModelAttribute templateDto templateDto, @RequestParam("file") MultipartFile file) throws IOException {

        Template_cv template = new Template_cv();
        if(!file.isEmpty()){
            byte[]bytes = file.getBytes();
            String filename = file.getOriginalFilename();
            String url = "D:/DoAn_TN/Template/" + filename;
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(url)));
            stream.write(bytes);
            stream.flush();
            stream.close();
            System.out.println(templateDto.getFile_name());
            template.setFile_name(templateDto.getFile_name());
            template.setDecriptions(templateDto.getDecriptions());
            template.setPath(url);
            templateCV_repo.save(template);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

