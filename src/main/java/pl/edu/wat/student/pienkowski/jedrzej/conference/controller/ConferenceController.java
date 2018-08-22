package pl.edu.wat.student.pienkowski.jedrzej.conference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.Conference;
import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.Event;
import pl.edu.wat.student.pienkowski.jedrzej.conference.repository.ConferenceRepository;
import pl.edu.wat.student.pienkowski.jedrzej.conference.repository.EventRepository;

import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ConferenceController {

    private ConferenceRepository conferenceRepository;

    private EventRepository eventRepository;

    @Autowired
    public ConferenceController(ConferenceRepository conferenceRepository, EventRepository eventRepository){
        this.eventRepository = eventRepository;
        this.conferenceRepository = conferenceRepository;
    }
    @RequestMapping(value="/conference", method=POST)
    public String addConference(Conference conference, Map<String, Object> model){
        conferenceRepository.save(conference);
        List<Conference> conferences = conferenceRepository.findAll();
        model.put("conferences",conferences);
        return "conference-list";
    }

    @RequestMapping(value="/conference", method=GET)
    public String showConferenceList(Map<String, Object> model){
        List<Conference> conferences = conferenceRepository.findAll();
        model.put("conferences",conferences);
        //model.addAllAttributes(conferenceRepository.findAll());
        return "conference-list";
    }

    @RequestMapping(value = "/conference/{id}", method = POST)
    public String addEvent(@PathVariable String id, Event event, Map<String, Object>model){
        Conference conference = conferenceRepository.findById(Long.parseLong(id)).get();
        event.setConference(conference);
        eventRepository.save(event);
        return showConference(id,model);
    }

    @RequestMapping(value="/conference/{id}", method=GET)
    public String showConference(@PathVariable String id, Map<String, Object> model){
        Conference conference = conferenceRepository.findById(Long.parseLong(id)).get();
        List<Event> events = eventRepository.findAllByConferenceId(Long.parseLong(id));
        model.put("conference",conference);
        model.put("events",events);
        //model.addAllAttributes(conferenceRepository.findAll());
        return "conference";
    }

    @RequestMapping(value="/new-conference", method=GET)
    public String createConference(){

        return "new-conference";
    }

}
