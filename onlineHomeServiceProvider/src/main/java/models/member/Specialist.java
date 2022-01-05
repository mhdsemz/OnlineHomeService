package models.member;

import lombok.Data;
import models.Service;
import models.member.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Specialist extends User {
    @Lob
    @Column(name = "picture",nullable = false)
    private byte[] image;
    @ManyToMany(mappedBy = "specialists", fetch = FetchType.EAGER)
    private List<Service> services = new ArrayList<>();
}
