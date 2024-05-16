package au.edu.cqu.g4.userservice.proxies.dtos;

import au.edu.cqu.g4.userservice.shared_entities.Address;
import lombok.Data;

@Data
public class InsuranceCompanyDto {
    private String id;

    private String name;

    private Address address;

    private String description;
}
