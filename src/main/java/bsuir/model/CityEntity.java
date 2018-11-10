package bsuir.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "city", schema = "logistic", catalog = "")
public class CityEntity {
    private long id;
    private String city;
//    private Collection<EntryRequisitionEntity> entryRequisitionsById;
//    private Collection<EntryRequisitionEntity> entryRequisitionsById_0;

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
    @Column(name = "city", nullable = false, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityEntity that = (CityEntity) o;
        return id == that.id &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city);
    }

//    @OneToMany(mappedBy = "cityByIdCityZ")
//    public Collection<EntryRequisitionEntity> getEntryRequisitionsById() {
//        return entryRequisitionsById;
//    }
//
//    public void setEntryRequisitionsById(Collection<EntryRequisitionEntity> entryRequisitionsById) {
//        this.entryRequisitionsById = entryRequisitionsById;
//    }
//
//    @OneToMany(mappedBy = "cityByIdCityR")
//    public Collection<EntryRequisitionEntity> getEntryRequisitionsById_0() {
//        return entryRequisitionsById_0;
//    }
//
//    public void setEntryRequisitionsById_0(Collection<EntryRequisitionEntity> entryRequisitionsById_0) {
//        this.entryRequisitionsById_0 = entryRequisitionsById_0;
//    }
}
