package oracle.forms.sensis;


import oracle.forms.engine.Main;
import oracle.forms.handler.IHandler;
import oracle.forms.properties.ID;
import oracle.forms.ui.VBean;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Ein Beispiel wie man das Icon einer Forms Anwendung setzen kann
 * @author Alexander Schröders
 */
public class IconPjc extends VBean {
    protected static final ID pSetIcon = ID.registerProperty("SET_FORMS_ICON");

    private IHandler mHandler = null;
    private Frame formsFrame = null;
    private Main formsMain = null;

    public final void init(IHandler handler) {
        mHandler = handler;
        super.init(handler);

        formsMain = mHandler.getApplet();
        formsFrame = formsMain.getFrame();
    }

    public boolean setProperty(ID pId, Object pValue) {

        if (pId == pSetIcon){
            set_program_icon((String) pValue);
            return true;
        }

        return super.setProperty(pId, pValue);
    }

    /**
     * Lädt das Icon aus der CodeBase und setzt es im formsFrame
     * @param iconName der Dateiname des Icons
     */
    public void set_program_icon(String iconName) {

        if (iconName != null && !iconName.isEmpty()) {

            //CodeBase aus den Einstellungen laden (hier könnte auch die ImageBase verwendet werden)
            String imagePath = formsMain.getCodeBase().toString();

            //versuch das Icon zu laden und zu setzen
            try{
                Image image = new ImageIcon(new URL(imagePath + iconName)).getImage();
                formsFrame.setIconImage(image);
            }catch (Exception e) {
                System.out.println("Fehler beim laden des Icons: " + e.getMessage());
            }
        }else{
            System.out.println("Fehler beim setzen des Icons: Es wurde kein Icon angegeben");
        }
    }
}