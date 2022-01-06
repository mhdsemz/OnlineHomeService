package models.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;
import models.Order;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends User {
    @OneToMany(mappedBy = "customer")
    private List<Order> orders=new ArrayList<>();


}
