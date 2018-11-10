package bsuir.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "distance", schema = "logistic", catalog = "")
public class DistanceEntity {
    private long id;
    private String cityFromCityTo;
    private double distance;
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
    @Column(name = "city_from_city_to", nullable = false, length = 50)
    public String getCityFromCityTo() {
        return cityFromCityTo;
    }

    public void setCityFromCityTo(String cityFromCityTo) {
        this.cityFromCityTo = cityFromCityTo;
    }

    @Basic
    @Column(name = "distance", nullable = false, precision = 0)
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DistanceEntity that = (DistanceEntity) o;
        return id == that.id &&
                Double.compare(that.distance, distance) == 0 &&
                Objects.equals(cityFromCityTo, that.cityFromCityTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cityFromCityTo, distance);
    }

//    @OneToMany(mappedBy = "distanceByIdDistance")
//    public Collection<RequisitionEntity> getRequisitionsById() {
//        return requisitionsById;
//    }
//
//    public void setRequisitionsById(Collection<RequisitionEntity> requisitionsById) {
//        this.requisitionsById = requisitionsById;
//    }
}
