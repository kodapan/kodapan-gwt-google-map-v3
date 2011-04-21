package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JsArray;

/**
 * Overlay for Google Maps v3 Polyline
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