package tr.ramazan.yesildag.first.service;

import tr.ramazan.yesildag.first.entity.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
    User save(User user);
}
