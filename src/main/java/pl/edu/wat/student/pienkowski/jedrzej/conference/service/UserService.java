package pl.edu.wat.student.pienkowski.jedrzej.conference.service;

import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.User;

public interface UserService {
    User findByUsername(String username);
}
