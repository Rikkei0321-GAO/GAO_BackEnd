package gao.internfinder.backend.Entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "share_experience")
public class Share_experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idshare")
    private  Integer idshare;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "create_date")
    private Date create_date;
    @Column(name = "modife_date")
    private Date modife_date;
    @Column(name = "account_idAccount")
    private Integer account_idAccount;
    @Column(name = "account_role_id_role")
    private String account_role_id_role;

    public Share_experience() {

    }

    public Integer getIdshare() {
        return idshare;
    }

    public void setIdshare(Integer idshare) {
        this.idshare = idshare;
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

    public Share_experience(Integer idshare, String title, String content, Date create_date, Date modife_date, Integer account_idAccount, String account_role_id_role) {
        this.idshare = idshare;
        this.title = title;
        this.content = content;
        this.create_date = create_date;
        this.modife_date = modife_date;
        this.account_idAccount = account_idAccount;
        this.account_role_id_role = account_role_id_role;
    }
}
