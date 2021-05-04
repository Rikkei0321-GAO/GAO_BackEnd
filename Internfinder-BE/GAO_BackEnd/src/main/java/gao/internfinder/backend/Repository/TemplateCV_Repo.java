package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.Template_cv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateCV_Repo extends JpaRepository<Template_cv, Integer> {
}
