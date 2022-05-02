/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class DisplayCheckColor extends MIDlet implements CommandListener
{
private Display display;
private Form form;
private TextBox textbox;
private Command exit;
public DisplayCheckColor() {
display = Display.getDisplay(this);
exit = new Command("Exit", Command.SCREEN, 1);
String message=null;

if (display.isColor()) {
message="Color display.";
}
else
{
message="No color display";
}
textbox= new TextBox("Check Colors", message, 17, 0);
textbox.addCommand(exit);
textbox.setCommandListener(this);
}
public void startApp()
{
display.setCurrent(textbox);
}

public void pauseApp()
{
}
public void destroyApp(boolean unconditional)
{
}
public void commandAction(Command command, Displayable
displayable) {
if (command == exit) {
destroyApp(true);
notifyDestroyed();
}
}
}