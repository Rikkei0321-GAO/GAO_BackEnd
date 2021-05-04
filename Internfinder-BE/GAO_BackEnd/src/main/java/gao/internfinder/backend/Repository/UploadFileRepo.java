package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.Template_cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadFileRepo extends JpaRepository<Template_cv,Integer> {
}
