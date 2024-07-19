package com.portal.api.service;

import com.portal.api.domain.dto.CarPostDTO;

import java.util.List;

public interface CarPostStoreService {

    List<CarPostDTO> getCarForSales();
    void changeCarForSale(CarPostDTO carPostDTO, String userId);
    void removeCarForSale(String carId);
}
