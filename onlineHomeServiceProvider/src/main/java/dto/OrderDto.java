package dto;

import lombok.Data;
import models.enums.OrderStatus;
import models.member.Customer;

import java.util.Date;
@Data
public class OrderDto {
    private OrderStatus orderStatus;
    private double finalPrice;
    private double suggestedPrice;
    private Date registrationDate;
    private Customer customer;
    private String address;
}
