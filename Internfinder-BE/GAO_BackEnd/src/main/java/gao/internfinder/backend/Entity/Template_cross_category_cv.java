package gao.internfinder.backend.Entity;//package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "template_cross_category_cv")
public class Template_cross_category_cv implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idtemplate_cv")
    private Template_cv template_cv;
    @ManyToOne
    @JoinColumn(name = "id_category_template")
    private Category_template category_template;

    public Template_cross_category_cv() {

    }

    public Template_cross_category_cv(Integer id, Template_cv template_cv, Category_template category_template) {
        this.id = id;
        this.template_cv = template_cv;
        this.category_template = category_template;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Template_cv getTemplate_cv() {
        return template_cv;
    }

    public void setTemplate_cv(Template_cv template_cv) {
        this.template_cv = template_cv;
    }

    public Category_template getCategory_template() {
        return category_template;
    }

    public void setCategory_template(Category_template category_template) {
        this.category_template = category_template;
    }
}
