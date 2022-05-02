/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayalert;

import javax.microedition.midlet.*;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class DisplayAlert extends MIDlet implements CommandListener
{
private Display display;
private Alert alert;
private Form form;
private Command exit;
private boolean exitFlag;
public DisplayAlert()
{
exitFlag = false;
display = Display.getDisplay(this);
exit = new Command("Exit", Command.SCREEN, 1);
form = new Form("Throw Exception");
form.addCommand(exit);
form.setCommandListener(this);
}

public void startApp()
{
display.setCurrent(form);
}
public void pauseApp()
{
}
public void destroyApp(boolean unconditional)
throws MIDletStateChangeException {
if (unconditional == false)
{
throw new MIDletStateChangeException();
}
}

public void commandAction(Command command, Displayable
displayable)
{
if (command == exit)
{
try
{
if (exitFlag == false)
{
alert = new Alert("Busy", "Please try again.", null,

AlertType.WARNING);
alert.setTimeout(Alert.FOREVER);
display.setCurrent(alert, form);
destroyApp(false);
}

else
{
destroyApp(true);
notifyDestroyed();
}
}
catch (MIDletStateChangeException exception)
{
exitFlag = true;
}
}
}
}