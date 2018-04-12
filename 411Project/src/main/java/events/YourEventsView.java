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
public class YourEventsView {
    
    private String html;
    private Stylesheet stylesheet = new Stylesheet();
    private String styles = stylesheet.getStyles();
    
    public YourEventsView() {
        
    }
    
    public String createYourEventsView() {
        
        
        
        html =  "<!DOCTYPE html>" +
                "<head>" +
                "  <title>Your Events</title>" +
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
                "      <h1 class='heading'>Your Events</h1>" +
                "    </div>" +
                "    <div class='cardHolder'>" +
                "      <div class='card'>" +
                "        <h3>Generate</h3>" +
                "        <h4>With</h4>" +
                "        <h5>Loop</h5>" +
                "      </div>" +
                "  </div>" +
                "  </div>" +
                "" +
                "</body>" +
                "</html>";
        
        return html;
        
    }
    
}
