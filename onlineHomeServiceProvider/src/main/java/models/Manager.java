package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Manager {
    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String password;
}
