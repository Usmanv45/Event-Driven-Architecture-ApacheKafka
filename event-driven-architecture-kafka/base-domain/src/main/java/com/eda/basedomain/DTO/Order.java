package com.eda.basedomain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private  String orderId;
    private String orderName;
    private String orderStatus;
    private Double orderPrice;
}
