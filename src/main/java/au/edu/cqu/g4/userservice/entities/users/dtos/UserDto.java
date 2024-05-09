package au.edu.cqu.g4.userservice.entities.users.dtos;

import au.edu.cqu.g4.userservice.entities.users.InsuranceCompany;
import au.edu.cqu.g4.userservice.shared_entities.Address;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Data
@Builder
public class UserDto {

    private String id;

    private String userId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private Address address;

    private String contactNumber;

    private InsuranceCompany insuranceCompany;
}
