package pl.edu.wat.student.pienkowski.jedrzej.conference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wat.student.pienkowski.jedrzej.conference.entity.User;
import pl.edu.wat.student.pienkowski.jedrzej.conference.service.UserService;
import pl.edu.wat.student.pienkowski.jedrzej.conference.validator.UserValidator;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class RegistrationController {

    @Autowired
    UserService userService;

    @Autowired
    UserValidator userValidator;

    @RequestMapping(value = "/registration", method = GET )
    public String showRegistration(){

        if(SecurityContextHolder.getContext().getAuthentication() != null &&
                SecurityContextHolder.getContext().getAuthentication().isAuthenticated() &&
                //when Anonymous Authentication is enabled
                !(SecurityContextHolder.getContext().getAuthentication()
                        instanceof AnonymousAuthenticationToken)  ){
            return "home";
        }
        return "registration";
    }


    @RequestMapping(value = "/registration", method = POST )
    public String registerNewUser(User user, BindingResult bindingResult){
        userValidator.validate(user, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(user);

        return "login";
    }
}
