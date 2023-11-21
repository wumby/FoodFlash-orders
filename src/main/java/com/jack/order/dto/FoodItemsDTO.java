package com.jack.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemsDTO {
    private int id;
    private String itemName;
    private String itemDescription;
    private boolean isVeg;
    private Number price;
    private Integer restaurantId;

    private Integer Quantity;
}
