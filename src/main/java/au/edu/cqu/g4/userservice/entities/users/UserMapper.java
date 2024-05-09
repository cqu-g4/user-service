package au.edu.cqu.g4.userservice.entities.users;

import au.edu.cqu.g4.userservice.entities.users.dtos.CreateUserDto;
import au.edu.cqu.g4.userservice.entities.users.dtos.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDto dto) {
        return User.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .address(dto.getAddress())
                .insuranceCompany(dto.getInsuranceCompany())
                .dateOfBirth(dto.getDateOfBirth())
                .userId(dto.getUserId())
                .address(dto.getAddress())
                .contactNumber(dto.getContactNumber())
                .build();
    }

    public UserDto toDto(User dto) {
        return UserDto.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .address(dto.getAddress())
                .insuranceCompany(dto.getInsuranceCompany())
                .dateOfBirth(dto.getDateOfBirth())
                .userId(dto.getUserId())
                .address(dto.getAddress())
                .contactNumber(dto.getContactNumber())
                .build();
    }

    public User toEntityFromCreateDto(CreateUserDto dto, String userId) {
        return User.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .address(dto.getAddress())
                .contactNumber(dto.getContactNumber())
                .dateOfBirth(dto.getDateOfBirth())
                .userId(userId)
                .build();
    }

    public CreateUserDto toCreateTherapyProviderDto(User user) {
        return CreateUserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .address(user.getAddress())
                .contactNumber(user.getContactNumber())
                .dateOfBirth(user.getDateOfBirth())
                .userId(user.getUserId())
                .build();
    }
}
