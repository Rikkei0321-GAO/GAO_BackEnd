package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "cv_apply")
public class Cv_apply {
    public  Cv_apply(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id_apply;
    @ManyToOne
    @JoinColumn(name = "id_news")
    private News news;
    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;
    private  String url;
    private Date create_date;

    public Integer getId_apply() {
        return id_apply;
    }

    public void setId_apply(Integer id_apply) {
        this.id_apply = id_apply;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Cv_apply(Integer id_apply, News news, Account account, String url, Date create_date) {
        this.id_apply = id_apply;
        this.news = news;
        this.account = account;
        this.url = url;
        this.create_date = create_date;
    }
}
