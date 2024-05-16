package au.edu.cqu.g4.userservice.proxies;


import au.edu.cqu.g4.userservice.proxies.dtos.InsuranceCompanyDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "ADMIN-SERVICE", path = "admin")
public interface AdminProxy {

    @GetMapping("/insurance_companies/{id}")
    InsuranceCompanyDto getById(@PathVariable String id);
}
