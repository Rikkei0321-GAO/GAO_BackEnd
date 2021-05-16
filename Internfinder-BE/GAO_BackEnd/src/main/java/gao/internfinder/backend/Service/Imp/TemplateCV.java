package gao.internfinder.backend.Service.Imp;

import gao.internfinder.backend.Entity.Template_cv;
import gao.internfinder.backend.Service.ITeampleCV;
import gao.internfinder.backend.repository.TemplateCV_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TemplateCV implements ITeampleCV {

    @Autowired
    TemplateCV_Repo templateCV_repo;

    @Override
    public Optional<Template_cv> getTemplate(Integer ID) {
        return templateCV_repo.findById(ID);
    }
}
