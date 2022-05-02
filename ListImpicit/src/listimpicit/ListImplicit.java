/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listimpicit;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class ListImplicit extends MIDlet implements CommandListener
{
private Display display;
private List list;
private Command exit;
Alert alert;
public ListImplicit()
{
display = Display.getDisplay(this);
exit = new Command("Exit", Command.EXIT, 1);
list = new List("Menu:", List.IMPLICIT);
list.append("New",null);
list.append("Open",null);
list.addCommand(exit);
list.setCommandListener(this);
}

public void startApp()
{
display.setCurrent(list);
}
public void pauseApp()
{
}
public void destroyApp(boolean unconditional)
{
}

public void commandAction(Command command, Displayable displayable)
{
if (command == List.SELECT_COMMAND)
{
String selection = list.getString(list.getSelectedIndex());
alert = new Alert("Option Selected", selection, null, null);
alert.setTimeout(Alert.FOREVER);
alert.setType(AlertType.INFO);
display.setCurrent(alert);
}
else if (command == exit)
{
destroyApp(false);
notifyDestroyed();
}
}
}

