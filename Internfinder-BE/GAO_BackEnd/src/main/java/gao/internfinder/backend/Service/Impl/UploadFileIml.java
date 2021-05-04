package gao.internfinder.backend.Service.Impl;

import gao.internfinder.backend.Entity.Template_cv;
import gao.internfinder.backend.Repository.UploadFileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@Service
public class UploadFileIml {

    @Autowired
    UploadFileRepo uploadFileRepository;
    private Path dirLocation;


    public  Template_cv saveTemplate (Template_cv template_cv){
        return  this.uploadFileRepository.save(template_cv);
    }

    public String savefile(MultipartFile file) throws IOException {
        try {
            String filename = file.getOriginalFilename();
            Path dfile = this.dirLocation.resolve(filename);
            Files.copy(file.getInputStream(), dfile, StandardCopyOption.REPLACE_EXISTING);
            return filename;
        }
        catch (Exception e){
            return null;
        }
    }

}
