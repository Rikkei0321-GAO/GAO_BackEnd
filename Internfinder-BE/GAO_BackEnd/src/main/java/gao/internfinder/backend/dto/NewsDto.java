package gao.internfinder.backend.dto;

import java.util.Date;

public class NewsDto {
    private int id_account;

    private int id_category;

    private String decriptions;

    private String title;

    private String image;

    private String position;

    private String salary;

    private String work_loaction;

    private String degree;

    private String major;

    private String working_time;

    private String benefit;

    private String sex;

    private String name_nd;

    private String address_nd;

    private String email_nd;

    private String profile_language;

    private String profile_requirement;

    private String phone;

    private String Job_requirements;

    private int quanlity;

    private String Type_of_work;

    private String Status;

    private Date createDate;

    public NewsDto() {
    }

    public NewsDto(int id_account, int id_category, String decriptions, String title, String image, String position, String salary, String work_loaction, String degree, String major, String working_time, String benefit, String sex, String name_nd, String address_nd, String email_nd, String profile_language, String profile_requirement, String phone, String job_requirements, int quanlity, String type_of_work, String status, Date createDate) {
        this.id_account = id_account;
        this.id_category = id_category;
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
        this.sex = sex;
        this.name_nd = name_nd;
        this.address_nd = address_nd;
        this.email_nd = email_nd;
        this.profile_language = profile_language;
        this.profile_requirement = profile_requirement;
        this.phone = phone;
        Job_requirements = job_requirements;
        this.quanlity = quanlity;
        Type_of_work = type_of_work;
        Status = status;
        this.createDate = createDate;
    }

    public int getId_account() {
        return id_account;
    }

    public void setId_account(int id_account) {
        this.id_account = id_account;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName_nd() {
        return name_nd;
    }

    public void setName_nd(String name_nd) {
        this.name_nd = name_nd;
    }

    public String getAddress_nd() {
        return address_nd;
    }

    public void setAddress_nd(String address_nd) {
        this.address_nd = address_nd;
    }

    public String getEmail_nd() {
        return email_nd;
    }

    public void setEmail_nd(String email_nd) {
        this.email_nd = email_nd;
    }

    public String getProfile_language() {
        return profile_language;
    }

    public void setProfile_language(String profile_language) {
        this.profile_language = profile_language;
    }

    public String getProfile_requirement() {
        return profile_requirement;
    }

    public void setProfile_requirement(String profile_requirement) {
        this.profile_requirement = profile_requirement;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJob_requirements() {
        return Job_requirements;
    }

    public void setJob_requirements(String job_requirements) {
        Job_requirements = job_requirements;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public String getType_of_work() {
        return Type_of_work;
    }

    public void setType_of_work(String type_of_work) {
        Type_of_work = type_of_work;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
