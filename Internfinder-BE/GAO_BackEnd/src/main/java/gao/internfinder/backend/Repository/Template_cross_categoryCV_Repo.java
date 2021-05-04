package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.Template_cross_category_cv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Template_cross_categoryCV_Repo extends JpaRepository<Template_cross_category_cv, Integer> {
}
