package bsuir.service.serviceImpl;

import bsuir.dao.DriverDao;
import bsuir.dao.RequisitionDao;
import bsuir.model.DriverEntity;
import bsuir.model.RequisitionEntity;
import bsuir.service.RequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("RequisitionService")
public class RequisitionServiceImpl implements RequisitionService {

    private RequisitionDao requisitionDao;

    private DriverDao driverDao;

    @Override
    @Transactional
    public List<RequisitionEntity> getAllRequisitions() {
        return  (List<RequisitionEntity>) requisitionDao.findAll();
    }

    @Override
    @Transactional
    public RequisitionEntity findRequisitionById(Long id) {
        return requisitionDao.findById(id).get();
    }

    @Override
    @Transactional
    public void saveRequisitionWithId(Long id) {
        RequisitionEntity requisition = new RequisitionEntity();
        requisition.setIdEntryRequisition(id);
        requisition.setStatus(0);
        requisitionDao.save(requisition);
    }

    @Override
    @Transactional
    public List<RequisitionEntity> getAllRequisitionsUser(Long idUser) {
        return requisitionDao.getAllRequisitionsUser(idUser);
    }

    @Override
    @Transactional
    public void acceptRequisition(RequisitionEntity requisitionEntity) {
        requisitionEntity.setStatus(1);
        requisitionDao.save(requisitionEntity);
        DriverEntity driverEntity = driverDao.findById(requisitionEntity.getIdDriver()).get();
        driverEntity.setStatus(0);
        driverDao.save(driverEntity);
    }

    @Autowired
    public void setDriverDao(DriverDao driverDao) {
        this.driverDao = driverDao;
    }

    @Autowired
    public void setRequisitionDao(RequisitionDao requisitionDao) {
        this.requisitionDao = requisitionDao;
    }
}
