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

    private  String fullName;

    private Date brithday;

    private  Boolean sex;

    private  String phone;

    private  String address;

    private  String email;

    private  String compyName;

    private  String taxCode;

    private  String link;

    private  String nameContact;

    private Boolean status;

    private String image;

    private String verificationCode;


}
