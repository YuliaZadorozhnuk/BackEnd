package bsuir.dao;

import bsuir.model.EntryRequisitionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRequisitionDao extends CrudRepository<EntryRequisitionEntity,Long> {
}
