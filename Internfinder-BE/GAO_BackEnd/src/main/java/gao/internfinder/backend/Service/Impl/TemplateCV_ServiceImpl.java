package gao.internfinder.backend.Service.Impl;

import gao.internfinder.backend.Entity.Template_cv;
import gao.internfinder.backend.Repository.TemplateCV_Repo;
import gao.internfinder.backend.Service.TemplateCv_Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateCV_ServiceImpl implements TemplateCv_Service {
    private TemplateCV_Repo templateCV_repo;
    @Override
    public List<Template_cv> findAll() {
        return templateCV_repo.findAll();
    }

    @Override
    public void save(Template_cv template_cv) {
        templateCV_repo.save(template_cv);
    }

    @Override
    public void deleteById(Integer id) {
        templateCV_repo.deleteById(id);
    }
}
