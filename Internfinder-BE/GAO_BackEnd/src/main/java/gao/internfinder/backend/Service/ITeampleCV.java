package gao.internfinder.backend.Service;

import gao.internfinder.backend.Entity.Template_cv;

import java.util.Optional;

public interface ITeampleCV {
    Optional<Template_cv> getTemplate(Integer ID);
}
