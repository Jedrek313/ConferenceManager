package pl.edu.wat.student.pienkowski.jedrzej.conference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.User;

public interface UserRepository  extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
