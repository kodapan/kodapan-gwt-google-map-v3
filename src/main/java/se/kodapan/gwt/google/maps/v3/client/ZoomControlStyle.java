package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author kalle
 * @since 2011-05-11 18.21
 */
public class ZoomControlStyle  {

  /**
   * The default zoom control. The control which DEFAULT maps to will vary according to map size and other factors. It may change in future versions of the API.
   */
  public static final int DEFAULT = getDEFAULT();
  private static final native int getDEFAULT() /*-{
    return $wnd.google.maps.ZoomControlStyle.DEFAULT;
  }-*/;


  /**
   * The larger control, with the zoom slider in addition to +/- buttons.
   */
  public static final int LARGE = getLARGE();
  private static final native int getLARGE() /*-{
    return $wnd.google.maps.ZoomControlStyle.LARGE;
  }-*/;

  /**
   * A small control with buttons to zoom in and out.
   */
  public static final int SMALL = getSMALL();
  private  static final native int getSMALL() /*-{
    return $wnd.google.maps.ZoomControlStyle.SMALL;
  }-*/;



}
