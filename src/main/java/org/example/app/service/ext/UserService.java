package org.example.app.service.ext;

import org.example.app.entity.User;
import org.example.app.service.BaseService;

import java.util.List;

public interface UserService extends BaseService<User> {
    void save(User user);
    List<User> fetchAll();
    User fetchById(Long id);
    void delete(Long id);
}
