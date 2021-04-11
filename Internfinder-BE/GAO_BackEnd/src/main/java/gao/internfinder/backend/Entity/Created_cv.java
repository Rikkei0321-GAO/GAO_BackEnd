package gao.internfinder.backend.Entity;//package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "cv")
public class Created_cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_CV;
    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "idtemplate_cv")
    private Template_cv template_cv;

    private String file_name;

    private String path;

    private Date create_date;

    public Created_cv() {
    }

    public Created_cv(Integer id_CV, Account account, Template_cv template_cv, String file_name, String path, Date create_date) {
        this.id_CV = id_CV;
        this.account = account;
        this.template_cv = template_cv;
        this.file_name = file_name;
        this.path = path;
        this.create_date = create_date;
    }

    public Integer getId_CV() {
        return id_CV;
    }

    public void setId_CV(Integer id_CV) {
        this.id_CV = id_CV;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Template_cv getTemplate_cv() {
        return template_cv;
    }

    public void setTemplate_cv(Template_cv template_cv) {
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
