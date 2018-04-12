/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author Nick Weld
 */
public class CreateEventView {
    
    private String html;
    private Stylesheet stylesheet = new Stylesheet();
    private String styles = stylesheet.getStyles();
    
    public CreateEventView() {
        
    }
    
    public String createCreateEventView() {
        
        
        
        html =  "<!DOCTYPE html>" +
                "<head>" +
                "  <title>Create Event</title>" +
                styles +
                "</head>" +
                "<body>" +
                "" +
                "  <div class='panelDiv'>" +
                "    <h2>user.getfName()</h2>" +
                "    <a class='button' href='/invites'>View Invites</a>" +
                "    <a class='button' href='/events'>Your Events</a>" +
                "    <a class='button' href='/create'>Create Event</a>" +
                "    <a class='button' href='/'>Log Out</a>" +
                "  </div>" +
                "" +
                "  <div class='contentDiv'>" +
                "    <div class='heading'>" +
                "      <h1 class='heading'>Create an Event</h1>" +
                "    <form>" +
                "      <label for='eventName'>Event Name</label>" +
                "      <input class='formField' type='text' name='eventName' placeholder=\"Zach's Birthday\" required><br>" +
                "        <label for='date'>Date and Time</label>" +
                "      <input class='formField' type='datetime-local' name='date' required><br>" +
                "        <label for='location'>Location</label>" +
                "      <input class='formField' type='text' name='location' placeholder=\"123 Street, Home City, PA\" required><br>" +
                "        <label for='description'>Description</label>" +
                "      <textarea class='formField' name='description' required></textarea><br>" +
                "        <label for='guests'>Guests</label>" +
                "      <input class='formField' type='text' name='guests' placeholder=\"Separate usernames with commas\" required>" +
                "      <input id='createSubmit' class='accountButton' type='submit' value=\"Create Event\">" +
                "    </form>" +
                "" +
                "    </div>" +
                "  </div>" +
                "  </div>" +
                "" +
                "</body>" +
                "</html>";
        
        return html;
        
    }
    
}
