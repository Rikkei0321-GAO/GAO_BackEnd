package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomment")
    private Integer idcoment;
    @Column(name = "create_date")
    private Date create_date;
    @Column(name = "content")
    private String content;
    @Column(name = "share_idshare")
    private Integer share_idshare;

    public Comment() {

    }

    public Integer getIdcoment() {
        return idcoment;
    }

    public void setIdcoment(Integer idcoment) {
        this.idcoment = idcoment;
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

    public Comment(Integer idcoment, Date create_date, String content, Integer share_idshare) {
        this.idcoment = idcoment;
        this.create_date = create_date;
        this.content = content;
        this.share_idshare = share_idshare;
    }
}
