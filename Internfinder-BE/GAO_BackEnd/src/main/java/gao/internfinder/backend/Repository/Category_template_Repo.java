package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.Category_template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Category_template_Repo extends JpaRepository<Category_template, Integer> {
}
