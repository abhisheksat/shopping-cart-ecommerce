package com.shoppingcart.ecommerce.service.order;

import com.shoppingcart.ecommerce.dto.OrderDto;
import com.shoppingcart.ecommerce.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}