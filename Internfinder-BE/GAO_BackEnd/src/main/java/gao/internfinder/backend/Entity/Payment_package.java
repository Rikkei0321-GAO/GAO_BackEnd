package gao.internfinder.backend.Entity;

import javax.persistence.*;


@Entity
@Table(name = "payment_package")
public  class Payment_package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpayment_package")
    private Integer idpayment_package;
    @Column(name = "name")
    private String name;
    @Column(name = "number_post")
    private Integer number_post;
    @Column(name = "pay_money")
    private Float  pay_money;

    public Payment_package() {

    }

    public Integer getIdpayment_package() {
        return idpayment_package;
    }

    public void setIdpayment_package(Integer idpayment_package) {
        this.idpayment_package = idpayment_package;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber_post() {
        return number_post;
    }

    public void setNumber_post(Integer number_post) {
        this.number_post = number_post;
    }

    public Float getPay_money() {
        return pay_money;
    }

    public void setPay_money(Float pay_money) {
        this.pay_money = pay_money;
    }

    public Payment_package(Integer idpayment_package, String name, Integer number_post, Float pay_money) {
        this.idpayment_package = idpayment_package;
        this.name = name;
        this.number_post = number_post;
        this.pay_money = pay_money;
    }
}
