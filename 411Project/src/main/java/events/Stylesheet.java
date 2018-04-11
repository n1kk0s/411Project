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
                // Body styles
                + "body {"
                + "margin: 0 auto;"
                +"width: 50rem;"
                +"font-family: \"Helvetica\", \"Trebuchet\", \"Arial\", sans-serif;"
                +"color: #fefefe;"
                +"line-height: 1.5;"
                +"padding:4rem 1rem;"
                +"}"
                // H2 Styles
                +"h2 {"
                +"margin-top: 1rem;"
                +"padding-top: 1rem;"
                +"}"
                // H1, H2, Strong Styles
                +"h1, h2, strong {"
                +"color: #333;"
                +"}"
                // Button Styling
                + ".button {"
                + "display: block;"
                + "margin: 0 auto;"
                + "padding: 10px 15px;"
                + "width: 35%;"
                + "color: white;"
                + "background-color: #9C27B0;" //Dark
                + "border: none;"
                + "border-radius: 5px;"
                + "}"
                // Button Hover Styles
                + ".button:hover {"
                + "background-color: #AB47BC;"// Light
                + "}"
                // FormField Styling
                + ".formField {"
                + "display: block;"
                + "margin: 0 auto;"
                + "padding: 10px 15px;"
                + "width: 35%;"
                + "border: solid 3px #AB47BC;"
                + "border-radius: 5px;"
                + "box-sizing: border-box;"
                + "}"
                // FormField Focus Styling
                + ".formField:focus {"
                + "outline: none;"
                + "border: solid 3px #9C27B0;"
                + "-webkit-transition: 0.5s"
                + "}"
                // Heading Div Styling
                + ".heading {"
                + "margin: 0 auto;"
                + "display: block;"
                + "text-align: none;"
                + "color: #9C27B0;"
                
                + "</style>";
        
        return styles;
        
    }
    
}
