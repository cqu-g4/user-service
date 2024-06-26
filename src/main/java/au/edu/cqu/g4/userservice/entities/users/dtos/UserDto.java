package au.edu.cqu.g4.userservice.entities.users.dtos;

import au.edu.cqu.g4.userservice.entities.users.InsuranceCompany;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserDto {

    private String id;

    private String userId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String address;

    private String contactNumber;

    private InsuranceCompany insuranceCompany;
}
