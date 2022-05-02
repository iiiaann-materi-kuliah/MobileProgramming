/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbox;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class TextBoxCapture extends MIDlet implements
CommandListener
{
private Display display;
private TextBox textbox;
private Command submit;
private Command exit;

public TextBoxCapture()
{
display = Display.getDisplay(this);
submit = new Command("Submit", Command.SCREEN, 1);
exit = new Command("Exit", Command.EXIT, 1);
textbox = new TextBox("First Name:", "", 30, TextField.ANY);
textbox.addCommand(exit);
textbox.addCommand(submit);
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
displayable)
{
if (command == submit)
{
textbox.setString("Hello, " + textbox.getString());
textbox.removeCommand(submit);
}
else if (command == exit)
{
destroyApp(false);
notifyDestroyed();
}
}
}