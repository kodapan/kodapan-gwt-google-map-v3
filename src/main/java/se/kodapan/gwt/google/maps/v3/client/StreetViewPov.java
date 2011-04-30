package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;


/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#StreetViewPov
 * <p/>
 * Properties	Type	  Description
 * heading	  number	The camera heading in degrees relative to true north. True north is 0°, east is 90°, south is 180°, west is 270°.
 * pitch	    number	The camera pitch in degrees, relative to the street view vehicle. Ranges from 90° (directly upwards) to -90° (directly downwards).
 * zoom	      number	The zoom level. Fully zoomed-out is level 0, zooming in increases the zoom level.
 */
public class StreetViewPov extends JavaScriptObject {
  /**
   * Required for Overlay types
   */
  protected StreetViewPov() {
  }

  /** */
  public static native StreetViewPov newInstance() /*-{
    return {};
  }-*/;

  public static native StreetViewPov newInstance(int heading, int pitch, int zoom) /*-{
    return {
      heading: heading,
      pitch: pitch,
      zoom: zoom
    };
  }-*/;


  public final native int getHeading() /*-{
    return this.heading;
  }-*/;
  public final native void setHeading(int value) /*-{
    this.heading = value;
  }-*/;

  public final native int getPitch() /*-{
    return this.pitch;
  }-*/;
  public final native void setPitch(int value) /*-{
    this.pitch = value;
  }-*/;

  public final native int getZoom() /*-{
    return this.zoom;
  }-*/;
  public final native void setZoom(int value) /*-{
    this.zoom = value;
  }-*/;

}

