package gao.internfinder.backend.Entity;//package gao.internfinder.backend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;


@Entity(name = "payment_package")

public class Payment_package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idPaymentPackage;

    @OneToMany(mappedBy = "payment_package")
    @JsonBackReference
    private Set<Pay> payList;

    private String name;

    private Integer number_post;

    private Float pay_money;

    public Payment_package() {

    }

    public Payment_package(Integer idPaymentPackage, Set<Pay> payList, String name, Integer number_post, Float pay_money) {
        this.idPaymentPackage = idPaymentPackage;
        this.payList = payList;
        this.name = name;
        this.number_post = number_post;
        this.pay_money = pay_money;
    }

    public Integer getidPaymentPackage() {
        return idPaymentPackage;
    }

    public void setidPaymentPackage(Integer idpayment_package) {
        this.idPaymentPackage = idpayment_package;
    }

    public Set<Pay> getPayList() {
        return payList;
    }

    public void setPayList(Set<Pay> payList) {
        this.payList = payList;
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
}
