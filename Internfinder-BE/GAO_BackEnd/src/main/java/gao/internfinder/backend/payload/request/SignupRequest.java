package gao.internfinder.backend.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
 
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    @Size(max = 120)
    private String address;
    @Size(max = 10)
    private String phone;

    @Size(max = 120)
    private String company_name;

    @Size(max = 120)
    private String company_address;

    @Size(max = 10)
    private String tax_code;

    @Size(max = 120)
    private String website;

    @Size(max = 50)
    private String name_contact;

    @Size(max = 120)
    private String email_contact;

    public SignupRequest(@NotBlank @Size(min = 3, max = 20) String username, @NotBlank @Size(max = 50) @Email String email, Set<String> role, @NotBlank @Size(min = 6, max = 40) String password, @NotBlank @Size(max = 120) String address, @NotBlank @Size(max = 10) String phone, @NotBlank @Size(max = 120) String company_name, @NotBlank @Size(max = 120) String company_address, @NotBlank @Size(max = 10) String tax_code, @NotBlank @Size(max = 120) String website, @NotBlank @Size(max = 50) String name_contact, @NotBlank @Size(max = 120) String email_contact) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.company_name = company_name;
        this.company_address = company_address;
        this.tax_code = tax_code;
        this.website = website;
        this.name_contact = name_contact;
        this.email_contact = email_contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getTax_code() {
        return tax_code;
    }

    public void setTax_code(String tax_code) {
        this.tax_code = tax_code;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getName_contact() {
        return name_contact;
    }

    public void setName_contact(String name_contact) {
        this.name_contact = name_contact;
    }

    public String getEmail_contact() {
        return email_contact;
    }

    public void setEmail_contact(String email_contact) {
        this.email_contact = email_contact;
    }

    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
    }
}
