package gao.internfinder.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
    public Role() {
    }

    public Role(String idRole, String name) {
        this.idRole = idRole;
        this.name = name;
    }

    @Id
    @Column(name = "id_role")
    private String idRole;
    @Column(name = "name")
    private String name;
    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
