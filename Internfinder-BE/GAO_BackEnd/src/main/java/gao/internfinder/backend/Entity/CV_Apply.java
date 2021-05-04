package gao.internfinder.backend.Entity;

import javax.persistence.*;

@Entity(name = "cv_apply")
public class CV_Apply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_apply;

    @ManyToOne
    @JoinColumn(name = "idNews")
    private News news;
    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    private String url;

    private String date;
}
