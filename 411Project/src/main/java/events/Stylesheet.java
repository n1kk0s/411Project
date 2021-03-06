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
        
        // NOTE: These styles were copied in from a .css file, so they're ugly
        styles = "<style>"
                // Body styles
+ "body {" +
"  font-family: \"Helvetica\", \"Trebuchet\", \"Arial\", sans-serif;" +
"  margin: 0;" +
"  padding: 0;" +
"  color: #757575;" +
"  line-height: 1.5;" +
"}" +
"" +
"/* H2 Styles */" +
"h2 {" +
"  margin-top: 1rem;" +
"  padding-top: 1rem;" +
"}" +
"" +
"  /* H1, H2, Strong Styles */" +
" h1, h2, strong {" +
" color: #9C27B0;" +
" }" +
"" +
"  /* Button Styling */" +
" .button {" +
" display: block;" +
" text-decoration: none;" +
" text-align: center;" +
" margin-top: 1rem;" +
" margin-left: auto;" +
" padding: 10px 15px;" +
" width: 35%;" +
" color: white;" +
" background-color: #9C27B0; /*Dark */" +
" border: none;" +
" border-radius: 5px;" +
" }" +
"" +
"  /* Button Hover Styles */" +
" .button:hover, .accountButton:hover{" +
" background-color: #CE93D8;/* Light */" +
" -webkit-transition: 0.5s;" +
" transition: 0.5s;" +
" }" +
"" +
" .accountButton {" +
"  display: block;" +
"  margin: 0 auto;" +
"  padding: 10px 15px;" +
"  width: 35%;" +
"  color: white;" +
"  background-color: #9C27B0; /*Dark */" +
"  border: none;" +
"  border-radius: 5px;" +
" }" +
"" +
" #createSubmit {" +
"   margin-top: 1.5rem !important;" +
" }" +
"" +
"  /* FormField Styling */" +
" .formField {" +
" display: block;" +
" margin: 0 auto;" +
" padding: 10px 15px;" +
" width: 35%;" +
" border: solid 3px #CE93D8;" +
" border-radius: 5px;" +
" box-sizing: border-box;" +
" }" +
"" +
"  /* FormField Focus Styling */" +
" .formField:focus {" +
" outline: none;" +
" border: solid 3px #9C27B0;" +
" -webkit-transition: 0.5s;" +
" transition: 0.5s;" +
" }" +
"" +
"  /* Heading Div Styling */" +
" .heading {" +
" margin: 0 auto;" +
" width: 50rem;" +
" display: block;" +
" text-align: center;" +
" }" +
"" +
".panelDiv {" +
"  text-align: right;" +
"  display: inline-block;" +
"  float: left;" +
"  width: 20%;" +
"  height: 100vh;" +
"  border-right: solid 5px #9C27B0;" +
"  margin: 0;" +
"  padding-right: 1rem;" +
"}" +
"" +
".contentDiv {" +
"  display: inline-block;" +
"  float: right;" +
"  width: 78%;" +
"  height: 100vh;" +
"  margin: 0;" +
"  padding:" +
"  box-sizing: border-box;" +
"}" +
"" +
".eventDetails {" +
"  width: auto;" +
"  height: 100vh;" +
"  display: inline-block;" +
"  float: left;" +
"}" +
"" +
".eventList {" +
"  display: inline-block;" +
"  float: right;" +
"  width: 20%;" +
"  height: 100vh;" +
"  padding: 0;" +
"  padding-right: 2rem;" +
"  margin: 0;" +
"  border-left: solid 5px #9C27B0;" +
"  box-sizing: border-box;" +
"}" +
"" +
".cardHolder {" +
"  display:flex;" +
"  flex-wrap: wrap;" +
"  justify-content: center;" +
"}" +
"" +
"/* Card Styling */" +
".card {" +
"	background: #E0E0E0;" +
"	width: 12rem;" +
"	height: 12rem;" +
"	margin: 2rem;" +
"	border-radius: 5px;" +
"	box-shadow: 0px 2px 10px gray;" +
"	transition: all 0.3s ease-in-out;" +
"}" +
"" +
".card::after {" +
"width: 100%;" +
"height: 100%;" +
"opacity: 0;" +
"border-radius: 5px;" +
"box-shadow: 0 5px 15px gray;" +
"transition: opacity 0.3s ease-in-out;" +
"}" +
"" +
".card:hover {" +
"transform: scale(1.2, 1.2);" +
"box-shadow: 0px 12px 15px grey;" +
"}" +
"" +
".card:hover::after {" +
"	opacity: 1;" +
"}" +
"" +
"  /* Link Styling */" +
" a {" +
" color: #9C27B0;" +
" }" +
"" +
"  /* FormField Label Styling */" +
" label {" +
" text-align:left;" +
" margin-bottom: 0;" +
" padding-bottom: 0;" +
" }"
                
                + "</style>";
        
        return styles;
        
    }
    
}
