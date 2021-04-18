package gao.internfinder.backend.Entity.EntityTrang;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(	name = "accounts",
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "email") 
		})
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 50)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
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

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "account_roles",
				joinColumns = @JoinColumn(name = "acc_id"),
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public Account() {
	}

	public Account(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Account(@NotBlank @Size(max = 50) String username, @NotBlank @Size(max = 50) @Email String email, @NotBlank @Size(max = 120) String password, @NotBlank @Size(max = 120) String address, @NotBlank @Size(max = 10) String phone) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phone = phone;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
