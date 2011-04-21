package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.dom.client.Element;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#InfoWindow
 * <p/>
 * Events	          Arguments	  Description
 * closeclick	      None	      This event is fired when the close button was clicked.
 * content_changed	None	      This event is fired when the content property changes.
 * domready	        None	      This event is fired when the <div> containing the InfoWindow's content is attached to the DOM. You may wish to monitor this event if you are building out your info window content dynamically.
 * position_changed	None	      This event is fired when the position property changes.
 * zindex_changed	  None
 * <p/>
 * <p/>
 * An overlay that looks like a bubble and is often connected to a marker.
 * This class extends MVCObject.
 */
public class InfoWindow extends ListenableMapObject {
  /**
   * Required for overlays
   */
  protected InfoWindow() {
  }

  /**
   */
  public static native InfoWindow newInstance() /*-{
    return new $wnd.google.maps.InfoWindow();
  }-*/;

  /**
   * Creates an info window with the given options. An InfoWindow can be placed on a map at a particular position or above a marker, depending on what is specified in the options. Unless auto-pan is disabled, an InfoWindow will pan the map to make itself visible when it is opened. After constructing an InfoWindow, you must call open to display it on the map. The user can click the close button on the InfoWindow to remove it from the map, or the developer can call close() for the same effect.
   */
  public static native InfoWindow newInstance(InfoWindowOptions opts) /*-{
    return new $wnd.google.maps.InfoWindow(opts);
  }-*/;

  /**
   * Closes this InfoWindow by removing it from the DOM structure.
   */
  public final native void close() /*-{
    this.close();
  }-*/;

  /** */
  public final native void open(Map map) /*-{
    this.open(map);
  }-*/;

  /**
   * Yeah, this is cheating WRT the marker.  Need to create an overlay for MVCObject
   */
  public final native void open(Map map, Marker marker) /*-{
    this.open(map, marker);
  }-*/;

  /** */
  public final native void setOptions(InfoWindowOptions value) /*-{
    this.setOptions(value);
  }-*/;

  /**
   * @return a String or Element
   */
  public final native Object getContent() /*-{
    return this.getContent();
  }-*/;

  /** */
  public final native void setContent(String value) /*-{
    this.setContent(value);
  }-*/;

  /** */
  public final native void setContent(Element value) /*-{
    this.setContent(value);
  }-*/;

  /** */
  public final native LatLng getPosition() /*-{
    return this.getPosition();
  }-*/;

  /** */
  public final native void setPosition(LatLng value) /*-{
    this.setPosition(value);
  }-*/;

  /** */
  public final native int getZIndex() /*-{
    return this.getZIndex();
  }-*/;

  /** */
  public final native void setZIndex(int value) /*-{
    this.setZIndex(value);
  }-*/;

}