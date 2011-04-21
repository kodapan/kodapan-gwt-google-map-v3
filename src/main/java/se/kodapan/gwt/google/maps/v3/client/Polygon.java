package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JsArray;

/**
 * Overlay for Google Maps v3 Polygon
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

