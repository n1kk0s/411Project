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
                + "<label for='userID'>Username</label><br>"
                + "<input class='formField' type='text' name='userID'><br>"
                + "<label for='password'>Password</label><br>"
                + "<input class='formField' type='password' name='password'><br>"
                + "<input class='button' type='submit' name='submit' value='Log In'>"
                + "<h5>Don't have an account? <a href='/signup'>Create one!</a></h5>"
                + "</form>"
                + "</div>"
                + "</body>"
                + "</html>";
        
        return html;
        
    }
    
}
