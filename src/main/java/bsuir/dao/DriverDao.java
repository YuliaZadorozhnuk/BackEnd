package bsuir.dao;

import bsuir.model.DriverEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverDao extends CrudRepository<DriverEntity,Long> {
}
