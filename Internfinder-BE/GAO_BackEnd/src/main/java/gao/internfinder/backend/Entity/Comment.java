package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "comment")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idcoment;

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
