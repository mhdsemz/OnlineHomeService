package dto;

import lombok.Data;
import models.Order;
import models.member.Customer;
@Data
public class CommentDto {
    private String comment;
    private Order order;
    private Customer customer;

}
