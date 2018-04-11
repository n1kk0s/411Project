/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author nweld
 */
public class SignUpView {
    
    private String html;
    private Stylesheet stylesheet = new Stylesheet();
    private String styles = stylesheet.getStyles();
    
    public SignUpView() {
        
    }
    
    public String createSignUpView() {
        
        
        
        html = "<html>"
                + "<head>"
                + "<title>Sign Up</title>"
                + styles
                + "</head>"
                + "<body>"
                + "<div class='heading'>"
                + "<h1>Name of Application</h1>"
                + "<h3>Create an Account</h3>"
                + "<form>"
                + "<label for='userID'>Username</label><br>"
                + "<input class='formField' type='text' name='userID'><br>"
                + "<label for='fName'>First Name</label><br>"
                + "<input class='formField' type='text' name='fName'><br>"
                + "<label for='lName'>Last Name</label><br>"
                + "<input class='formField' type='text' name='lName'><br>"
                + "<label for='password'>Password</label><br>"
                + "<input class='formField' type='password' name='password'><br>"
                + "<label for='confirmPassword'>Confirm Password</label><br>"
                + "<input class='formField' type='password' name='confirmPassword'><br>"
                + "<input class='button' type='submit' name='submit' value='Sign Up'>"
                + "<h5>Already have an account? <a href='/'>Log in!</a></h5>"
                + "</form>"
                + "</div>"
                + "</body>"
                + "</html>";
        
        return html;
        
    }
    
}
