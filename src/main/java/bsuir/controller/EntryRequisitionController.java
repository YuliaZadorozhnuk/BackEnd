package bsuir.controller;

import bsuir.model.CityEntity;
import bsuir.model.EntryRequisitionEntity;
import bsuir.model.SourceEntity;
import bsuir.service.EntryRequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntryRequisitionController {

    private EntryRequisitionService entryRequisitionService;

    @RequestMapping("/entry-requisition")
    public List<EntryRequisitionEntity> getAllEntryRequisitions() {
        return entryRequisitionService.getAllEntryRequisitions();
    }

    @RequestMapping("/entry-requisition/create")
    public void createEntryRequisition(@RequestBody EntryRequisitionEntity entryRequisitionEntity) {
        entryRequisitionService.createEntryRequisition(entryRequisitionEntity);
    }

    @RequestMapping("/entry-requisition/city")
    public List<CityEntity> getAllCity() {
        return entryRequisitionService.getAllCities();
    }

    @RequestMapping("/entry-requisition/source")
    public List<SourceEntity> getAllSource() {
        return entryRequisitionService.getAllSource();
    }

    @RequestMapping(value = "/entry-requisition/save")
    public void saveEntryRequisition(@RequestBody EntryRequisitionEntity entryRequisition) {
        entryRequisitionService.saveEntryRequisition(entryRequisition);
    }

    @Autowired
    public void setEntryRequisitionService(EntryRequisitionService entryRequisitionService) {
        this.entryRequisitionService = entryRequisitionService;
    }

}
