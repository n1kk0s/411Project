package events;

/**
 *
 * @author Nick Weld
 */
public class LoginView {
    
    private String html;
    private Stylesheet stylesheet = new Stylesheet();
    private String styles = stylesheet.getStyles();
    
    public LoginView() {
        
    }
    
    public String createLoginView() {
        
        
        
        html = "<html>"
                + "<head>"
                + "<title>Log In</title>"
                + styles
                + "</head>"
                + "<body>"
                + "<div class='heading'>"
                + "<h1>Name of Application</h1>"
                + "<form>"
                + "<input class='formField' type='text' name='userID' placeholder='Username'><br>"
                + "<input class='formField' type='password' name='password'><br>"
                + "<input class='button' type='submit' name='submit' value='Log In'>"
                + "</div>"
                + "</body>"
                + "</html>";
        
        return html;
        
    }
    
}
