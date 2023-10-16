package org.example.app.service.impl;

import jakarta.transaction.Transactional;
import org.example.app.entity.User;
import org.example.app.repository.ext.UserRepository;
import org.example.app.service.ext.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    @Transactional
    public void save(User user) {
        repository.save(user);
    }

    @Override
    @Transactional
    public List<User> fetchAll() {
        return repository.fetchAll();
    }

    @Override
    @Transactional
    public User fetchById(Long id) {
        return repository.fetchById(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.delete(id);
    }
}
