package models.member;

import lombok.*;
import models.service.Service;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Specialist extends User {
    @Lob
    @Column(name = "picture",nullable = false)
    private byte[] image;
    @ManyToMany(mappedBy = "specialists", fetch = FetchType.EAGER)
    private List<Service> services = new ArrayList<>();


}
