package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#StreetViewControlOptions
 *
 * position	ControlPosition	Position id. Used to specify the position of the control on the map. The default position is embedded within the navigation (zoom and pan) controls. If this position is empty or the same as that specified in the zoomControlOptions or panControlOptions, the Street View control will be displayed as part of the navigation controls. Otherwise, it will be displayed separately.
 *
 * @author kalle
 * @since 2011-04-23 22.21
 */
public class StreetViewControlOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected StreetViewControlOptions() {
  }

  /**
   * Creation
   */
  public static native StreetViewControlOptions newInstance() /*-{
    return {};
  }-*/;


  public final native ControlPosition getPosition() /*-{
     return this.position;
   }-*/;


   public final native void setPosition(ControlPosition value) /*-{
     this.position = value;
   }-*/;



}
