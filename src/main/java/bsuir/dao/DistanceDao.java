package bsuir.dao;

import bsuir.model.DistanceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DistanceDao extends CrudRepository<DistanceEntity,Long> {
    @Query("SELECT u FROM DistanceEntity u WHERE u.cityFromCityTo = :cities")
    DistanceEntity findByCities(@Param("cities") String cities);
}
