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
  public static final JavaScriptObject DEFAULT = getDEFAULT();
  private static final native JavaScriptObject getDEFAULT() /*-{
    return $wnd.google.maps.ZoomControlStyle.DEFAULT;
  }-*/;


  /**
   * The larger control, with the zoom slider in addition to +/- buttons.
   */
  public static final JavaScriptObject LARGE = getLARGE();
  private static final native JavaScriptObject getLARGE() /*-{
    return $wnd.google.maps.ZoomControlStyle.LARGE;
  }-*/;

  /**
   * A small control with buttons to zoom in and out.
   */
  public static final JavaScriptObject SMALL = getSMALL();
  private  static final native JavaScriptObject getSMALL() /*-{
    return $wnd.google.maps.ZoomControlStyle.SMALL;
  }-*/;



}
