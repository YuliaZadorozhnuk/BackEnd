package bsuir.service;

import bsuir.model.CityEntity;
import bsuir.model.DistanceEntity;

public interface DistanceService {
    DistanceEntity getDistance(CityEntity cityZ, CityEntity cityR);
}
