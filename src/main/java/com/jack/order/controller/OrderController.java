package com.jack.order.controller;

import com.jack.order.dto.OrderDTO;
import com.jack.order.dto.OrderDTOFromFE;
import com.jack.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDetails){
       OrderDTO orderSaved = orderService.saveOrder(orderDetails);
       return new ResponseEntity<>(orderSaved, HttpStatus.CREATED);
    }


}
