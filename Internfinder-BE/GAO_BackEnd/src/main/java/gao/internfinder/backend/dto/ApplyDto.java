package gao.internfinder.backend.dto;

import java.util.Date;

public class ApplyDto {
    public int id_apply;
    public int id_news;
    public int id_account;
    public String url;
    public Date create_date;

    public ApplyDto(int id_apply, int id_news, int id_account, String url, Date create_date) {
        this.id_apply = id_apply;
        this.id_news = id_news;
        this.id_account = id_account;
        this.url = url;
        this.create_date = create_date;
    }
}
