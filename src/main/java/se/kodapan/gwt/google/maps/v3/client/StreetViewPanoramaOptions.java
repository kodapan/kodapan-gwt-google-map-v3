package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Overlay for Google Maps v3 MapOptions.
 */
public class StreetViewPanoramaOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected StreetViewPanoramaOptions() {
  }

  /**
   * Creation
   */
  public static native StreetViewPanoramaOptions newInstance() /*-{
    return {};
  }-*/;


  public final native void setBackgroundColor(String value) /*-{
    this.backgroundColor = value;
  }-*/;

  public final native void setCenter(LatLng value) /*-{
    this.center = value;
  }-*/;

  public final native void setZoom(int value) /*-{
    this.zoom = value;
  }-*/;

  /**
   * TODO: parameterize these
   */
  public final native void setMapTypeId() /*-{
    this.mapTypeId = $wnd.google.maps.MapTypeId.ROADMAP;
  }-*/;

  public final native void setNavigationControlOptions() /*-{
    this.navigationControlOptions = { position: $wnd.google.maps.ControlPosition.LEFT };
  }-*/;
}
