package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.member.Specialist;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Suggest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Specialist specialist;
    private double suggestedPrice;
    @CreationTimestamp
    private Date registrationDate;
    private long durationOfWork;
    @ManyToOne
    private Order order;
    private int startTime;


}
