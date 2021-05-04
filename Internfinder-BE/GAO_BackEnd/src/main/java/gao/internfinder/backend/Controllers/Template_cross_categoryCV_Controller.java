package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.Entity.Template_cross_category_cv;
import gao.internfinder.backend.Repository.Template_cross_categoryCV_Repo;
import gao.internfinder.backend.Service.Impl.TemplateCV_ServiceImpl;
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
public class Template_cross_categoryCV_Controller {

    @Autowired
    private Template_cross_categoryCV_Repo template_cross_categoryCV_repo;

    @RequestMapping(value = "/ca_template_all", method = RequestMethod.GET)
    public ResponseEntity<List<Template_cross_category_cv>> showAllQuestion() {
        List<Template_cross_category_cv> list = template_cross_categoryCV_repo.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @RequestMapping(value = "/add_caTemplate", method = RequestMethod.POST)
    public ResponseEntity<Void> addTemplateCV(@RequestBody Template_cross_category_cv Template_cross_category_cv) {
        template_cross_categoryCV_repo.save(Template_cross_category_cv);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteTemplate", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteTemplateCV(Integer id) {
        template_cross_categoryCV_repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
