package gao.internfinder.backend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_News")
    private Integer idNews;
    @Column(name = "decriptions")
    private  String decriptions;
    @Column(name = "title")
    private  String title;
    @Column(name = "job_requirements")
    private  String jobRequire;
    @Column(name = "position")
    private  String position;
    @Column(name = "salary")
    private  String salary;
    @Column(name = "work_location")
    private  String workLoaction;
    @Column(name = "degree")
    private String degree;
    @Column(name = "major")
    private  String major;
    @Column(name = "working_time")
    private  String workingTime;
    @Column(name = "benefit")
    private  String benefit;
    @Column(name = "account_id_account")
    private  Integer idAccount;
    @Column(name = "category_id_Category")
    private  Integer idCategory;
    @Column(name = "name_nd")
    private  String nameNd;
    @Column(name = "type_of_work")
    private  String typeOfwork;
    @Column(name = "sex")
    private  String sex;
    @Column(name = "address_nd")
    private  String adressNd;
    @Column(name = "email_nd")
    private  String emailNd;
    @Column(name = "profile_language")
    private  String profileLanguae;
    @Column(name = "profile_requirement")
    private  String profileRequi;
    @Column(name = "sdt_nd")
    private  String sdtNd;
    public News() {

    }

    public News(Integer idNews, String decriptions, String title, String jobRequire,  String position, String salary, String workLoaction, String degree, String major, String workingTime, String benefit, Integer idAccount,  Integer idCategory, String nameNd, String typeOfwork, String sex, String adressNd, String emailNd, String profileLanguae, String profileRequi, String sdtNd) {
        this.idNews = idNews;
        this.decriptions = decriptions;
        this.title = title;
        this.jobRequire = jobRequire;
        this.position = position;
        this.salary = salary;
        this.workLoaction = workLoaction;
        this.degree = degree;
        this.major = major;
        this.workingTime = workingTime;
        this.benefit = benefit;
        this.idAccount = idAccount;
        this.idCategory = idCategory;
        this.nameNd = nameNd;
        this.typeOfwork = typeOfwork;
        this.sex = sex;
        this.adressNd = adressNd;
        this.emailNd = emailNd;
        this.profileLanguae = profileLanguae;
        this.profileRequi = profileRequi;
        this.sdtNd = sdtNd;
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

    public String getJobRequire() {
        return jobRequire;
    }

    public void setJobRequire(String jobRequire) {
        this.jobRequire = jobRequire;
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

    public String getWorkLoaction() {
        return workLoaction;
    }

    public void setWorkLoaction(String workLoaction) {
        this.workLoaction = workLoaction;
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

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }


    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameNd() {
        return nameNd;
    }

    public void setNameNd(String nameNd) {
        this.nameNd = nameNd;
    }

    public String getTypeOfwork() {
        return typeOfwork;
    }

    public void setTypeOfwork(String typeOfwork) {
        this.typeOfwork = typeOfwork;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
