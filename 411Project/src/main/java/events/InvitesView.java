package events;

/**
 *
 * @author nweld
 */
public class InvitesView {
    
    private String html;
    private Stylesheet stylesheet = new Stylesheet();
    private String styles = stylesheet.getStyles();
    
    public InvitesView() {
        
    }
    
    public String createInvitesView() {
        
        
        
        html = "<html>"
                + "<head>"
                + "<title>Invites</title>"
                + styles
                + "</head>"
                + "<body>"
                + "<h1>View your invitations</h1>"
                + "</body>"
                + "</html>";
        
        return html;
        
    }
    
}
