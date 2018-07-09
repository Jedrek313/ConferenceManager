package pl.edu.wat.student.pienkowski.jedrzej.conference.service;

import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
