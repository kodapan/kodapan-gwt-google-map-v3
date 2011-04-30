package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#PanControlOptions
 *
 * position	ControlPosition	Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
 *
 * @author kalle
 * @since 2011-04-23 22.21
 */
public class PanControlOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected PanControlOptions() {
  }

  /**
   * Creation
   */
  public static native PanControlOptions newInstance() /*-{
    return {};
  }-*/;


  public final native ControlPosition getPosition() /*-{
     return this.position;
   }-*/;


   public final native void setPosition(ControlPosition value) /*-{
     this.position = value;
   }-*/;



}
