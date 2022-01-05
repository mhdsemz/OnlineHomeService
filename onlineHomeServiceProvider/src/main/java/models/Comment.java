package models;

import lombok.Data;
import models.member.Customer;
import models.member.Specialist;

import javax.persistence.*;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Specialist specialist;
}
