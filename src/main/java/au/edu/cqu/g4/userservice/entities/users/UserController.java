package au.edu.cqu.g4.userservice.entities.users;

import au.edu.cqu.g4.userservice.entities.users.dtos.CreateUserDto;
import au.edu.cqu.g4.userservice.entities.users.dtos.UserDto;
import au.edu.cqu.g4.userservice.exceptions.CustomBackendException;
import au.edu.cqu.g4.userservice.proxies.ProxyCaller;
import au.edu.cqu.g4.userservice.proxies.dtos.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class UserController {

    private final ProxyCaller caller;
    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping
    public ResponseEntity<CreateUserDto> create(@RequestBody CreateUserDto dto) {
        UserRegistrationDto userRegistrationDto = caller.createUser(dto);
        User user = userService.save(userMapper.toEntityFromCreateDto(dto, userRegistrationDto.getUserId()));
        CreateUserDto createUserDto = userMapper.toCreateTherapyProviderDto(user);
        createUserDto.setEmail(dto.getEmail());
        return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> assignInsuranceCompany(@RequestBody InsuranceCompany insuranceCompany, @PathVariable String id) {
        User user = userService.getById(id);
        if(user == null) throw new CustomBackendException("User not found");

        user.setInsuranceCompany(insuranceCompany);
        UserDto dto = userMapper.toDto(userService.save(user));
        return new ResponseEntity<>(dto, HttpStatus.OK);

    }
}
