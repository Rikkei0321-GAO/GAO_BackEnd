package gao.internfinder.backend.controllers;

import gao.internfinder.backend.Entity.Template_cv;
import gao.internfinder.backend.repository.TemplateCV_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/admincv")
public class temolateCv_Controller {

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

   /* @RequestMapping(value = "/deleteTemplate", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteTemplateCV(Integer id) {
        templateCV_repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }*/
}

