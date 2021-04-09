package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "template_cross_category_cv")
public class Template_cross_category_cv implements Serializable {
    @Id
    @Column(name = "Template_CV_idtemplate_CV")
    private  Integer Template_CV_idtemplate_CV;
    @Id
    @Column(name = "category_template_idcategory_template")
    private Integer category_template_idcategory_template;

    public Template_cross_category_cv() {

    }

    public Integer getTemplate_CV_idtemplate_CV() {
        return Template_CV_idtemplate_CV;
    }

    public void setTemplate_CV_idtemplate_CV(Integer template_CV_idtemplate_CV) {
        Template_CV_idtemplate_CV = template_CV_idtemplate_CV;
    }

    public Integer getCategory_template_idcategory_template() {
        return category_template_idcategory_template;
    }

    public void setCategory_template_idcategory_template(Integer category_template_idcategory_template) {
        this.category_template_idcategory_template = category_template_idcategory_template;
    }

    public Template_cross_category_cv(Integer template_CV_idtemplate_CV, Integer category_template_idcategory_template) {
        Template_CV_idtemplate_CV = template_CV_idtemplate_CV;
        this.category_template_idcategory_template = category_template_idcategory_template;
    }
}
