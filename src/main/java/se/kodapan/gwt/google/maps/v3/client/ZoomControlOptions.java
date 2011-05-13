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

  public static native ZoomControlOptions newInstance() /*-{
    return {};
  }-*/;

  public static native ZoomControlOptions newInstance(JavaScriptObject position, JavaScriptObject style) /*-{
    return { position : position, style : style };
  }-*/;


  public final native JavaScriptObject getPosition() /*-{
     return this.position;
   }-*/;


   public final native void setPosition(JavaScriptObject value) /*-{
     this.position = value;
   }-*/;


  public final native JavaScriptObject getStyle() /*-{
     return this.style;
   }-*/;


   public final native void setStyle(JavaScriptObject value) /*-{
     this.position = value;
   }-*/;



}
