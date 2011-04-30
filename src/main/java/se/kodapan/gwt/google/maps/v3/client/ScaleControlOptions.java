package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#ScaleControlOptions
 *
 * position	ControlPosition	  Position id. Used to specify the position of the control on the map. The default position is BOTTOM_LEFT.
 * style	  ScaleControlStyle	Style id. Used to select what style of scale control to display.
 *
 * @author kalle
 * @since 2011-04-23 22.21
 */
public class ScaleControlOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected ScaleControlOptions() {
  }

  /**
   * Creation
   */
  public static native ScaleControlOptions newInstance() /*-{
    return {};
  }-*/;


  public final native ControlPosition getPosition() /*-{
     return this.position;
   }-*/;


   public final native void setPosition(ControlPosition value) /*-{
     this.position = value;
   }-*/;


  // todo

//  public final native ScaleControlStyle getStyle() /*-{
//     return this.style;
//   }-*/;
//
//
//   public final native void setStyle(ScaleControlStyle value) /*-{
//     this.style = value;
//   }-*/;
//

}
