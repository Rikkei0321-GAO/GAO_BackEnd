package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "created_cv")
public class Created_cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcreated_CV")
    private Integer idcreated_CV;
    @Column(name = "file_name")
    private  String file_name;
    @Column(name = "path")
    private String path;
    @Column(name = "create_date")
    private Date create_date;
    @Column(name = "account_idAccount")
    private  Integer account_idAccount;
    @Column(name = "account_role_id_role")
    private  String account_role_id_role;
    @Column(name = "Template_CV_idtemplate_CV")
    private  String Template_CV_idtemplate_CV;

    public Created_cv() {

    }

    public Integer getIdcreated_CV() {
        return idcreated_CV;
    }

    public void setIdcreated_CV(Integer idcreated_CV) {
        this.idcreated_CV = idcreated_CV;
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

    public Integer getAccount_idAccount() {
        return account_idAccount;
    }

    public void setAccount_idAccount(Integer account_idAccount) {
        this.account_idAccount = account_idAccount;
    }

    public String getAccount_role_id_role() {
        return account_role_id_role;
    }

    public void setAccount_role_id_role(String account_role_id_role) {
        this.account_role_id_role = account_role_id_role;
    }

    public String getTemplate_CV_idtemplate_CV() {
        return Template_CV_idtemplate_CV;
    }

    public void setTemplate_CV_idtemplate_CV(String template_CV_idtemplate_CV) {
        Template_CV_idtemplate_CV = template_CV_idtemplate_CV;
    }

    public Created_cv(Integer idcreated_CV, String file_name, String path, Date create_date, Integer account_idAccount, String account_role_id_role, String template_CV_idtemplate_CV) {
        this.idcreated_CV = idcreated_CV;
        this.file_name = file_name;
        this.path = path;
        this.create_date = create_date;
        this.account_idAccount = account_idAccount;
        this.account_role_id_role = account_role_id_role;
        Template_CV_idtemplate_CV = template_CV_idtemplate_CV;
    }
}
