package gao.internfinder.backend.dto;


import java.util.Date;

public class CommentDTO {
    Integer idcoment;
    Integer id_account;
    Integer id_share;
    String content;
    Date create_date;
    public CommentDTO(){

    }

    public Integer getIdcoment() {
        return idcoment;
    }

    public void setIdcoment(Integer idcoment) {
        this.idcoment = idcoment;
    }

    public Integer getId_account() {
        return id_account;
    }

    public void setId_account(Integer id_account) {
        this.id_account = id_account;
    }

    public Integer getId_share() {
        return id_share;
    }

    public void setId_share(Integer id_share) {
        this.id_share = id_share;
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
}
