package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#Marker
 * 
 * Events	            Arguments	  Description
 * animation_changed	None	      This event is fired when the marker's animation property changes.
 * click	            MouseEvent	This event is fired when the marker icon was clicked.
 * clickable_changed	None	      This event is fired when the marker's clickable property changes.
 * cursor_changed	    None        This event is fired when the marker's cursor property changes.
 * dblclick	          MouseEvent	This event is fired when the marker icon was double clicked.
 * drag	              MouseEvent	This event is repeatedly fired while the user drags the marker.
 * dragend	          MouseEvent	This event is fired when the user stops dragging the marker.
 * draggable_changed	None        This event is fired when the marker's draggable property changes.
 * dragstart	        MouseEvent	This event is fired when the user starts dragging the marker.
 * flat_changed	      None        This event is fired when the marker's flat property changes.
 * icon_changed	      None        This event is fired when the marker icon property changes.
 * mousedown	        MouseEvent	This event is fired for a mousedown on the marker.
 * mouseout	          MouseEvent	This event is fired when the mouse leaves the area of the marker icon.
 * mouseover	        MouseEvent	This event is fired when the mouse enters the area of the marker icon.
 * mouseup	          MouseEvent	This event is fired for a mouseup on the marker.
 * position_changed	  None        This event is fired when the marker position property changes.
 * rightclick	        MouseEvent	This event is fired for a rightclick on the marker.
 * shadow_changed	    None        This event is fired when the marker's shadow property changes.
 * shape_changed	    None        This event is fired when the marker's shape property changes.
 * title_changed	    None        This event is fired when the marker title property changes.
 * visible_changed	  None        This event is fired when the marker's visible property changes.
 * zindex_changed	    None        This event is fired when the marker's zIndex property changes.
 * 
 */
public class Marker extends ListenableMapObject {
  /**
   * Required by overlays
   */
  protected Marker() {
  }

  /**
   * This suffices since all the MarkerOptions are duplicated with setters.
   */
  public static native Marker newInstance() /*-{
    return new $wnd.google.maps.Marker();
  }-*/;

  /** */
  public final native void setMap(Map map) /*-{
    this.setMap(map);
  }-*/;

  /** */
  public final native void setPosition(LatLng value) /*-{
    this.setPosition(value);
  }-*/;

  /** */
  public final native LatLng getPosition() /*-{
    return this.getPosition();
  }-*/;

  /** */
  public final native void setTitle(String value) /*-{
    this.setTitle(value);
  }-*/;

  /** */
  public final native void setIcon(String value) /*-{
    this.setIcon(value);
  }-*/;

  /**
   * You need to make the MarkerImage object yourself with JSNI; too many constructor options
   */
  public final native void setIcon(JavaScriptObject markerImage) /*-{
    this.setIcon(markerImage);
  }-*/;

  /** */
  public final native void setZIndex(int value) /*-{
    this.setZIndex(value);
  }-*/;

  /** */
  public final native void setClickable(boolean value) /*-{
    this.setClickable(value);
  }-*/;


}
