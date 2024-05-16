package au.edu.cqu.g4.userservice.proxies;

import au.edu.cqu.g4.userservice.entities.users.dtos.CreateUserDto;
import au.edu.cqu.g4.userservice.proxies.dtos.InsuranceCompanyDto;
import au.edu.cqu.g4.userservice.proxies.dtos.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProxyCaller {

    private final AuthProxy authProxy;
    private final AdminProxy adminProxy;

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

    public InsuranceCompanyDto getInsuranceCompanyById(String id) {
        return adminProxy.getById(id);
    }
}
