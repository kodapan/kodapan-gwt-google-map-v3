package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A point on a two-dimensional plane.
 *
 * @author kalle
 * @since 2011-04-19 21.00
 */
public class Point extends JavaScriptObject {
  /**
   * Required for overlays
   */
  protected Point() {
  }

  /**
   * Create a new point. latitude will be clamped to lie between -90 degrees and
   * +90 degrees, and longitude will be wrapped to lie between -180 degrees and
   * +180 degrees.
   *
   * @param x value between -90 and +90 degrees (clamped)
   * @param y value between -180 and +180 degrees (wrapped)
   */
  public static native Point newInstance(double x, double y) /*-{
    return new $wnd.google.maps.Point(x, y);
  }-*/;

  /**
   * @return The X coordinate
   */
  public final native double getX() /*-{
    return this.x;
  }-*/;

  /**
   * @return The Y coordinate
   */
  public final native double getY() /*-{
    return this.y;
  }-*/;

  /**
   * Does what equals() ought to do, but we are constrained by the JS overlay
   * rules.
   *
   * @param other a point to compare
   * @return <code>true</code> if the latitude and longitude match.
   */
  public final native boolean isEquals(Point other) /*-{
    return this.equals(other);
  }-*/;

}
