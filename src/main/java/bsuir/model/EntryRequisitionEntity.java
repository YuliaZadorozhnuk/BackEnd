package bsuir.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "entry_requisition", schema = "logistic", catalog = "")
public class EntryRequisitionEntity {
    private long id;
    private long idUser;
    private String customer;
    private String person;
    private long phone;
    private String email;
    private String notes;
    private long idCityZ;
    private long idCityR;
    private Date dateZ;
    private Date dateR;
    private String cargo;
    private int weight;
    private int volume;
    private String pto;
    private long idSource;
    private UserEntity userByIdUser;
    private CityEntity cityByIdCityZ;
    private CityEntity cityByIdCityR;
    private SourceEntity sourceByIdSource;
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
    @Column(name = "idUser", nullable = false)
    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "customer", nullable = false, length = 50)
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "person", nullable = false, length = 100)
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Basic
    @Column(name = "phone", nullable = false)
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "notes", nullable = false, length = 250)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "idCityZ", nullable = false)
    public long getIdCityZ() {
        return idCityZ;
    }

    public void setIdCityZ(long idCityZ) {
        this.idCityZ = idCityZ;
    }

    @Basic
    @Column(name = "idCityR", nullable = false)
    public long getIdCityR() {
        return idCityR;
    }

    public void setIdCityR(long idCityR) {
        this.idCityR = idCityR;
    }

    @Basic
    @Column(name = "dateZ", nullable = false)
    public Date getDateZ() {
        return dateZ;
    }

    public void setDateZ(Date dateZ) {
        this.dateZ = dateZ;
    }

    @Basic
    @Column(name = "dateR", nullable = false)
    public Date getDateR() {
        return dateR;
    }

    public void setDateR(Date dateR) {
        this.dateR = dateR;
    }

    @Basic
    @Column(name = "cargo", nullable = false, length = 50)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "weight", nullable = false)
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "volume", nullable = false)
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Basic
    @Column(name = "PTO", nullable = false, length = 50)
    public String getPto() {
        return pto;
    }

    public void setPto(String pto) {
        this.pto = pto;
    }

    @Basic
    @Column(name = "id_source", nullable = false)
    public long getIdSource() {
        return idSource;
    }

    public void setIdSource(long idSource) {
        this.idSource = idSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntryRequisitionEntity that = (EntryRequisitionEntity) o;
        return id == that.id &&
                idUser == that.idUser &&
                phone == that.phone &&
                idCityZ == that.idCityZ &&
                idCityR == that.idCityR &&
                weight == that.weight &&
                volume == that.volume &&
                idSource == that.idSource &&
                Objects.equals(customer, that.customer) &&
                Objects.equals(person, that.person) &&
                Objects.equals(email, that.email) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(dateZ, that.dateZ) &&
                Objects.equals(dateR, that.dateR) &&
                Objects.equals(cargo, that.cargo) &&
                Objects.equals(pto, that.pto) &&
                Objects.equals(userByIdUser, that.userByIdUser) &&
                Objects.equals(cityByIdCityZ, that.cityByIdCityZ) &&
                Objects.equals(cityByIdCityR, that.cityByIdCityR) &&
                Objects.equals(sourceByIdSource, that.sourceByIdSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idUser, customer, person, phone, email, notes, idCityZ, idCityR, dateZ, dateR, cargo, weight, volume, pto, idSource, userByIdUser, cityByIdCityZ, cityByIdCityR, sourceByIdSource);
    }

    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public UserEntity getUserByIdUser() {
        return userByIdUser;
    }

    public void setUserByIdUser(UserEntity userByIdUser) {
        this.userByIdUser = userByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "idCityZ", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public CityEntity getCityByIdCityZ() {
        return cityByIdCityZ;
    }

    public void setCityByIdCityZ(CityEntity cityByIdCityZ) {
        this.cityByIdCityZ = cityByIdCityZ;
    }

    @ManyToOne
    @JoinColumn(name = "idCityR", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public CityEntity getCityByIdCityR() {
        return cityByIdCityR;
    }

    public void setCityByIdCityR(CityEntity cityByIdCityR) {
        this.cityByIdCityR = cityByIdCityR;
    }

    @ManyToOne
    @JoinColumn(name = "id_source", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public SourceEntity getSourceByIdSource() {
        return sourceByIdSource;
    }

    public void setSourceByIdSource(SourceEntity sourceByIdSource) {
        this.sourceByIdSource = sourceByIdSource;
    }

//    @OneToMany(mappedBy = "entryRequisitionByIdEntryRequisition")
//    public Collection<RequisitionEntity> getRequisitionsById() {
//        return requisitionsById;
//    }
//
//    public void setRequisitionsById(Collection<RequisitionEntity> requisitionsById) {
//        this.requisitionsById = requisitionsById;
//    }
}
