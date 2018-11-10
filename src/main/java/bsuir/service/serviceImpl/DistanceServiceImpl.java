package bsuir.service.serviceImpl;

import bsuir.dao.DistanceDao;
import bsuir.model.CityEntity;
import bsuir.model.DistanceEntity;
import bsuir.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {

    private DistanceDao distanceDao;

    @Override
    public DistanceEntity getDistance(CityEntity cityZ, CityEntity cityR) {
        String cities = cityZ.getCity() + '-' + cityR.getCity();
        return distanceDao.findByCities(cities);
    }

    @Autowired
    public void setDistanceDao(DistanceDao distanceDao) {
        this.distanceDao = distanceDao;
    }

}
