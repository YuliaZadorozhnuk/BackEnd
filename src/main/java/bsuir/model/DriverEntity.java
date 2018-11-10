package bsuir.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "driver", schema = "logistic", catalog = "")
public class DriverEntity {
    private long id;
    private String fio;
    private int rate;
    private int status;
//    private Collection<RequisitionEntity> requisitionsById;

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
    @Column(name = "fio", nullable = false, length = 50)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Basic
    @Column(name = "rate", nullable = false)
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
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
        DriverEntity that = (DriverEntity) o;
        return id == that.id &&
                rate == that.rate &&
                status == that.status &&
                Objects.equals(fio, that.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, rate, status);
    }

//    @OneToMany(mappedBy = "driverByIdDriver")
//    public Collection<RequisitionEntity> getRequisitionsById() {
//        return requisitionsById;
//    }
//
//    public void setRequisitionsById(Collection<RequisitionEntity> requisitionsById) {
//        this.requisitionsById = requisitionsById;
//    }
}
