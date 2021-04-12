package gao.internfinder.backend.Entity;//package gao.internfinder.backend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "template_cv")
public class Template_cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idtemplate_CV;

    @OneToMany(mappedBy = "template_cv")
    @JsonBackReference
    private Set<Template_cross_category_cv> template_cross_category_cvList;

    @OneToMany(mappedBy = "template_cv")
    @JsonBackReference
    private Set<Created_cv> created_cvList;
    private String path;

    private Date create_date;

    private Date modife_date;

    private String file_name;

    private String decriptions;

    public Template_cv() {
    }

    public Template_cv(Integer idtemplate_CV, Set<Template_cross_category_cv> template_cross_category_cvList, Set<Created_cv> created_cvList, String path, Date create_date, Date modife_date, String file_name, String decriptions) {
        this.idtemplate_CV = idtemplate_CV;
        this.template_cross_category_cvList = template_cross_category_cvList;
        this.created_cvList = created_cvList;
        this.path = path;
        this.create_date = create_date;
        this.modife_date = modife_date;
        this.file_name = file_name;
        this.decriptions = decriptions;
    }

    public Integer getIdtemplate_CV() {
        return idtemplate_CV;
    }

    public void setIdtemplate_CV(Integer idtemplate_CV) {
        this.idtemplate_CV = idtemplate_CV;
    }

    public Set<Template_cross_category_cv> getTemplate_cross_category_cvList() {
        return template_cross_category_cvList;
    }

    public void setTemplate_cross_category_cvList(Set<Template_cross_category_cv> template_cross_category_cvList) {
        this.template_cross_category_cvList = template_cross_category_cvList;
    }

    public Set<Created_cv> getCreated_cvList() {
        return created_cvList;
    }

    public void setCreated_cvList(Set<Created_cv> created_cvList) {
        this.created_cvList = created_cvList;
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

