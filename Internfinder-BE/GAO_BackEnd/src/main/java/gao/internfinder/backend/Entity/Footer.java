package gao.internfinder.backend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "footer")
public class Footer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfooter")
    private Integer idfooter;
    @Column(name = "content")
    private  String content;
    @Column(name = "status")
    private  Boolean status;

    public Footer() {

    }

    public Integer getIdfooter() {
        return idfooter;
    }

    public void setIdfooter(Integer idfooter) {
        this.idfooter = idfooter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Footer(Integer idfooter, String content, Boolean status) {
        this.idfooter = idfooter;
        this.content = content;
        this.status = status;
    }
}
