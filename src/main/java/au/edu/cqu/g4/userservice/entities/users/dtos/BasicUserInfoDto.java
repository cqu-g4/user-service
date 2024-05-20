package au.edu.cqu.g4.userservice.entities.users.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BasicUserInfoDto {
    private String id;
    private String name;
}
