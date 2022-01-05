package models;

import lombok.Data;
import models.member.Specialist;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Suggest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Specialist specialist;
    private double suggestedPrice;
    @CreationTimestamp
    private Date registrationDate;
    private int durationOfWork;
    @ManyToOne
    private Order order;
}
