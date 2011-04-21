package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.dom.client.Element;


/**
 * GWT Overlay for Google Maps v3 Map... not to be confused with a maps "Overlay".
 */
public class Map extends ListenableMapObject {
  /**
   * Required for Overlay types
   */
  protected Map() {
  }

  /** */
  public static native Map newInstance(Element ele, MapOptions opts) /*-{
    return new $wnd.google.maps.Map(ele, opts);
  }-*/;


  /**
   * Sets the viewport to contain the given bounds.
   *
   * @param bounds
   */
  public final native void fitBounds(LatLngBounds bounds) /*-{
    this.fitBounds(bounds);
  }-*/;

  /**
   * If the map is not yet initialized (i.e. the mapType is still null),
   * or center and zoom have not been set
   * then the result is null or undefined.
   *
   * @return the lat/lng bounds of the current viewport
   */
  public final native LatLngBounds getBounds() /*-{
    return this.getBounds();
  }-*/;

  /** */
  public final native LatLng getCenter() /*-{
    return this.getCenter();
  }-*/;


  // todo getDiv()

  // todo getHeading()

  // todo getMapTypeId()

  /**
   * If the map is not yet initialized (i.e. the mapType is still null) then the result is null.
   * Listen to projection_changed and check its value to ensure it is not null.
   *
   * @return the current projection
   */
  public final native Projection getProjection() /*-{
    return this.getProjection();
  }-*/;


  // todo getStreetView()

  // todo getTilt()

  /** */
  public final native int getZoom() /*-{
    return this.getZoom();
  }-*/;


  // todo panBy(x:number, y:number)

  /**
   * Changes the center of the map to the given LatLng.
   * If the change is less than both the width and height of the map,
   * the transition will be smoothly animated.
   *
   * @param value
   */
  public final native void panTo(LatLng value) /*-{
    this.panTo(value);
  }-*/;


  // todo panToBounds(latLngBounds:LatLngBounds)


  /** */
  public final native void setCenter(LatLng value) /*-{
    this.setCenter(value);
  }-*/;


  // todo setHeading(heading:number)

  // todo setMapTypeId(mapTypeId:MapTypeId)

  // todo setOptions(options:MapOptions)

  // todo setStreetView(panorama:StreetViewPanorama)

  // todo setTilt(tilt:number)

  /** */
  public final native void setZoom(int value) /*-{
    this.setZoom(value);
  }-*/;

}
