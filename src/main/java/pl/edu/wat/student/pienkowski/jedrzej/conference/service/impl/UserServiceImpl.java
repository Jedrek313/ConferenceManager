package pl.edu.wat.student.pienkowski.jedrzej.conference.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.User;
import pl.edu.wat.student.pienkowski.jedrzej.conference.repository.UserRepository;
import pl.edu.wat.student.pienkowski.jedrzej.conference.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
