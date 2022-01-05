package models;

import lombok.Data;
import models.member.Customer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Customer customer;
    @OneToMany
    private List<Suggest> suggests = new ArrayList<>();

}
