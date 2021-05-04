package gao.internfinder.backend.DTO;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class templateDto {
    public templateDto() {
    }

    private String file_name;
    private String decriptions;
    private MultipartFile path;

    public templateDto(String file_name, String decriptions, MultipartFile path) {
        this.file_name = file_name;
        this.decriptions = decriptions;
        this.path = path;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getDecriptions() {
        return decriptions;
    }

    public void setDecriptions(String decriptions) {
        this.decriptions = decriptions;
    }

    public MultipartFile getPath() {
        return path;
    }

    public void setPath(MultipartFile path) {
        this.path = path;
    }
}
