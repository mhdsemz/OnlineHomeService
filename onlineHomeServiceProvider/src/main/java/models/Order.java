package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.enums.OrderStatus;
import models.member.Customer;
import models.member.Specialist;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Customer customer;
    @OneToMany
    private Specialist specialist;
    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private List<Suggest> suggests = new ArrayList<>();
    private String address;
    //subService
    private String description;
    private double suggestedPrice;
    @Enumerated(value = EnumType.STRING)
    private OrderStatus orderStatus;
    @CreationTimestamp
    private Date registrationDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDoDate;




}
