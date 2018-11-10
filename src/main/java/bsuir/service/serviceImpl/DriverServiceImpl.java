package bsuir.service.serviceImpl;

import bsuir.dao.DriverDao;
import bsuir.model.DriverEntity;
import bsuir.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("DriversService")
public class DriverServiceImpl implements DriverService {

    private DriverDao driverDao;

    @Override
    @Transactional
    public List<DriverEntity> getAllDrivers() {
        return (List<DriverEntity>) driverDao.findAll();
    }

    @Override
    @Transactional
    public void changeStatus(DriverEntity driver) {
        if (driver.getStatus() == 1) {
            driver.setStatus(0);
        } else {
            driver.setStatus(1);
        }
        driverDao.save(driver);
    }

    @Override
    @Transactional
    public void deleteDriver(Long id) {
        driverDao.deleteById(id);
    }

    @Override
    @Transactional
    public void saveDriver(DriverEntity driver) {
        driver.setStatus(1);
        driverDao.save(driver);
    }

    @Override
    @Transactional
    public void editDriver(DriverEntity driver) {
        driverDao.save(driver);
    }

    @Autowired
    public void setDriverDao(DriverDao driverDao) {
        this.driverDao = driverDao;
    }

}
