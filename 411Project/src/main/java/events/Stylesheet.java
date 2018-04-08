package events;

/**
 *
 * @author nweld
 */
public class Stylesheet {
    
    private String styles;
    
    public Stylesheet() {
        
        
        
    }
    
    public String getStyles() {
        
        styles = "<style>"
                + "body {"
                + "margin: 0 auto;"
                +"width: 50rem;"
                +"font-family: \"Helvetica\", \"Trebuchet\", \"Arial\", sans-serif;"
                +"color: #555;"
                +"line-height: 1.5;"
                +"padding:4rem 1rem;"
                +"}"
                +"h2 {"
                +"margin-top: 1rem;"
                +"padding-top: 1rem;"
                +"}"
                +"h1, h2, strong {"
                +"color: #333;"
                +"}"
                + "</style>";
        
        return styles;
        
    }
    
}
