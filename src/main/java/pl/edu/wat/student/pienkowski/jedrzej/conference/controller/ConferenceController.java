package pl.edu.wat.student.pienkowski.jedrzej.conference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.Conference;
import pl.edu.wat.student.pienkowski.jedrzej.conference.repository.ConferenceRepository;

import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ConferenceController {

    private ConferenceRepository conferenceRepository;

    @Autowired
    public ConferenceController(ConferenceRepository conferenceRepository){
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

    @RequestMapping(value="/new-conference", method=GET)
    public String crateConference(){

        return "new-conference";
    }
}
