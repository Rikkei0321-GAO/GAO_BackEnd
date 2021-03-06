package gao.internfinder.backend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "account")
@Table(	name = "account",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_account;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "account_roles",
            joinColumns = @JoinColumn(name = "id_account"),
            inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "account")
    @JsonBackReference(value = "news")
    private Set<News> newsList;

    @OneToMany(mappedBy = "account")
    @JsonBackReference(value = "comment")
    private Set<Comment> commentList;

    @OneToMany(mappedBy = "account")
    @JsonBackReference(value = "Share_experience")
    private Set<Share_experience> share_experiencesList;

    @OneToMany(mappedBy = "account")
    @JsonBackReference(value = "pay")
    private Set<Pay> payList;

    @OneToMany(mappedBy = "account")
    @JsonBackReference(value = "Created_cv")
    private Set<Created_cv> created_cvList;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "sex")
    private Boolean sex;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "tax_code")
    private String taxCode;
    @Column(name = "link")
    private String link;
    @Column(name = "name_contact")
    private String nameContact;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "image")
    private String image;
    @Column(name = "verification_code")
    private String verificationCode;
    @Size(max = 120)
    private String company_address;
    @Size(max = 120)
    private String website;
    @Size(max = 120)
    private String email_contact;
    private String postion;

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public Account(Integer id_account, Set<Role> roles, Set<News> newsList, Set<Comment> commentList, Set<Share_experience> share_experiencesList, Set<Pay> payList, Set<Created_cv> created_cvList, String username, String password, Date createDate, String fullName, Date birthday, Boolean sex, String phone, String address, String email, String companyName, String taxCode, String link, String nameContact, Boolean status, String image, String verificationCode, @Size(max = 120) String company_address, @Size(max = 120) String website, @Size(max = 120) String email_contact, String postion) {
        this.id_account = id_account;
        this.roles = roles;
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
        this.company_address = company_address;
        this.website = website;
        this.email_contact = email_contact;
        this.postion = postion;
    }

    public Account(String username, String password, String email, String companyName, String phone, String company_address, String website, String taxCode) {
        this.username = username;
        this.password = password;
        this.companyName = companyName;
        this.company_address = company_address;
        this.taxCode = taxCode;
        this.phone = phone;
        this.website = website;
        this.email = email;
    }
    public Account(@NotBlank @Size(max = 50) String username, @NotBlank @Size(max = 50) @Email String email, @NotBlank @Size(max = 120) String password, @NotBlank @Size(max = 120) String address, @NotBlank @Size(max = 10) String phone) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
    public Account() {
    }

    public Integer getId_account() {
        return id_account;
    }

    public void setId_account(Integer id_account) {
        this.id_account = id_account;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail_contact() {
        return email_contact;
    }

    public void setEmail_contact(String email_contact) {
        this.email_contact = email_contact;
    }



}