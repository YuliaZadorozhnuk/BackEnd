package bsuir.controller;

import bsuir.Dto.Dto;
import bsuir.model.DistanceEntity;
import bsuir.model.RequisitionEntity;
import bsuir.service.DistanceService;
import bsuir.service.RequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequisitionController {

    private RequisitionService requisitionService;
    private DistanceService distanceService;

    @RequestMapping("/requisition")
    public List<RequisitionEntity> getRequisitions() {
        return requisitionService.getAllRequisitions();
    }

    @RequestMapping(value = "/requisition/{id}")
    public RequisitionEntity getRequisition(@PathVariable Long id) {
        return requisitionService.findRequisitionById(id);
    }

    @RequestMapping(value = "/requisition/save/{id}")
    public void saveRequisition(@PathVariable Long id) {
        requisitionService.saveRequisitionWithId(id);
    }

    @RequestMapping(value = "/requisition/user/{idUser}")
    public List<RequisitionEntity> getAllRequsitionByIdUser(@PathVariable Long idUser) {
        return requisitionService.getAllRequisitionsUser(idUser);
    }

    @RequestMapping(value = "/requisition/distance")
    public DistanceEntity getDistance(@RequestBody Dto dto) {
        return distanceService.getDistance(dto.getCityZ(), dto.getCityR());
    }

    @RequestMapping(value = "/requisition/accept")
    public void acceptRequisition(@RequestBody RequisitionEntity requisitionEntity) {
        requisitionService.acceptRequisition(requisitionEntity);
    }

    @Autowired
    public void setRequisitionService(RequisitionService requisitionService) {
        this.requisitionService = requisitionService;
    }

    @Autowired
    public void setDistanceService(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

}
