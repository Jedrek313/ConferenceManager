package pl.edu.wat.student.pienkowski.jedrzej.conference.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.Event;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    Event findByName(String name);
    List<Event> findAllByConferenceId(Long conferenceId);
}
