package gao.internfinder.backend.repository;

import gao.internfinder.backend.Entity.Template_cv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TemplateCV_Repo extends JpaRepository<Template_cv, Integer> {
}
