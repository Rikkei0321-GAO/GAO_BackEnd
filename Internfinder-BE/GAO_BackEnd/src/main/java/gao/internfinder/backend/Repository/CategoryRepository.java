package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.Category;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
