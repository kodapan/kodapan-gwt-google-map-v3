package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#StreetViewAddressControlOptions
 *
 * position	ControlPosition	Position id. This id is used to specify the position of the control on the map. The default position is TOP_LEFT.
 * style	  Object.	        CSS styles to apply to the Street View address control. For example, {backgroundColor: 'red'}.
 *
 * @author kalle
 * @since 2011-04-23 22.21
 */
public class StreetViewAddressControlOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected StreetViewAddressControlOptions() {
  }

  /**
   * Creation
   */
  public static native StreetViewAddressControlOptions newInstance() /*-{
    return {};
  }-*/;

  public final native String getStyle() /*-{
     return this.style;
   }-*/;


   public final native void setStyle(String value) /*-{
     this.style = value;
   }-*/;

  public final native ControlPosition getPosition() /*-{
     return this.position;
   }-*/;


   public final native void setPosition(ControlPosition value) /*-{
     this.position = value;
   }-*/;



}
