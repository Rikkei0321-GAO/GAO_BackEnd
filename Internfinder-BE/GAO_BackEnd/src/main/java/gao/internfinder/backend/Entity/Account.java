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

    private String userName;

    private String passWord;

    private Date createDate;

    private String fullName;

    private Date brithday;

    private Boolean sex;

    private String phone;

    private String address;

    private String email;

    private String compyName;

    private String taxCode;

    private String link;

    private String nameContact;

    private Boolean status;

    private String image;

    private String verificationCode;

    public Account(Integer idAccount ,Set<AccountRole> accountRoleList ,Set<News> newsList, Set<Comment> commentList, Set<Share_experience> share_experiencesList,/* Set<Pay> payList, Set<Created_cv> created_cvList,*/ String userName, String passWord, Date createDate, String fullName, Date brithday, Boolean sex, String phone, String address, String email, String compyName, String taxCode, String link, String nameContact, Boolean status, String image, String verificationCode) {
        this.idAccount = idAccount;
        this.accountRoleList = accountRoleList;
        this.newsList = newsList;
        this.commentList = commentList;
        this.share_experiencesList = share_experiencesList;
        this.payList = payList;
        this.created_cvList = created_cvList;
        this.userName = userName;
        this.passWord = passWord;
        this.createDate = createDate;
        this.fullName = fullName;
        this.brithday = brithday;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.compyName = compyName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
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

    public String getCompyName() {
        return compyName;
    }

    public void setCompyName(String compyName) {
        this.compyName = compyName;
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
