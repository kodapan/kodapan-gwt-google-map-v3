package se.kodapan.gwt.google.maps.v3.client;

/**
 * Overlay for Google Maps v3 Rectangle
 */
public class Rectangle extends ListenableMapObject {
  /**
   * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#Rectangle
   * <p/>
   * Events	    Arguments	  Description
   * click	    MouseEvent	This event is fired when the DOM click event is fired on the Rectangle.
   * dblclick	  MouseEvent	This event is fired when the DOM dblclick event is fired on the Rectangle.
   * mousedown	MouseEvent	This event is fired when the DOM mousedown event is fired on the Rectangle.
   * mousemove	MouseEvent	This event is fired when the DOM mousemove event is fired on the Rectangle.
   * mouseout	  MouseEvent	This event is fired on Rectangle mouseout.
   * mouseover	MouseEvent	This event is fired on Rectangle mouseover.
   * mouseup	  MouseEvent	This event is fired when the DOM mouseup event is fired on the Rectangle.
   * rightclick	MouseEvent	This event is fired when the Rectangle is right-clicked on.
   */
  protected Rectangle() {
  }

  /**
   */
  public static native Rectangle newInstance() /*-{
    return new $wnd.google.maps.Rectangle();
  }-*/;

  /**
   */
  public static native Rectangle newInstance(RectangleOptions opts) /*-{
    return new $wnd.google.maps.Rectangle(opts);
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
  public final native void setOptions(RectangleOptions value) /*-{
    this.setOptions(value);
  }-*/;

  /** */
  public final native void setBounds(LatLngBounds value) /*-{
    this.setBounds(value);
  }-*/;

  /** */
  public final native LatLngBounds getBounds() /*-{
    return this.getBounds();
  }-*/;

}