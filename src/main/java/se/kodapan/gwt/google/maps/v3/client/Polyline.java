package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JsArray;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#Polyline
 * <p/>
 * Events	    Arguments	  Description
 * click	    MouseEvent	This event is fired when the DOM click event is fired on the Polyline.
 * dblclick	  MouseEvent	This event is fired when the DOM dblclick event is fired on the Polyline.
 * mousedown	MouseEvent	This event is fired when the DOM mousedown event is fired on the Polyline.
 * mousemove	MouseEvent	This event is fired when the DOM mousemove event is fired on the Polyline.
 * mouseout	  MouseEvent	This event is fired on Polyline mouseout.
 * mouseover	MouseEvent	This event is fired on Polyline mouseover.
 * mouseup	  MouseEvent	This event is fired when the DOM mouseup event is fired on the Polyline.
 * rightclick	MouseEvent	This event is fired when the Polyline is right-clicked on.
 */
public class Polyline extends ListenableMapObject {
  /**
   * Required for overlays
   */
  protected Polyline() {
  }

  /**
   */
  public static native Polyline newInstance() /*-{
    return new $wnd.google.maps.Polyline();
  }-*/;

  /**
   */
  public static native Polyline newInstance(PolylineOptions opts) /*-{
    return new $wnd.google.maps.Polyline(opts);
  }-*/;

  /** */
  public final native void setMap(Map map) /*-{
    this.setMap(map);
  }-*/;

  /** */
  public final native Map getMap() /*-{
    return this.getMap();
  }-*/;

  /** */
  public final native void setOptions(PolylineOptions value) /*-{
    this.setOptions(value);
  }-*/;


  public final native void setPath(JsArray<LatLng> value) /*-{
    this.setPath(value);
  }-*/;

  public final native void setPath(MVCArray<LatLng> value) /*-{
    this.setPath(value);
  }-*/;


  public final native MVCArray<LatLng> getPath() /*-{
    return this.getPath();
  }-*/;


}