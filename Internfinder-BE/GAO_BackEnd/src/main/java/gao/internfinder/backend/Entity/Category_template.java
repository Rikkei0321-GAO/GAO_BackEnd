package gao.internfinder.backend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "category_template")
public class Category_template {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategory_template")
    private  Integer id_category_template;
    @Column(name = "name")
    private  String name;
    @Column(name = "status")
    private  Boolean status;

    public Category_template() {

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

    public Category_template(Integer id_category_template, String name, Boolean status) {
        this.id_category_template = id_category_template;
        this.name = name;
        this.status = status;
    }
}
