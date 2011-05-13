package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayBoolean;

import java.util.Collection;

/**
 * Options for the rendering of the map type control.
 * <p/>
 * Properties	Type	Description
 * mapTypeIds	Array.<MapTypeId>|Array.<string>	IDs of map types to show in the control.
 * position	ControlPosition	Position id. Used to specify the position of the control on the map. The default position is TOP_RIGHT.
 * style	MapTypeControlStyle	Style id. Used to select what style of map type control to display.
 *
 * @author kalle
 * @since 2011-05-11 17.04
 */
public class MapTypeControlOptions extends JavaScriptObject {

  protected MapTypeControlOptions() {
  }

  public static native MapTypeControlOptions newInstance() /*-{
    return {
    };
  }-*/;

  public static MapTypeControlOptions newInstance(JavaScriptObject position, JavaScriptObject style, JavaScriptObject... mapTypeIds) {
    return newInstance(mapTypeIds, position, style);
  }

  public static native MapTypeControlOptions newInstance(JavaScriptObject[] mapTypeIds, JavaScriptObject position, JavaScriptObject style)/*-{
      return {
        mapTypeIds : mapTypeIds,
        position : position,
        style : style
    };
  }-*/;

  /** IDs of map types to show in the control. */
  public native final void setMapTypeIds(JavaScriptObject[] mapTypeIds) /*-{
    this.mapTypeIds = mapTypeIds;
  }-*/;


  /** Position id. Used to specify the position of the control on the map. The default position is TOP_RIGHT. */
  public native final void setPosition(JavaScriptObject position) /*-{
    this.position = position;
  }-*/;

    /** Style id. Used to select what style of map type control to display. */
   public native final void setStyle(JavaScriptObject	style) /*-{
      this.style = style;
   }-*/;

}
