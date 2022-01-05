package models.service;

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
    @Column(unique = true)
    private String name;
    //checkout
    @ManyToMany()
    private List<Specialist> specialists = new ArrayList<>();
    @OneToMany
    private List<SubService> services = new ArrayList<>();
}
