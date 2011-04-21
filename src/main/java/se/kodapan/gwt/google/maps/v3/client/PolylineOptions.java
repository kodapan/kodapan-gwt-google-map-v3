package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Overlay for Google Maps v3 Polyline options.
 */
public class PolylineOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected PolylineOptions() {
  }

  /**
   * Creation
   */
  public static native PolylineOptions newInstance() /*-{
    return {};
  }-*/;

  public final native void setStrokeColor(String value) /*-{
    this.strokeColor = value;
  }-*/;

  public final native void setStrokeOpacity(double value) /*-{
    this.strokeOpacity = value;
  }-*/;

  public final native void setStrokeWeight(double value) /*-{
    this.strokeWeight = value;
  }-*/;

  public final native void setZIndex(double value) /*-{
    this.zIndex = value;
  }-*/;

  public final native void setClickable(boolean value) /*-{
    this.clickable = value;
  }-*/;

  public final native void setGeodesic(boolean value) /*-{
    this.geodesic = value;
  }-*/;

  /**
   * Need to eventually make an MVCArray version
   */
  public final native void setPath(JsArray<LatLng> value) /*-{
    this.paths = value;
  }-*/;

  /**
   * Need to eventually make an MVCArray version
   */
  public final native void setPaths(JsArray<JsArray<LatLng>> value) /*-{
    this.paths = value;
  }-*/;
}
