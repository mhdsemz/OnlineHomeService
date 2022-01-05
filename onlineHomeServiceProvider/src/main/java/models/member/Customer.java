package models.member;

import lombok.Data;
import models.Order;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Customer extends User {
    @OneToMany(mappedBy = "customer")
    private List<Order> orders=new ArrayList<>();
}