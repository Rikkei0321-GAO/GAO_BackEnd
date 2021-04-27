package gao.internfinder.backend.repository;

import gao.internfinder.backend.Entity.Category;
import gao.internfinder.backend.dto.ICategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "select category.id_category as id_category, category.name as nameCategory from policy",nativeQuery = true)
    List<ICategory> getAllCategory();
}

