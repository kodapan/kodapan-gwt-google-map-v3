package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 */
public class Projection extends JavaScriptObject {
  /**
   * Required for overlays
   */
  protected Projection() {
  }

  /**
   * Translates from the LatLng cylinder to the Point plane.
   * This interface specifies a function which implements translation
   * from given LatLng values to world coordinates on the map projection.
   * The Maps API calls this method when it needs to plot locations on screen.
   * Projection objects must implement this method.
   *
   * @param latLng
   * @return
   */
  public final native Point fromLatLngToPoint(LatLng latLng) /*-{
    return this.fromLatLngToPoint(latLng);
  }-*/;

  /**
   * Translates from the LatLng cylinder to the Point plane.
   * This interface specifies a function which implements translation
   * from given LatLng values to world coordinates on the map projection.
   * The Maps API calls this method when it needs to plot locations on screen.
   * Projection objects must implement this method.
   *
   * @param latLng
   * @param point
   * @return
   */
  public final native Point fromLatLngToPoint(LatLng latLng, Point point) /*-{
    return this.fromLatLngToPoint(latLng, point);
  }-*/;


  /**
   * This interface specifies a function which implements translation
   * from world coordinates on a map projection to LatLng values.
   * The Maps API calls this method when it needs to translate actions on screen to positions on the map.
   * Projection objects must implement this method.
   *
   * @param pixel
   * @return
   */
  public final native LatLng fromPointToLatLng(Point pixel) /*-{
    return this.fromPointToLatLng(pixel);
  }-*/;

  /**
   * This interface specifies a function which implements translation
   * from world coordinates on a map projection to LatLng values.
   * The Maps API calls this method when it needs to translate actions on screen to positions on the map.
   * Projection objects must implement this method.
   *
   * @param pixel
   * @param nowrap
   * @return
   */
  public final native LatLng fromPointToLatLng(Point pixel, boolean nowrap) /*-{
    return this.fromPointToLatLng(pixel, nowrap);
  }-*/;


}