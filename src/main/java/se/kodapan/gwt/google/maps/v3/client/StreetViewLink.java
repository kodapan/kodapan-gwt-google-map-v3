package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.dom.client.Element;


/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#StreetViewPanorama
 * <p/>
 * Events	          Arguments   Description
 * closeclick	      Event	      This event is fired when the close button is clicked.
 * links_changed	  None	      This event is fired when the panorama's links change. The links change asynchronously following a pano id change.
 * pano_changed	    None	      This event is fired when the panorama's pano id changes. The pano may change as the user navigates through the panorama or the position is manually set. Note that not all position changes trigger a pano_changed.
 * position_changed	None	      This event is fired when the panorama's position changes. The position changes as the user navigates through the panorama or the position is set manually.
 * pov_changed	    None	      This event is fired when the panorama's point-of-view changes. The point of view changes as the pitch, zoom, or heading changes.
 * resize	          None	      Developers should trigger this event on the panorama when its div changes size: google.maps.event.trigger(panorama, 'resize').
 * visible_changed	None	      This event is fired when the panorama's visibility changes. The visibility is changed when the Pegman id dragged onto the map, the close button is clicked, or setVisible() is called.
 */
public class StreetViewLink extends ListenableMapObject {
  /**
   * Required for Overlay types
   */
  protected StreetViewLink() {
  }

  /** */
  public static native StreetViewLink newInstance(Element ele, StreetViewPanoramaOptions opts) /*-{
    return new $wnd.google.maps.StreetViewPanorama(ele, opts);
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
   * Returns the set of navigation links for the Street View panorama.
   *
   * @return
   */
  public final native MVCArray<StreetViewLink> getLinks() /*-{
    return this.getLinks();
  }-*/;

  /**
   * Returns the current panorama ID for the Street View panorama.
   * This id is stable within the browser's current session only
   *
   * @return
   */
  public final native String getPano() /*-{
    return this.getPano();
  }-*/;

  /**
   * Returns the current LatLng position for the Street View panorama.
   *
   * @return
   */
  public final native LatLng getPosition() /*-{
    return this.getPosition();
  }-*/;

  /**
   * Returns the current point of view for the Street View panorama.
   *
   * @return
   */
  public final native StreetViewPov getPov() /*-{
    return this.getPov();
  }-*/;

  /**
   * Returns true if the panorama is visible. It does not specify whether Street View imagery is available at the specified position.
   *
   * @return
   */
  public final native boolean getVisible() /*-{
    return this.getVisible();
  }-*/;


  // todo
  // registerPanoProvider(provider:function(string):StreetViewPanoramaData))

  /**
   * Sets the current panorama ID for the Street View panorama.
   */
  public final native void setPano(String pano) /*-{
    this.setPano(pano);
  }-*/;

  /**
   * Sets the current LatLng position for the Street View panorama.
   */
  public final native void setPosition(LatLng position) /*-{
    this.setPosition(position);
  }-*/;

  /**
   * Sets the point of view for the Street View panorama.
   */
  public final native void setPov(StreetViewPov pov) /*-{
    this.setPov(pov);
  }-*/;


  /**
   * Sets to true to make the panorama visible. If set to false, the panorama will be hidden whether it is embedded in the map or in its own <div>.
   */
  public final native void setVisible(boolean flag) /*-{
    this.setVisible(flag);
  }-*/;


}
