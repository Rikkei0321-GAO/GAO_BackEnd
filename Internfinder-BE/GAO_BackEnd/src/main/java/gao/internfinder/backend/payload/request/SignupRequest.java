package gao.internfinder.backend.payload.request;

import java.util.Date;

public class SignupRequest {
    private String username;

    private String password;

    private Date createDate;

    private String fullName;

    private Date birthday;

    private Boolean sex;

    private String phone;

    private String address;

    private String email;

    private String nameCompany;

    private String tax;

    private String link;

    private String nameContact;

    private Boolean status;

    private String image;

    public SignupRequest() {
    }

    public SignupRequest(String username, String password, Date createDate, String fullName, Date birthday, Boolean sex, String phone, String address, String email, String nameCompany, String tax, String link, String nameContact, Boolean status, String image) {
        this.username = username;
        this.password = password;
        this.createDate = createDate;
        this.fullName = fullName;
        this.birthday = birthday;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.nameCompany = nameCompany;
        this.tax = tax;
        this.link = link;
        this.nameContact = nameContact;
        this.status = status;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
