package events;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nweld
 */

@RestController
public class InviteController {
    
    @RequestMapping("/invites")
    public String invites() {
        return "View your invites";
    }
    
}
