package bsuir.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "requisition", schema = "logistic", catalog = "")
public class RequisitionEntity {
    private long id;
    private long idEntryRequisition;
    private Long idDriver;
    private Long idDistance;
    private Double cost;
    private int status;
    private EntryRequisitionEntity entryRequisitionByIdEntryRequisition;
    private DriverEntity driverByIdDriver;
    private DistanceEntity distanceByIdDistance;

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
    @Column(name = "id_entry_requisition", nullable = false)
    public long getIdEntryRequisition() {
        return idEntryRequisition;
    }

    public void setIdEntryRequisition(long idEntryRequisition) {
        this.idEntryRequisition = idEntryRequisition;
    }

    @Basic
    @Column(name = "id_driver", nullable = true)
    public Long getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(Long idDriver) {
        this.idDriver = idDriver;
    }

    @Basic
    @Column(name = "id_distance", nullable = true)
    public Long getIdDistance() {
        return idDistance;
    }

    public void setIdDistance(Long idDistance) {
        this.idDistance = idDistance;
    }

    @Basic
    @Column(name = "cost", nullable = true, precision = 0)
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
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
        RequisitionEntity that = (RequisitionEntity) o;
        return id == that.id &&
                idEntryRequisition == that.idEntryRequisition &&
                status == that.status &&
                Objects.equals(idDriver, that.idDriver) &&
                Objects.equals(idDistance, that.idDistance) &&
                Objects.equals(cost, that.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idEntryRequisition, idDriver, idDistance, cost, status);
    }

    @ManyToOne
    @JoinColumn(name = "id_entry_requisition", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public EntryRequisitionEntity getEntryRequisitionByIdEntryRequisition() {
        return entryRequisitionByIdEntryRequisition;
    }

    public void setEntryRequisitionByIdEntryRequisition(EntryRequisitionEntity entryRequisitionByIdEntryRequisition) {
        this.entryRequisitionByIdEntryRequisition = entryRequisitionByIdEntryRequisition;
    }

    @ManyToOne
    @JoinColumn(name = "id_driver", referencedColumnName = "id", insertable = false, updatable = false)
    public DriverEntity getDriverByIdDriver() {
        return driverByIdDriver;
    }

    public void setDriverByIdDriver(DriverEntity driverByIdDriver) {
        this.driverByIdDriver = driverByIdDriver;
    }

    @ManyToOne
    @JoinColumn(name = "id_distance", referencedColumnName = "id", insertable = false, updatable = false)
    public DistanceEntity getDistanceByIdDistance() {
        return distanceByIdDistance;
    }

    public void setDistanceByIdDistance(DistanceEntity distanceByIdDistance) {
        this.distanceByIdDistance = distanceByIdDistance;
    }
}
