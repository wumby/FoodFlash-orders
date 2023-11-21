package com.jack.order.service;

import com.jack.order.dto.OrderDTOFromFE;
import com.jack.order.dto.UserDTO;
import com.jack.order.entity.Order;
import com.jack.order.dto.OrderDTO;
import com.jack.order.mapper.OrderMapper;
import com.jack.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;

    public OrderDTO saveOrder(OrderDTOFromFE orderDetails) {
        Integer newOrderId = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchUserFromUserId(orderDetails.getUserId());

        Order orderToBeSaved = new Order(newOrderId, orderDetails.getFoodItemsDTOList(),orderDetails.getRestaurant(),userDTO);
        orderRepo.save(orderToBeSaved);

        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);

    }

    private UserDTO fetchUserFromUserId(Integer userId) {
        return restTemplate.getForObject("http://USER_SERVICE/user/getUserById/" + userId, UserDTO.class);

    }
}
