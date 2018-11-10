package bsuir.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "logistic", catalog = "")
public class UserEntity {
    private long id;
    private String name;
    private int role;
    private String login;
    private String password;
    private int status;
//    private Collection<EntryRequisitionEntity> entryRequisitionsById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "role", nullable = false)
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Basic
    @Column(name = "login", nullable = false, length = 50)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                role == that.role &&
                status == that.status &&
                Objects.equals(name, that.name) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, login, password, status);
    }
//
//    @OneToMany(mappedBy = "userByIdUser")
//    public Collection<EntryRequisitionEntity> getEntryRequisitionsById() {
//        return entryRequisitionsById;
//    }
//
//    public void setEntryRequisitionsById(Collection<EntryRequisitionEntity> entryRequisitionsById) {
//        this.entryRequisitionsById = entryRequisitionsById;
//    }
}
