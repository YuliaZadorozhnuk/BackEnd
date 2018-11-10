package bsuir.dao;

import bsuir.model.CityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends CrudRepository<CityEntity,Long> {
}
