package bsuir.dao;

import bsuir.model.RequisitionEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequisitionDao extends CrudRepository<RequisitionEntity,Long> {
    @Query("select u from RequisitionEntity u where u.entryRequisitionByIdEntryRequisition.idUser = :id order by u.id")
    List<RequisitionEntity> getAllRequisitionsUser(@Param("id") Long id);
}
