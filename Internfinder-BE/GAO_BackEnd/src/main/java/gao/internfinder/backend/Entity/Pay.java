package gao.internfinder.backend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pay")
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpay")
    private  Integer idpay;
    @Column(name = "number_posted")
    private Integer number_posted;
    @Column(name = "pay_date")
    private Date pay_date;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "account_idAccount")
    private Integer account_idAccount;
    @Column(name = "account_role_id_role")
    private String account_role_id_role;
    @Column(name = "payment_package_idpayment_package")
    private Integer payment_package_idpayment_package;

    public Pay() {

    }

    public Integer getIdpay() {
        return idpay;
    }

    public void setIdpay(Integer idpay) {
        this.idpay = idpay;
    }

    public Integer getNumber_posted() {
        return number_posted;
    }

    public void setNumber_posted(Integer number_posted) {
        this.number_posted = number_posted;
    }

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getAccount_idAccount() {
        return account_idAccount;
    }

    public void setAccount_idAccount(Integer account_idAccount) {
        this.account_idAccount = account_idAccount;
    }

    public String getAccount_role_id_role() {
        return account_role_id_role;
    }

    public void setAccount_role_id_role(String account_role_id_role) {
        this.account_role_id_role = account_role_id_role;
    }

    public Integer getPayment_package_idpayment_package() {
        return payment_package_idpayment_package;
    }

    public void setPayment_package_idpayment_package(Integer payment_package_idpayment_package) {
        this.payment_package_idpayment_package = payment_package_idpayment_package;
    }

    public Pay(Integer idpay, Integer number_posted, Date pay_date, Boolean status, Integer account_idAccount, String account_role_id_role, Integer payment_package_idpayment_package) {
        this.idpay = idpay;
        this.number_posted = number_posted;
        this.pay_date = pay_date;
        this.status = status;
        this.account_idAccount = account_idAccount;
        this.account_role_id_role = account_role_id_role;
        this.payment_package_idpayment_package = payment_package_idpayment_package;
    }
}
