package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCategory")
    private Integer idCategory;
    @Column(name = "name")
    private  String name;
    @Column(name = "create_date")
    private Date create_date;
    @Column(name = "status")
    private  Boolean status;

    public Category(Integer idCategory, String name, Date create_date, Boolean status) {
        this.idCategory = idCategory;
        this.name = name;
        this.create_date = create_date;
        this.status = status;
    }

    public Category() {

    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
