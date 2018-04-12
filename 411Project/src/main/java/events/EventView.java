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
public class EventView {
    
    private String html;
    private Stylesheet stylesheet = new Stylesheet();
    private String styles = stylesheet.getStyles();
    
    public EventView() {
        
    }
    
    public String createEventView() {
        
        
        
        html =  "<!DOCTYPE html>" +
                "<head>" +
                "  <title>events.getName()</title>" +
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
                "" +
                "    <div class='eventDetails'>" +
                "      <div class='heading'>" +
                "        <h1 class='heading'>event.getName()</h1>" +
                "        <h3>Hosted by: owner.getfName()</h3>" +
                "        <h4>Date | Time | Location</h4>" +
                "      </div>" +
                "      <p>" +
                "        Description of event" +
                "      </p>" +
                "    </div>" +
                "" +
                "    <div class='eventList'>" +
                "      <ul>" +
                "        <li>Item 1</li>" +
                "        <li>Item 2</li>" +
                "        <li>Item 3</li>" +
                "      </ul>" +
                "    </div>" +
                "" +
                "  </div>" +
                "" +
                "</body>" +
                "</html>";
        
        return html;
        
    }
    
}
