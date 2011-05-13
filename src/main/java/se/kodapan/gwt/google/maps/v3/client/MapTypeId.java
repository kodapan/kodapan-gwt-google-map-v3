package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author kalle
 * @since 2011-05-11 17.51
 */
public class MapTypeId {

  /**
   * This map type displays a transparent layer of major streets on satellite images.
   */
  public static final JavaScriptObject HYBRID = getHybrid();

  /**
   * This map type displays a normal street map.
   */
  public static final JavaScriptObject ROADMAP = getRoadmap();
  /**
   * This map type displays satellite images.
   */
  public static final JavaScriptObject SATELLITE = getSatellite();
  /**
   * This map type displays maps with physical features such as terrain and vegetation.
   */
  public static final JavaScriptObject TERRAIN = getTerrain();

  private static native JavaScriptObject getHybrid() /*-{
    return $wnd.google.maps.MapTypeId.HYBRID;
  }-*/;

  private static native JavaScriptObject getSatellite() /*-{
    return $wnd.google.maps.MapTypeId.SATELLITE;
  }-*/;

  private static native JavaScriptObject getRoadmap() /*-{
    return $wnd.google.maps.MapTypeId.ROADMAP;
  }-*/;

  private static native JavaScriptObject getTerrain() /*-{
    return $wnd.google.maps.MapTypeId.TERRAIN;
  }-*/;


}
