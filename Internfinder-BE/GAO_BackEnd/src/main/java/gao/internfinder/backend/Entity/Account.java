package gao.internfinder.backend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAccount;
    @OneToMany(mappedBy = "account")
    @JsonBackReference
    private Set<AccountRole> accountRoleList;

    @OneToMany(mappedBy = "account")
    @JsonBackReference
    private Set<News> newsList;

    @OneToMany(mappedBy = "account")
    @JsonBackReference
    private Set<Comment> commentList;

    @OneToMany(mappedBy = "account")
    @JsonBackReference
    private Set<Share_experience> share_experiencesList;

    @OneToMany(mappedBy = "account")
    @JsonBackReference
    private Set<Pay> payList;

    @OneToMany(mappedBy = "account")
    @JsonBackReference
    private Set<Created_cv> created_cvList;

    private String username;

    private String password;

    private Date createDate;

    private String fullName;

    private Date birthday;

    private Boolean sex;

    private String phone;

    private String address;

    private String email;

    private String companyName;

    private String taxCode;

    private String link;

    private String nameContact;

    private Boolean status;

    private String image;

    private String verificationCode;

    public Account(Integer idAccount, Set<AccountRole> accountRoleList, Set<News> newsList, Set<Comment> commentList, Set<Share_experience> share_experiencesList, Set<Pay> payList, Set<Created_cv> created_cvList, String username, String password, Date createDate, String fullName, Date birthday, Boolean sex, String phone, String address, String email, String companyName, String taxCode, String link, String nameContact, Boolean status, String image, String verificationCode) {
        this.idAccount = idAccount;
        this.accountRoleList = accountRoleList;
        this.newsList = newsList;
        this.commentList = commentList;
        this.share_experiencesList = share_experiencesList;
        this.payList = payList;
        this.created_cvList = created_cvList;
        this.username = username;
        this.password = password;
        this.createDate = createDate;
        this.fullName = fullName;
        this.birthday = birthday;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.companyName = companyName;
        this.taxCode = taxCode;
        this.link = link;
        this.nameContact = nameContact;
        this.status = status;
        this.image = image;
        this.verificationCode = verificationCode;
    }

    public Account() {

    }

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    public Set<AccountRole> getAccountRoleList() {
        return accountRoleList;
    }

    public void setAccountRoleList(Set<AccountRole> accountRoleList) {
        this.accountRoleList = accountRoleList;
    }

    public Set<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(Set<News> newsList) {
        this.newsList = newsList;
    }

    public Set<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(Set<Comment> commentList) {
        this.commentList = commentList;
    }

    public Set<Share_experience> getShare_experiencesList() {
        return share_experiencesList;
    }

    public void setShare_experiencesList(Set<Share_experience> share_experiencesList) {
        this.share_experiencesList = share_experiencesList;
    }

    public Set<Pay> getPayList() {
        return payList;
    }

    public void setPayList(Set<Pay> payList) {
        this.payList = payList;
    }

    public Set<Created_cv> getCreated_cvList() {
        return created_cvList;
    }

    public void setCreated_cvList(Set<Created_cv> created_cvList) {
        this.created_cvList = created_cvList;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
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

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
