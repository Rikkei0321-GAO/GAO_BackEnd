package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private Integer idAccount;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String passWord;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "full_name")
    private  String fullName;
    @Column(name = "brithday")
    private Date brithday;
    @Column(name = "sex")
    private  Boolean sex;
    @Column(name = "phone")
    private  String phone;
    @Column(name = "address")
    private  String address;
    @Column(name = "email")
    private  String email;
    @Column(name = "company_Name")
    private  String compyName;
    @Column(name = "tax_code")
    private  String taxCode;
    @Column(name = "link")
    private  String link;
    @Column(name = "name_contact")
    private  String nameContact;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "role_id_role")
    private String roleID;
    public Account() {
    }

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
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

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public Account(Integer idAccount, String userName, String passWord, Date createDate, String fullName, Date brithday, Boolean sex, String phone, String address, String email, String compyName, String taxCode, String link, String nameContact, Boolean status, String roleID) {
        this.idAccount = idAccount;
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
        this.roleID = roleID;
    }
}
