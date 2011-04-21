package se.kodapan.gwt.google.maps.v3.client;

/**
 * Overlay for Google Maps v3 Rectangle
 */
public class Rectangle extends ListenableMapObject {
  /**
   * Required for overlays
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