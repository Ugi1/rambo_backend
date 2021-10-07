package tr.ramazan.yesildag.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.ramazan.yesildag.first.entity.User;
import tr.ramazan.yesildag.first.repository.UserRepository;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
