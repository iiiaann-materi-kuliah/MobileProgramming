/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.microedition.midlet.*; // MIDP
import javax.microedition.lcdui.*; //MIDP
/**
* Our first application in J2ME
*/
public class HelloFromJ2ME extends MIDlet implements
CommandListener {
// Class String is from java.io, which is in CLDC...
String s = "Hello From J2ME";
private Command quit; // The Quit button
private Display ourDisplay; // Declaring the display
private Form ourForm = null;
public HelloFromJ2ME() {
ourDisplay = Display.getDisplay(this);
quit = new Command("Quit", Command.SCREEN, 2);
}

//Create a TextField and associate with it the quit button and the listener.
public void startApp() {
ourForm = new Form("Our First");
TextField ourField = new TextField("J2ME Application", s, 256, 0);
ourForm.append(ourField);
ourForm.addCommand(quit);
ourForm.setCommandListener(this);
ourDisplay.setCurrent(ourForm);
}
public void pauseApp() {
}
public void destroyApp(boolean unconditional) {
}
public void commandAction(Command c, Displayable s) {
if (c == quit) {
destroyApp(false);
notifyDestroyed();
}
}
}