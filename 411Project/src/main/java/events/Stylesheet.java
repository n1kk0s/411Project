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
                +"color: #757575;"
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
                + "color: #9C27B0;"
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
                + "background-color: #CE93D8;"// Light
                + "-webkit-transition: 0.5s;"
                + "transition: 0.5s;"
                + "}"
                // FormField Styling
                + ".formField {"
                + "display: block;"
                + "margin: 0 auto;"
                + "padding: 10px 15px;"
                + "width: 35%;"
                + "border: solid 3px #CE93D8;"
                + "border-radius: 5px;"
                + "box-sizing: border-box;"
                + "}"
                // FormField Focus Styling
                + ".formField:focus {"
                + "outline: none;"
                + "border: solid 3px #9C27B0;"
                + "-webkit-transition: 0.5s;"
                + "transition: 0.5s;"
                + "}"
                // Heading Div Styling
                + ".heading {"
                + "margin: 0 auto;"
                + "display: block;"
                + "text-align: center;"
                + "}"
                // Link Styling
                + "a {"
                + "color: #9C27B0;"
                + "}"
                // FormField Label Styling
                + "label {"
                + "text-align:left;"
                + "margin-bottom: 0;"
                + "padding-bottom: 0;"
                + "}"
                
                + "</style>";
        
        return styles;
        
    }
    
}
