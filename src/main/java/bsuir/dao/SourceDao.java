package bsuir.dao;

import bsuir.model.SourceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceDao extends CrudRepository<SourceEntity,Long> {
}
