package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author kalle
 * @since 2011-05-11 17.59
 */
public class MapTypeControlStyle {


  /**
   * Uses the default map type control. The control which DEFAULT maps to will vary according to window size and other factors. It may change in future versions of the API.
   */
  public static final int DEFAULT = getDEFAULT();
  private static native int getDEFAULT() /*-{
    return $wnd.google.maps.MapTypeControlStyle.DEFAULT;
  }-*/;

  /**
   * A dropdown menu for the screen realestate conscious.
   */
  public static final int DROPDOWN_MENU = getDROPDOWN_MENU();
  private static native int getDROPDOWN_MENU() /*-{
    return $wnd.google.maps.MapTypeControlStyle.DROPDOWN_MENU;
  }-*/;

  /**
   * The standard horizontal radio buttons bar.
   */
  public static final int HORIZONTAL_BAR = getHORIZONTAL_BAR();
  private static native int getHORIZONTAL_BAR() /*-{
    return $wnd.google.maps.MapTypeControlStyle.HORIZONTAL_BAR;
  }-*/;

}
