package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.member.Customer;
import models.member.Specialist;

import javax.persistence.*;
@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
