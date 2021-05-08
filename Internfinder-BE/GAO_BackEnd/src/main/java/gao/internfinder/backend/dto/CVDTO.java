package gao.internfinder.backend.dto;

import java.sql.Date;
import java.time.LocalDate;


public class CVDTO {

    private Integer account;
    private Integer template_cv;
    private String file_name;
    private String path;
    private Date create_date;

    public CVDTO(Integer account, Integer template_cv, String file_name, String path, Date create_date) {
        this.account = account;
        this.template_cv = template_cv;
        this.file_name = file_name;
        this.path = path;
        this.create_date = create_date;
    }

    public CVDTO() {
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getTemplate_cv() {
        return template_cv;
    }

    public void setTemplate_cv(Integer template_cv) {
        this.template_cv = template_cv;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}
