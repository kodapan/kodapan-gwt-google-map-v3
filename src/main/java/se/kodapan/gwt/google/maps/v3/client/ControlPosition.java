package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#ControlPosition
 *
 * Identifiers used to specify the placement of controls on the map.
 * Controls are positioned relative to other controls in the same layout position.
 * Controls that are added first are positioned closer to the edge of the map.
 * +----------------+
 * + TL    TC    TR +
 * + LT          RT +
 * +                +
 * + LC          RC +
 * +                +
 * + LB          RB +
 * + BL    BC    BR +
 * +----------------+
 * Elements in the top or bottom row flow towards the middle.
 * Elements at the left or right sides flow downwards.
 *
 * @author kalle
 * @since 2011-04-23 22.25
 */
public class ControlPosition {

  /**
   * Elements are positioned in the center of the bottom row.
   */
  public static final JavaScriptObject BOTTOM_CENTER = getBOTTOM_CENTER();
  private final static native JavaScriptObject getBOTTOM_CENTER() /*-{
    return $wnd.google.maps.ControlPosition.BOTTOM_CENTER;
  }-*/;


  /**
   * Elements are positioned in the bottom left and flow towards the middle. Elements are positioned to the right of the Google logo.
   */
  public static final JavaScriptObject BOTTOM_LEFT = getBOTTOM_LEFT();
  private final static native JavaScriptObject getBOTTOM_LEFT() /*-{
    return $wnd.google.maps.ControlPosition.BOTTOM_LEFT;
  }-*/;

  /**
   * Elements are positioned in the bottom right and flow towards the middle. Elements are positioned to the left of the copyrights.
   */
  public static final JavaScriptObject BOTTOM_RIGHT = getBOTTOM_RIGHT();
  private final static native JavaScriptObject getBOTTOM_RIGHT() /*-{
    return $wnd.google.maps.ControlPosition.BOTTOM_RIGHT;
  }-*/;

  /* Elements are positioned on the left, above bottom-left elements, and flow upwards. */
  public static final JavaScriptObject LEFT_BOTTOM = getLEFT_BOTTOM();
  private final static native JavaScriptObject getLEFT_BOTTOM() /*-{
    return $wnd.google.maps.ControlPosition.LEFT_BOTTOM;
  }-*/;

  /* Elements are positioned in the center of the left side. */
  public static final JavaScriptObject LEFT_CENTER = getLEFT_CENTER();
  private final static native JavaScriptObject getLEFT_CENTER() /*-{
    return $wnd.google.maps.ControlPosition.LEFT_CENTER;
  }-*/;

  /* Elements are positioned on the left, below top-left elements, and flow downwards. */
  public static final JavaScriptObject LEFT_TOP = getLEFT_TOP();
  private final static native JavaScriptObject getLEFT_TOP() /*-{
    return $wnd.google.maps.ControlPosition.LEFT_TOP;
  }-*/;

  /* Elements are positioned on the right, above bottom-right elements, and flow upwards. */
  public static final JavaScriptObject RIGHT_BOTTOM = getRIGHT_BOTTOM();
  private final static native JavaScriptObject getRIGHT_BOTTOM() /*-{
    return $wnd.google.maps.ControlPosition.RIGHT_BOTTOM;
  }-*/;

  /* Elements are positioned in the center of the right side. */
  public static final JavaScriptObject RIGHT_CENTER = getRIGHT_CENTER();
  private final static native JavaScriptObject getRIGHT_CENTER() /*-{
    return $wnd.google.maps.ControlPosition.RIGHT_CENTER;
  }-*/;

  /* Elements are positioned on the right, below top-right elements, and flow downwards. */
  public static final JavaScriptObject RIGHT_TOP = getRIGHT_TOP();
  private final static native JavaScriptObject getRIGHT_TOP() /*-{
    return $wnd.google.maps.ControlPosition.RIGHT_TOP;
  }-*/;

  /* 	Elements are positioned in the center of the top row. */
  public static final JavaScriptObject TOP_CENTER = getTOP_CENTER();
  private final static native JavaScriptObject getTOP_CENTER() /*-{
    return $wnd.google.maps.ControlPosition.TOP_CENTER;
  }-*/;

  /* Elements are positioned in the top left and flow towards the middle. */
  public static final JavaScriptObject TOP_LEFT = getTOP_LEFT();
  private final static native JavaScriptObject getTOP_LEFT() /*-{
    return $wnd.google.maps.ControlPosition.TOP_LEFT;
  }-*/;

  /* Elements are positioned in the top right and flow towards the middle. */
  public static final JavaScriptObject TOP_RIGHT = getTOP_RIGHT();
  private final static native JavaScriptObject getTOP_RIGHT() /*-{
    return $wnd.google.maps.ControlPosition.TOP_RIGHT;
  }-*/;


}
