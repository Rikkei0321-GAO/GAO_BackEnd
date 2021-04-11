package gao.internfinder.backend.Entity;//package gao.internfinder.backend.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "share_experience")

public class Share_experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idshare;

    @OneToMany(mappedBy = "share_experience")
    @JsonBackReference
    private Set<Comment> commentList;

    public Integer getIdshare() {
        return idshare;
    }

    public void setIdshare(Integer idshare) {
        this.idshare = idshare;
    }

    public Set<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(Set<Comment> commentList) {
        this.commentList = commentList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModife_date() {
        return modife_date;
    }

    public void setModife_date(Date modife_date) {
        this.modife_date = modife_date;
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

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public Share_experience(Integer idshare, Set<Comment> commentList, Account account, String title, String content, Date create_date, Date modife_date, Integer account_idAccount, String account_role_id_role, String image_path) {
        this.idshare = idshare;
        this.commentList = commentList;
        this.account = account;
        this.title = title;
        this.content = content;
        this.create_date = create_date;
        this.modife_date = modife_date;
        this.account_idAccount = account_idAccount;
        this.account_role_id_role = account_role_id_role;
        this.image_path = image_path;
    }

    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    private String title;

    private String content;

    private Date create_date;

    private Date modife_date;

    private Integer account_idAccount;

    private String account_role_id_role;

    private String image_path;

    public Share_experience() {

    }

}
