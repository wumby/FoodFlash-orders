package com.jack.order.entity;

import com.jack.order.dto.UserDTO;
import com.jack.order.dto.FoodItemsDTO;
import com.jack.order.dto.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order {

    private Integer orderId;
    private List<FoodItemsDTO> foodItemsDTOList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
