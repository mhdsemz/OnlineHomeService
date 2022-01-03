package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Specialist extends User {
    private byte[] image;
    @ManyToMany(mappedBy = "specialists", fetch = FetchType.EAGER)
    private List<Service> services = new ArrayList<>();
}
