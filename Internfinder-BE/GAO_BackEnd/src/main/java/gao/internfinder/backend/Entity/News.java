package gao.internfinder.backend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNews")
    private Integer idNews;
    @Column(name = "decriptions")
    private  String decriptions;
    @Column(name = "title")
    private  String title;
    @Column(name = "image")
    private  String image;
    @Column(name = "position")
    private  String position;
    @Column(name = "salary")
    private  String salary;
    @Column(name = "work_location")
    private  String work_loaction;
    @Column(name = "degree")
    private String degree;
    @Column(name = "major")
    private  String major;
    @Column(name = "working_time")
    private  String working_time;
    @Column(name = "benefit")
    private  String benefit;
    @Column(name = "account_idAccount")
    private  Integer account_idAccount;
    @Column(name = "account_role_id_role")
    private  String account_role_id_role;
    @Column(name = "category_idCategory")
    private  Integer category_idCategory;

    public News() {

    }

    public Integer getIdNews() {
        return idNews;
    }

    public void setIdNews(Integer idNews) {
        this.idNews = idNews;
    }

    public String getDecriptions() {
        return decriptions;
    }

    public void setDecriptions(String decriptions) {
        this.decriptions = decriptions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWork_loaction() {
        return work_loaction;
    }

    public void setWork_loaction(String work_loaction) {
        this.work_loaction = work_loaction;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getWorking_time() {
        return working_time;
    }

    public void setWorking_time(String working_time) {
        this.working_time = working_time;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
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

    public Integer getCategory_idCategory() {
        return category_idCategory;
    }

    public void setCategory_idCategory(Integer category_idCategory) {
        this.category_idCategory = category_idCategory;
    }

    public News(Integer idNews, String decriptions, String title, String image, String position, String salary, String work_loaction, String degree, String major, String working_time, String benefit, Integer account_idAccount, String account_role_id_role, Integer category_idCategory) {
        this.idNews = idNews;
        this.decriptions = decriptions;
        this.title = title;
        this.image = image;
        this.position = position;
        this.salary = salary;
        this.work_loaction = work_loaction;
        this.degree = degree;
        this.major = major;
        this.working_time = working_time;
        this.benefit = benefit;
        this.account_idAccount = account_idAccount;
        this.account_role_id_role = account_role_id_role;
        this.category_idCategory = category_idCategory;
    }
}
