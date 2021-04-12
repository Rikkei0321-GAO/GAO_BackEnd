package gao.internfinder.backend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category_template")

public class Category_template {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_category_template;

    @OneToMany(mappedBy = "category_template")
    @JsonBackReference
    private Set<Template_cross_category_cv> template_cross_category_cvList;



    private String name;

    private Boolean status;

    public Category_template() {

    }

    public Category_template(Set<Template_cross_category_cv> template_cross_category_cvList, Integer id_category_template, String name, Boolean status) {
        this.template_cross_category_cvList = template_cross_category_cvList;
        this.id_category_template = id_category_template;
        this.name = name;
        this.status = status;
    }

    public Set<Template_cross_category_cv> getTemplate_cross_category_cvList() {
        return template_cross_category_cvList;
    }

    public void setTemplate_cross_category_cvList(Set<Template_cross_category_cv> template_cross_category_cvList) {
        this.template_cross_category_cvList = template_cross_category_cvList;
    }

    public Integer getId_category_template() {
        return id_category_template;
    }

    public void setId_category_template(Integer id_category_template) {
        this.id_category_template = id_category_template;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
