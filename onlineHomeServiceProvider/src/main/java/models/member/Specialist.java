package models.member;

import lombok.*;
import lombok.experimental.SuperBuilder;
import models.service.Service;
import models.service.SubService;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Specialist extends User {
    @Lob
    @Column(name = "picture",nullable = false)
    private byte[] image;
    @ManyToMany(mappedBy = "specialists", fetch = FetchType.EAGER)
    private List<SubService> services = new ArrayList<>();
}
