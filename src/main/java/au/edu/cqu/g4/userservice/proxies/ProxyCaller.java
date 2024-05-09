package au.edu.cqu.g4.userservice.proxies;

import au.edu.cqu.g4.userservice.entities.users.dtos.CreateUserDto;
import au.edu.cqu.g4.userservice.proxies.dtos.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProxyCaller {

    private final AuthProxy authProxy;

    public UserRegistrationDto createUser(CreateUserDto dto) {
        return authProxy.createUser(
                UserRegistrationDto.builder()
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                        .firstName(dto.getFirstName())
                        .lastName(dto.getLastName())
                        .role("USER")
                        .build()
        );
    }
}
