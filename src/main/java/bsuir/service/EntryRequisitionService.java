package bsuir.service;

import bsuir.model.CityEntity;
import bsuir.model.EntryRequisitionEntity;
import bsuir.model.SourceEntity;

import java.util.List;

public interface EntryRequisitionService {
    List<EntryRequisitionEntity> getAllEntryRequisitions();
    void createEntryRequisition(EntryRequisitionEntity entryRequisitionEntity);
    List<CityEntity> getAllCities();
    List<SourceEntity> getAllSource();
    void saveEntryRequisition(EntryRequisitionEntity entryRequisition);

}
