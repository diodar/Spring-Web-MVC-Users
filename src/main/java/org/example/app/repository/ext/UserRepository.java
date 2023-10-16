package org.example.app.repository.ext;

import org.example.app.entity.User;
import org.example.app.repository.BaseRepository;

import java.util.List;

public interface UserRepository extends BaseRepository<User> {
    void save(User user);
    List<User> fetchAll();
    User fetchById(Long id);
    void delete(Long id);
}
