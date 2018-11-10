package bsuir.service.serviceImpl;

import bsuir.dao.CityDao;
import bsuir.dao.EntryRequisitionDao;
import bsuir.dao.RequisitionDao;
import bsuir.dao.SourceDao;
import bsuir.model.CityEntity;
import bsuir.model.EntryRequisitionEntity;
import bsuir.model.RequisitionEntity;
import bsuir.model.SourceEntity;
import bsuir.service.EntryRequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("EntryRequisitionService")
public class EntryRequisitionServiceImpl implements EntryRequisitionService {

    private EntryRequisitionDao entryRequisitionDao;
    private RequisitionDao requisitionDao;
    private CityDao cityDao;
    private SourceDao sourceDao;

    @Override
    public List<EntryRequisitionEntity> getAllEntryRequisitions() {
        return (List<EntryRequisitionEntity>) entryRequisitionDao.findAll();
    }

    @Override
    public void createEntryRequisition(EntryRequisitionEntity entryRequisitionEntity) {
        entryRequisitionDao.save(entryRequisitionEntity);
    }

    @Override
    public List<CityEntity> getAllCities() {
        return (List<CityEntity>) cityDao.findAll();
    }

    @Override
    public List<SourceEntity> getAllSource() {
        return (List<SourceEntity>) sourceDao.findAll();
    }

    @Override
    @Transactional
    public void saveEntryRequisition(EntryRequisitionEntity entryRequisition) {
        entryRequisitionDao.save(entryRequisition);
        RequisitionEntity requisition = new RequisitionEntity();
        requisition.setIdEntryRequisition(entryRequisition.getId());
        requisitionDao.save(requisition);
    }

    @Autowired
    public void setEntryRequisitionDao(EntryRequisitionDao entryRequisitionDao) {
        this.entryRequisitionDao = entryRequisitionDao;
    }

    @Autowired
    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Autowired
    public void setSourceDao(SourceDao sourceDao) {
        this.sourceDao = sourceDao;
    }

    @Autowired
    public void setRequisitionDao(RequisitionDao requisitionDao) {
        this.requisitionDao = requisitionDao;
    }

}
