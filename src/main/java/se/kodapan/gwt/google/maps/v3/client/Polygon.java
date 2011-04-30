package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JsArray;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#Polygon
 * <p/>
 * Events	    Arguments	  Description
 * click	    MouseEvent	This event is fired when the DOM click event is fired on the Polygon.
 * dblclick	  MouseEvent	This event is fired when the DOM dblclick event is fired on the Polygon.
 * mousedown	MouseEvent	This event is fired when the DOM mousedown event is fired on the Polygon.
 * mousemove	MouseEvent	This event is fired when the DOM mousemove event is fired on the Polygon.
 * mouseout	  MouseEvent	This event is fired on Polygon mouseout.
 * mouseover	MouseEvent	This event is fired on Polygon mouseover.
 * mouseup	  MouseEvent	This event is fired when the DOM mouseup event is fired on the Polygon.
 * rightclick	MouseEvent	This event is fired when the Polygon is right-clicked on.
 */
public class Polygon extends ListenableMapObject {
  /**
   * Required for overlays
   */
  protected Polygon() {
  }

  /**
   */
  public static native Polygon newInstance() /*-{
    return new $wnd.google.maps.Polygon();
  }-*/;

  /**
   */
  public static native Polygon newInstance(PolygonOptions opts) /*-{
    return new $wnd.google.maps.Polygon(opts);
  }-*/;

  /** */
  public final native LatLng calculateCenter() /*-{
    var bounds = new $wnd.google.maps.LatLngBounds();
    this.getPath().forEach(function(point) {
      bounds.extend(point);
    });
    return bounds.getCenter();
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
  public final native void setOptions(PolygonOptions value) /*-{
    this.setOptions(value);
  }-*/;

  public final native void setPath(MVCArray<LatLng> value) /*-{
    this.setPath(value);
  }-*/;

  public final native void setPaths(MVCArray<MVCArray<LatLng>> value) /*-{
    this.setPaths(value);
  }-*/;

  public final native void setPath(JsArray<LatLng> value) /*-{
    this.setPath(value);
  }-*/;

  public final native void setPaths(JsArray<JsArray<LatLng>> value) /*-{
    this.setPaths(value);
  }-*/;


}

