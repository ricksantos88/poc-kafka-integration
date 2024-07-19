package com.portal.api.service;

import com.portal.api.integrations.client.CarPostStoreClient;
import com.portal.api.domain.dto.CarPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public List<CarPostDTO> getCarForSales() {
        return carPostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO carPostDTO, String userId) {
        carPostStoreClient.changeCarForSaleClient(carPostDTO, userId);
    }

    @Override
    public void removeCarForSale(String carId) {
        carPostStoreClient.deleteCarForSaleClient(carId);
    }
}
