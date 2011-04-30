package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.dom.client.Element;


/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#Map
 *
 * Events	            Arguments	  Description
 * bounds_changed	    None	      This event is fired when the viewport bounds have changed.
 * center_changed	    None	      This event is fired when the map center property changes.
 * click	            MouseEvent	This event is fired when the user clicks on the map (but not when they click on a marker or infowindow).
 * dblclick	          MouseEvent	This event is fired when the user double-clicks on the map. Note that the click event will also fire, right before this one.
 * drag	              None	      This event is repeatedly fired while the user drags the map.
 * dragend	          None	      This event is fired when the user stops dragging the map.
 * dragstart	        None	      This event is fired when the user starts dragging the map.
 * heading_changed	  None	      This event is fired when the map heading property changes.
 * idle	              None	      This event is fired when the map becomes idle after panning or zooming.
 * maptypeid_changed  None	      This event is fired when the mapTypeId property changes.
 * mousemove	        MouseEvent	This event is fired whenever the user's mouse moves over the map container.
 * mouseout	          MouseEvent	This event is fired when the user's mouse exits the map container.
 * mouseover	        MouseEvent	This event is fired when the user's mouse enters the map container.
 * projection_changed	None	      This event is fired when the projection has changed.
 * resize	            None	      Developers should trigger this event on the map when the div changes size: google.maps.event.trigger(map, 'resize') .
 * rightclick	        MouseEvent	This event is fired when the DOM contextmenu event is fired on the map container.
 * tilesloaded	      None	      This event is fired when the visible tiles have finished loading.
 * tilt_changed	      None	      This event is fired when the map tilt property changes.
 * zoom_changed	      None	      This event is fired when the map zoom property changes.
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
