package events;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nweld
 */

@RestController
public class EventController {
    
    @RequestMapping("/")
    public String index() {
        return "This is the index";
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
