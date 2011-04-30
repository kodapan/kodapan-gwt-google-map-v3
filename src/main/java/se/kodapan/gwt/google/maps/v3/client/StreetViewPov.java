package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;


/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#StreetViewLink
 * <p/>
 * Properties	    Type	  Description
 * description	  string	A localized string describing the link.
 * heading	      number	The heading of the link.
 * pano	          string	A unique identifier for the panorama. This id is stable within a session but unstable across sessions.
 * roadColor	    string	Color of the link
 * roadOpacity	  number	Opacity of the link
 */
public class StreetViewPov extends JavaScriptObject {
  /**
   * Required for Overlay types
   */
  protected StreetViewPov() {
  }

  /** */
  public static native StreetViewPov newInstance() /*-{
    return {};
  }-*/;


}
