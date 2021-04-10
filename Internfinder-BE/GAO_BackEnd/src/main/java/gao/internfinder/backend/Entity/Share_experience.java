package gao.internfinder.backend.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "share_experience")

public class Share_experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Integer idshare;

    @OneToMany(mappedBy = "share_experience")
    @JsonBackReference
    private Set<Comment> commentList;

    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    private String title;

    private String content;

    private Date create_date;

    private Date modife_date;

    private Integer account_idAccount;

    private String account_role_id_role;

    public Share_experience() {

    }

}
