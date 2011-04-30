package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Properties	            Type	  Description
 * addressControl	        boolean	The enabled/disabled state of the address control.
 * addressControlOptions	StreetViewAddressControlOptions	The display options for the address control.
 * disableDoubleClickZoom	boolean	Enables/disables zoom on double click. Enabled by default.
 * enableCloseButton	    boolean	If true, the close button is displayed. Disabled by default.
 * linksControl	          boolean	The enabled/disabled state of the links control.
 * panControl	            boolean	The enabled/disabled state of the pan control.
 * panControlOptions	    PanControlOptions	The display options for the pan control.
 * pano	                  string	The panorama ID, which should be set when specifying a custom panorama.
 * <p/>
 * todo panoProvider	Function(string):StreetViewPanoramaData	Custom panorama provider, which takes a string pano id and returns an object defining the panorama given that id. This function must be defined to specify custom panorama imagery.
 * position	              LatLng	      The LatLng position of the Street View panorama.
 * pov	                  StreetViewPov	The camera orientation, specified as heading, pitch, and zoom, for the panorama.
 * scrollwheel	          boolean	If false, disables scrollwheel zooming in Street View. The scrollwheel is enabled by default.
 * visible	              boolean	If true, the Street View panorama is visible on load.
 * zoomControl	          boolean	The enabled/disabled state of the zoom control.
 * zoomControlOptions	    ZoomControlOptions	The display options for the zoom control.
 *
 */
public class StreetViewPanoramaOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected StreetViewPanoramaOptions() {
  }

  /**
   * Creates a new visible StreetViewPanoramaOptions instance with all features disabled.
   */
  public static native StreetViewPanoramaOptions newInstance() /*-{
    return {
      addressControl:false,
      addressControlOptions:null,
      disableDoubleClickZoom:true,
      enableCloseButton:false,
      linksControl:false,
      panControl:false,
      panControlOptions:null,
      pano:null,
      panoProvider:null,
      position:null,
      pov:null,
      scrollwheel:false,
      visible:true,
      zoomControl:false,
      zoomControlOptions:null
    };
  }-*/;


  public final native boolean isAddressControl() /*-{
    return this.addressControl;
  }-*/;


  public final native void setAddressControl(boolean value) /*-{
    this.addressControl = value;
  }-*/;


  public final native StreetViewAddressControlOptions getAddressControlOptions() /*-{
    return this.addressControlOptions;
  }-*/;


  public final native void setAddressControlOptions(StreetViewAddressControlOptions value) /*-{
    this.addressControlOptions = value;
  }-*/;


  public final native boolean isDisableDoubleClickZoom() /*-{
    return this.disableDoubleClickZoom;
  }-*/;


  public final native void setDisableDoubleClickZoom(boolean value) /*-{
    this.addressControl = value;
  }-*/;


  public final native boolean isEnableCloseButton() /*-{
    return this.enableCloseButton;
  }-*/;


  public final native void setEnableCloseButton(boolean value) /*-{
    this.enableCloseButton = value;
  }-*/;

  public final native boolean isLinksControl() /*-{
    return this.linksControl;
  }-*/;


  public final native void setLinksControl(boolean value) /*-{
    this.linksControl = value;
  }-*/;

  public final native boolean isPanControl() /*-{
    return this.panControl;
  }-*/;


  public final native void setPanControl(boolean value) /*-{
    this.panControl = value;
  }-*/;

  public final native PanControlOptions getPanControlOptions() /*-{
    return this.panControlOptions;
  }-*/;


  public final native void setPanControlOptions(PanControlOptions value) /*-{
    this.panControlOptions = value;
  }-*/;

  public final native String getPano() /*-{
    return this.pano;
  }-*/;


  public final native void setPano(String value) /*-{
    this.pano = value;
  }-*/;

  public final native LatLng getPosition() /*-{
    return this.position;
  }-*/;


  public final native void setPosition(LatLng value) /*-{
    this.position = value;
  }-*/;

  public final native StreetViewPov getPov() /*-{
    return this.pov;
  }-*/;


  public final native void setPov(StreetViewPov value) /*-{
    this.pov= value;
  }-*/;



  public final native boolean isScrollwheel() /*-{
    return this.scrollwheel;
  }-*/;


  public final native void setScrollwheel(boolean value) /*-{
    this.scrollwheel = value;
  }-*/;

  public final native boolean isVisible() /*-{
    return this.visible;
  }-*/;


  public final native void setVisible(boolean value) /*-{
    this.visible = value;
  }-*/;

  public final native boolean isZoomControl() /*-{
    return this.zoomControl;
  }-*/;


  public final native void setZoomControl(boolean value) /*-{
    this.zoomControl = value;
  }-*/;


  public final native ZoomControlOptions getZoomControlOptions() /*-{
    return this.zoomControlOptions;
  }-*/;


  public final native void setZoomControlOptions(ZoomControlOptions value) /*-{
    this.zoomControlOptions = value;
  }-*/;




}
