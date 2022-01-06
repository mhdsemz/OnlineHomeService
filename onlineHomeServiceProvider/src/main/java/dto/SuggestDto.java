package dto;

import models.Order;
import models.member.Specialist;

import java.util.Date;

public class SuggestDto {
    private Order order;
    private Specialist specialist;
    private double suggestedPrice;
    private Date registrationDate;
    private int durationOfWork;
}
