package gao.internfinder.backend.Controllers;

import gao.internfinder.backend.Entity.Category;
import gao.internfinder.backend.Entity.Category_template;
import gao.internfinder.backend.Entity.Template_cv;
import gao.internfinder.backend.Repository.Category_template_Repo;
import gao.internfinder.backend.Repository.TemplateCV_Repo;
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
@RequestMapping(value = "/admincategory")
public class Category_template_Controller {

    @Autowired
    private Category_template_Repo category_template_repo;

    @RequestMapping(value = "/Category_template_all", method = RequestMethod.GET)
    public ResponseEntity<List<Category_template>> showAllQuestion() {
        List<Category_template> list = category_template_repo.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @RequestMapping(value = "/addCategory_template", method = RequestMethod.POST)
    public ResponseEntity<Void> addTemplateCV(@RequestBody Category_template category_template) {
        category_template_repo.save(category_template);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteTemplate", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteTemplateCV(Integer id) {
        category_template_repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
