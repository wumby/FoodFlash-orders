package com.jack.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {


    private Integer orderId;
    private List<FoodItemsDTO> foodItemsDTOList;
    private Restaurant restaurant;
    private UserDTO userDTO;
}
