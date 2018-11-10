package bsuir.service;

import bsuir.model.RequisitionEntity;

import java.util.List;

public interface RequisitionService {
    List<RequisitionEntity> getAllRequisitions();
    RequisitionEntity findRequisitionById(Long id);
    void saveRequisitionWithId(Long id);
    List<RequisitionEntity> getAllRequisitionsUser(Long idUser);
    void acceptRequisition(RequisitionEntity requisitionEntity);
}
