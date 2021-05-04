package gao.internfinder.backend.dto;

import java.util.Date;

public class ApplyDto {
    private int id_account;
    private int id_news;
    private Date date;
    private String url;

    public int getId_account() {
        return id_account;
    }

    public void setId_account(int id_account) {
        this.id_account = id_account;
    }

    public int getId_news() {
        return id_news;
    }

    public void setId_news(int id_news) {
        this.id_news = id_news;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ApplyDto(int id_account, int id_news, Date date, String url) {
        this.id_account = id_account;
        this.id_news = id_news;
        this.date = date;
        this.url = url;
    }
}
