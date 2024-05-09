package au.edu.cqu.g4.userservice.entities.users;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(String id);
    User save(User user);
    void deleteById(String id);
}
