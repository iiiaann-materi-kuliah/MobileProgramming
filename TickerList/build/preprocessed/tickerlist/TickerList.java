/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickerlist;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class TickerList extends MIDlet implements CommandListener
{
private Display display;
private List list;
private final String tech;
private final String entertain;
private Ticker ticker;
private Command exit;
private Command submit;

public TickerList()
{
display = Display.getDisplay(this);
tech = new String ("IBM 55 MSFT 32 SUN 52 CISCO 87");
entertain = new String ("CBS 75 ABC 455 NBC 243 GE 21");
exit = new Command("Exit", Command.SCREEN, 1);
submit = new Command("Submit", Command.SCREEN, 1);
ticker = new Ticker(tech);
list = new List("Stock Ticker", Choice.EXCLUSIVE);
list.append("Technology", null);
list.append("Entertainment", null);
list.addCommand(exit);
list.addCommand(submit);
list.setCommandListener(this);
list.setTicker(ticker);
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

public void commandAction(Command command, Displayable display)
{
if (command == exit)
{
destroyApp(true);
notifyDestroyed();
}
else if (command == submit)
{
if (list.getSelectedIndex() == 0)
{
ticker.setString (tech);
}
else
{
ticker.setString(entertain);
}
}
}
}

