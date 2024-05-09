package au.edu.cqu.g4.userservice.entities.users;

import au.edu.cqu.g4.userservice.shared_entities.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("users")
public class User {

    @Id
    private String id;

    @Field("user_id")
    private String userId;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("dateOfBirth")
    private LocalDate dateOfBirth;

    private Address address;

    @Field("contact_number")
    private String contactNumber;

    @Field("insuranceCompany")
    private InsuranceCompany insuranceCompany;
}
