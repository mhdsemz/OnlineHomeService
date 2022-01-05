package models;

import lombok.Data;
import models.member.Specialist;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private double price;
    @ManyToMany()
    private List<Specialist> specialists=new ArrayList<>();
}
