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
    private SignUpView signup = new SignUpView();
    private CreateEventView create = new CreateEventView();
    private EventView event = new EventView();
    private YourEventsView yourEvents = new YourEventsView();
    private String html;
    
    @RequestMapping("/")
    public String login() {
        html = login.createLoginView();
        
        return html;
    }
    
    @RequestMapping("/signup")
    public String signUp() {
        html = signup.createSignUpView();
        
        return html;
    }
    
    @RequestMapping("/create")
    public String create() {
        html = create.createCreateEventView();
        return html;
    }
    
    @RequestMapping("/events")
    public String events() {
        html = yourEvents.createYourEventsView();
        
        return html;
    }
    
    @RequestMapping("/event")
    public String event() {
        html = event.createEventView();
        
        return html;
    }
    
}
