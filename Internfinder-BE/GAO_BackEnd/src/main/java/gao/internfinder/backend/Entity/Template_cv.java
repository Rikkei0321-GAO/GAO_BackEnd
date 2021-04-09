package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "template_cv")
public class Template_cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtemplate_CV")
    private  Integer idtemplate_CV;
    @Column(name = "path")
    private String path;
    @Column(name = "create_date")
    private Date create_date;
    @Column(name = "modife_date")
    private Date modife_date;
    @Column(name = "file_name")
    private String file_name;
    @Column(name = "decriptions")
    private String decriptions;

    public Template_cv(Integer idtemplate_CV, String path, Date create_date, Date modife_date, String file_name, String decriptions) {
        this.idtemplate_CV = idtemplate_CV;
        this.path = path;
        this.create_date = create_date;
        this.modife_date = modife_date;
        this.file_name = file_name;
        this.decriptions = decriptions;
    }

    public Template_cv() {

    }

    public Integer getIdtemplate_CV() {
        return idtemplate_CV;
    }

    public void setIdtemplate_CV(Integer idtemplate_CV) {
        this.idtemplate_CV = idtemplate_CV;
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

    public Date getModife_date() {
        return modife_date;
    }

    public void setModife_date(Date modife_date) {
        this.modife_date = modife_date;
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
}

