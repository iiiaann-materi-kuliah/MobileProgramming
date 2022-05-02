/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class RectangleExample extends MIDlet
{
    private Display display;
    private MyCanvas canvas;
    public RectangleExample ()
{
    display = Display.getDisplay(this);
    canvas = new MyCanvas (this);
}
protected void startApp()
{
    display.setCurrent( canvas );
}

protected void pauseApp()
{
}
protected void destroyApp( boolean unconditional )
{
}
public void exitMIDlet()
{
destroyApp(true);
notifyDestroyed();
}
}

class MyCanvas extends Canvas implements CommandListener
{
private Command exit;
private RectangleExample rectangleExample;
public MyCanvas (RectangleExample rectangleExample)
{
this.rectangleExample = rectangleExample;
exit = new Command("Exit", Command.EXIT, 1);
addCommand(exit);
setCommandListener(this);
}

protected void paint(Graphics graphics)
{
graphics.setColor(255,255,255);
graphics.fillRect(0, 0, getWidth(), getHeight());
graphics.setColor(255,0,0);
graphics.drawRect(2, 2, 20, 20);
graphics.drawRoundRect(20, 20, 60, 60, 15, 45);
}
public void commandAction(Command command, Displayable
displayable) {
if (command == exit)
{
rectangleExample.exitMIDlet();
}
}
}