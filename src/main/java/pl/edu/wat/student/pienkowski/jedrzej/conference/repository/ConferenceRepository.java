package pl.edu.wat.student.pienkowski.jedrzej.conference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.Conference;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
