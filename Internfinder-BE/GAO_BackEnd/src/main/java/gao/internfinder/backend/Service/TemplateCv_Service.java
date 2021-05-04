package gao.internfinder.backend.Service;

import gao.internfinder.backend.Entity.Template_cv;

import java.util.List;

public interface TemplateCv_Service {
    List<Template_cv>findAll();
    void save(Template_cv template_cv);
    void deleteById(Integer id);
}
