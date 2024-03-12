package model.prCompany;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Embeddable
public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String salutation;
}
