package events;

/**
 *
 * @author nweld
 */
public class Invite {

    private String inviteID;
    private String eventID;
    private String userID;
    private String rsvp;

    /**
     * @return the inviteID
     */
    public String getInviteID() {
        return inviteID;
    }

    /**
     * @param inviteID the inviteID to set
     */
    public void setInviteID(String inviteID) {
        this.inviteID = inviteID;
    }

    /**
     * @return the eventID
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * @param eventID the eventID to set
     */
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the rsvp
     */
    public String getRsvp() {
        return rsvp;
    }

    /**
     * @param rsvp the rsvp to set
     */
    public void setRsvp(String rsvp) {
        this.rsvp = rsvp;
    }

}
