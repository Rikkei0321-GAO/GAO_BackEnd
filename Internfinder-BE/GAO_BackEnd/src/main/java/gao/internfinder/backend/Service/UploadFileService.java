package gao.internfinder.backend.Service;

import gao.internfinder.backend.Entity.Template_cv;
import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {
    Template_cv store(MultipartFile file) throws Exception;
}
