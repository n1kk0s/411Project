package events;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nweld
 */

@RestController
public class InviteController {
    
    private InvitesView invites = new InvitesView();
    private String html;
    
    @RequestMapping("/invites")
    public String invites() {
        html = invites.createInvitesView();
        
        return html;
    }
    
}
