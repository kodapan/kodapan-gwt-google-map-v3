package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Overlay for Google Maps v3 Polygon options.
 */
public class PolygonOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected PolygonOptions() {
  }

  /**
   * Creation
   */
  public static native PolygonOptions newInstance() /*-{
    return {};
  }-*/;

  public final native void setFillColor(String value) /*-{
    this.fillColor = value;
  }-*/;

  public final native void setFillOpacity(double value) /*-{
    this.fillOpacity = value;
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

  public final native void setPath(JsArray<LatLng> value) /*-{
    this.paths = value;
  }-*/;

  public final native void setPath(MVCArray<LatLng> value) /*-{
    this.paths = value;
  }-*/;

  public final native void setPaths(JsArray<JsArray<LatLng>> value) /*-{
    this.paths = value;
  }-*/;

  public final native void setPaths(MVCArray<JsArray<LatLng>> value) /*-{
    this.paths = value;
  }-*/;
}
