package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author kalle
 * @since 2011-05-11 17.04
 */
public class OverviewMapControlOptions extends JavaScriptObject {

  protected OverviewMapControlOptions() {
  }

  public static native OverviewMapControlOptions newInstance() /*-{
    return { opened : false };
  }-*/;

  public final native void setOpened(boolean opened) /*-{
    this.opened=opened;
  }-*/;

  public final native void isOpened() /*-{
    return this.opened;
  }-*/;

}
