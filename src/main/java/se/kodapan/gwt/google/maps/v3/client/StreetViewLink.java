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
public class StreetViewLink extends JavaScriptObject {
  /**
   * Required for Overlay types
   */
  protected StreetViewLink() {
  }

  /** */
  public static native StreetViewLink newInstance() /*-{
    return {
      description : null,
      heading : 0,
      pano : null,
      roadColor : null,
      roadOpacity : 0
    };
  }-*/;

  public final native String getDescription() /*-{
    return this.description;
  }-*/;
  public final native void setDescription(String value) /*-{
    this.description = value;
  }-*/;

  public final native Number getHeading() /*-{
    return this.heading;
  }-*/;
  public final native void setHeading(Number value) /*-{
    this.heading = value;
  }-*/;

  public final native String getPano() /*-{
    return this.pano;
  }-*/;
  public final native void setPano(String value) /*-{
    this.pano = value;
  }-*/;

  public final native String getRoadColor() /*-{
    return this.roadColor;
  }-*/;
  public final native void setRoadColor(String value) /*-{
    this.roadColor = value;
  }-*/;

  public final native Number getRoadOpacity() /*-{
    return this.roadOpacity;
  }-*/;
  public final native void setRoadOpacity(Number value) /*-{
    this.roadOpacity = value;
  }-*/;


}
