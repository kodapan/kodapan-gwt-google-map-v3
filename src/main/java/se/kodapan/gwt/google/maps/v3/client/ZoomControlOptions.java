package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#ZoomControlOptions
 *
 * position	ControlPosition	Position id. Used to specify the position of the control on the map. The default position is TOP_LEFT.
 * style	  ZoomControlStyle	Style id. Used to select what style of zoom control to display.
 * @author kalle
 * @since 2011-04-23 22.21
 */
public class ZoomControlOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected ZoomControlOptions() {
  }

  /**
   * Creation
   */
  public static native ZoomControlOptions newInstance() /*-{
    return {};
  }-*/;


  public final native ControlPosition getPosition() /*-{
     return this.position;
   }-*/;


   public final native void setPosition(ControlPosition value) /*-{
     this.position = value;
   }-*/;

  // todo

//  public final native ZoomControlStyle getStyle() /*-{
//     return this.position;
//   }-*/;
//
//
//   public final native void setStyle(ZoomControlStyle value) /*-{
//     this.position = value;
//   }-*/;



}
