package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.AnimatedLayout;
import com.google.gwt.user.client.ui.Widget;

/**
 * Widget wrapper for the MapOverlay
 */
public class MapWidget extends Widget {
  /** */
  protected Map map;

  /**
   */
  public MapWidget(MapOptions opts) {
    this.setElement(Document.get().createDivElement());

    this.map = Map.newInstance(this.getElement(), opts);
  }


  /**
   * Helper method to reach the pixel position on the widget element for a given latitude and longitude.
   *
   * @param latLng
   * @return pixel x and y coordinate representing the latlng at current zoom level.
   */
  public  Point getPixelCoordinate(LatLng latLng) {
    double scale = Math.pow(2, getMap().getZoom());
    LatLng nw = LatLng.newInstance(
        getMap().getBounds().getNorthEast().getLatitude(),
        getMap().getBounds().getSouthWest().getLongitude());

    Point worldCoordinateNW = getMap().getProjection().fromLatLngToPoint(nw);
    Point worldCoordinate = getMap().getProjection().fromLatLngToPoint(latLng);
    return Point.newInstance(
        Math.floor((worldCoordinate.getX() - worldCoordinateNW.getX()) * scale) + getAbsoluteLeft(),
        Math.floor((worldCoordinate.getY() - worldCoordinateNW.getY()) * scale) + getAbsoluteTop());
  }


  /** */
  public Map getMap() {
    return this.map;
  }

  /**
   * Note:  Call this *after* you add it to a LayoutPanel
   */
  public void fitBounds(LatLngBounds bounds) {
    // Doesn't seem to work without this
    this.forceParentLayout(this.getParent());

    this.map.fitBounds(bounds);
  }

  /**
   * Recursive method that will fore layout everything from the root down
   */
  private void forceParentLayout(Widget w) {
    if (w == null)
      return;
    else
      forceParentLayout(w.getParent());

    if (w instanceof AnimatedLayout)
      ((AnimatedLayout) w).forceLayout();
  }


}
