package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * backgroundColor	string	Color used for the background of the Map div. This color will be visible when tiles have not yet loaded as the user pans. This option can only be set when the map is initialized.
 * center	LatLng	The initial Map center. Required.
 * disableDefaultUI	boolean	Enables/disables all default UI. May be overridden individually.
 * disableDoubleClickZoom	boolean	Enables/disables zoom and center on double click. Enabled by default.
 * draggable	boolean	If false, prevents the map from being dragged. Dragging is enabled by default.
 * draggableCursor	string	The name or url of the cursor to display on a draggable object.
 * draggingCursor	string	The name or url of the cursor to display when an object is dragging.
 * heading	number	The heading for aerial imagery in degrees measured clockwise from cardinal direction North. Headings are snapped to the nearest available angle for which imagery is available.
 * keyboardShortcuts	boolean	If false, prevents the map from being controlled by the keyboard. Keyboard shortcuts are enabled by default.
 * mapTypeControl	boolean	The initial enabled/disabled state of the Map type control.
 * mapTypeControlOptions	MapTypeControlOptions	The initial display options for the Map type control.
 * mapTypeId	MapTypeId	The initial Map mapTypeId. Required.
 * maxZoom	number	The maximum zoom level which will be displayed on the map. If omitted, or set to null, the maximum zoom from the current map type is used instead.
 * minZoom	number	The minimum zoom level which will be displayed on the map. If omitted, or set to null, the minimum zoom from the current map type is used instead.
 * noClear	boolean	If true, do not clear the contents of the Map div.
 * overviewMapControl	boolean	The enabled/disabled state of the Overview Map control.
 * overviewMapControlOptions	OverviewMapControlOptions	The display options for the Overview Map control.
 * panControl	boolean	The enabled/disabled state of the Pan control.
 * panControlOptions	PanControlOptions	The display options for the Pan control.
 * rotateControl	boolean	The enabled/disabled state of the Rotate control.
 * rotateControlOptions	RotateControlOptions	The display options for the Rotate control.
 * scaleControl	boolean	The initial enabled/disabled state of the Scale control.
 * scaleControlOptions	ScaleControlOptions	The initial display options for the Scale control.
 * scrollwheel	boolean	If false, disables scrollwheel zooming on the map. The scrollwheel is enabled by default.
 * streetView	StreetViewPanorama	A StreetViewPanorama to display when the Street View pegman is dropped on the map. If no panorama is specified, a default StreetViewPanorama will be displayed in the map's div when the pegman is dropped.
 * streetViewControl	boolean	The initial enabled/disabled state of the Street View Pegman control.
 * streetViewControlOptions	StreetViewControlOptions	The initial display options for the Street View Pegman control.
 * tilt	number	The angle of incidence of the map as measured in degrees from the viewport plane to the map plane. The only currently supported values are 0, indicating no angle of incidence (no tilt), and 45, indicating a tilt of 45deg;. 45deg; imagery is only available for SATELLITE and HYBRID map types, within some locations, and at some zoom levels.
 * zoom	number	The initial Map zoom level. Required.
 * zoomControl	boolean	The enabled/disabled state of the Zoom control.
 * zoomControlOptions	ZoomControlOptions	The display options for the Zoom control.
 */
public class MapOptions extends JavaScriptObject {
  /**
   * Required by overlays
   */
  protected MapOptions() {
  }

  /**
   * Creation
   */
  public static native MapOptions newInstance() /*-{
    return {


    };
  }-*/;


  public final native void setBackgroundColor(String value) /*-{
    this.backgroundColor = value;
  }-*/;

  public final native void setCenter(LatLng value) /*-{
    this.center = value;
  }-*/;

  public final native void setZoom(int value) /*-{
    this.zoom = value;
  }-*/;

  /**
   * TODO: parameterize these
   */
  public final native void setMapTypeId() /*-{
    this.mapTypeId = $wnd.google.maps.MapTypeId.ROADMAP;
  }-*/;

  public final native void setNavigationControlOptions() /*-{
    this.navigationControlOptions = { position: $wnd.google.maps.ControlPosition.LEFT };
  }-*/;
}
