package se.kodapan.gwt.google.maps.v3.client.events;

import com.google.gwt.core.client.JavaScriptObject;
import se.kodapan.gwt.google.maps.v3.client.LatLng;

/**
 * @author kalle
 * @since 2011-04-06 03.52
 */
public class MouseEvent extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected MouseEvent() {
  }

  /**
   * This suffices since all the MarkerOptions are duplicated with setters.
   */
  public static native MouseEvent newInstance() /*-{
    return new $wnd.google.maps.MouseEvent();
  }-*/;

  /** */
  public final native LatLng getLatLng() /*-{
    return this.getLatLng();
  }-*/;


  /** */
  public final native void setLatLng(LatLng value) /*-{
    this.setLatLng(value);
  }-*/;
}
