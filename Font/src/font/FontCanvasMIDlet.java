/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package font;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class FontCanvasMIDlet extends MIDlet {
public FontCanvasMIDlet() { // constructor
}
public void startApp() {
Canvas canvas = new FontCanvas();
Display display = Display.getDisplay(this);
display.setCurrent(canvas);
}
public void pauseApp() {
}
public void destroyApp(boolean unconditional) {
}
}

class FontCanvas extends Canvas {
public void paint(Graphics g) {
g.setColor(0xffffff);
g.fillRect(0, 0, getWidth(), getHeight());
g.setColor(0x000000);

g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN,
Font.SIZE_LARGE));
g.drawString("System Font", 0, 0, g.LEFT | g.TOP);
g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN,
Font.SIZE_MEDIUM));
g.drawString("Medium Size", 0, 15, g.LEFT | g.TOP);

g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_BOLD,
Font.SIZE_MEDIUM));
g.drawString("Bold Style", 0, 30, g.LEFT | g.TOP);
g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_ITALIC,
Font.SIZE_MEDIUM));
g.drawString("Italic Style", 0, 45, g.LEFT | g.TOP);
g.setFont(Font.getFont(Font.FACE_SYSTEM,
Font.STYLE_UNDERLINED, Font.SIZE_MEDIUM));
g.drawString("Underlined Style", 0, 60, g.LEFT | g.TOP);
}
}