package events;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nweld
 */

@RestController
public class EventController {
    
    private LoginView login = new LoginView();
    private String html;
    
    @RequestMapping("/")
    public String login() {
        html = login.createLoginView();
        
        return html;
    }
    
    @RequestMapping("/create")
    public String create() {
        return "Create an event";
    }
    
    @RequestMapping("/events")
    public String events() {
        return "View your created events";
    }
    
    @RequestMapping("/party")
    public String party() {
        return "View a party's details";
    }
    
}
