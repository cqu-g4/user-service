package au.edu.cqu.g4.userservice.entities.users.dtos;

import au.edu.cqu.g4.userservice.shared_entities.Address;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Builder
public class CreateUserDto {
    private String id;
    private String userId;
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private String email;
    private String password;
    private Address address;
    private String contactNumber;
}
