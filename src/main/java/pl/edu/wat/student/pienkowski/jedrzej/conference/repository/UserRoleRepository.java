package pl.edu.wat.student.pienkowski.jedrzej.conference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
