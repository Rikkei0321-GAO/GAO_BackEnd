package gao.internfinder.backend.dto;

import java.util.Date;

public class ShareExDTO {
    Integer idshare;
    Integer id_account;
    String title;
    String content;
    Date create_date;
    Date modife_date;
    String image_path;

    public Integer getIdshare() {
        return idshare;
    }

    public void setIdshare(Integer idshare) {
        this.idshare = idshare;
    }

    public Integer getId_account() {
        return id_account;
    }

    public void setId_account(Integer id_account) {
        this.id_account = id_account;
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

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public ShareExDTO() {

    }

}

