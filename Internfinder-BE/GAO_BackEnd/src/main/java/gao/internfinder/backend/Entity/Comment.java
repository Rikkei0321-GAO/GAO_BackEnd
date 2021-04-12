package gao.internfinder.backend.Entity;//package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "comment")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idcoment;

    public Integer getIdcoment() {
        return idcoment;
    }

    public void setIdcoment(Integer idcoment) {
        this.idcoment = idcoment;
    }

    public Share_experience getShare_experience() {
        return share_experience;
    }

    public void setShare_experience(Share_experience share_experience) {
        this.share_experience = share_experience;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getShare_idshare() {
        return share_idshare;
    }

    public void setShare_idshare(Integer share_idshare) {
        this.share_idshare = share_idshare;
    }

    public Comment(Integer idcoment, Share_experience share_experience, Account account, Date create_date, String content, Integer share_idshare) {
        this.idcoment = idcoment;
        this.share_experience = share_experience;
        this.account = account;
        this.create_date = create_date;
        this.content = content;
        this.share_idshare = share_idshare;
    }

    @ManyToOne
    @JoinColumn(name = "id_share")
    private Share_experience share_experience;

    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    private Date create_date;

    private String content;

    private Integer share_idshare;

    public Comment() {

    }


}
