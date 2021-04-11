package gao.internfinder.backend.Entity;//package gao.internfinder.backend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "category")
public class Category {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCategory;

    @OneToMany(mappedBy = "category")
    @JsonBackReference
   private Set<News> newsList;

   private String name;

  private Date create_date;

   private Boolean status;

   public Category(Integer idCategory, Set<News> newsList, String name, Date create_date, Boolean status) {
       this.idCategory = idCategory;
       this.newsList = newsList;
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

   public Set<News> getNewsList() {
       return newsList;
   }

   public void setNewsList(Set<News> newsList) {
       this.newsList = newsList;
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

