package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;
import se.kodapan.gwt.google.maps.v3.client.events.EventListener;

/**
 * The InfoWindow needs some custom logic so it can't be an Overlay directly.
 * On the plus side, this lets you extend it and add behavior.
 */
public class InfoWindowFacade {
  /**
   * This works just like the VirtualPanel in the maps v2 wrapper InfoWindow.
   * It provides a way to attach and detach widgets.  Note that this panel
   * itself is never actually embedded in anything; it just forces onAttach()
   * and onDetach() of the widget to be called appropriately.
   */
  static class FakePanel extends ComplexPanel {
    public FakePanel(Widget w) {
      // Detach new child from anything it was attached to before.
      w.removeFromParent();
      // Adds to our collection
      getChildren().add(w);
      // Results in the actual attachment
      adopt(w);
    }

    @Override
    public boolean isAttached() {
      return true;
    }

    /**
     * Detaches the widget
     */
    public void detachWidget() {
      this.remove(0);
    }
  }


  /** */
  InfoWindow jso;

  /**
   * If we have a widget, this will exist so we can detach later
   */
  FakePanel widgetAttacher;

  /**
   * Keep track of this so we can get it again later
   */
  Widget widgetContent;

  /** */
  public InfoWindowFacade() {
    jso = InfoWindow.newInstance();
  }

  /** */
  public InfoWindowFacade(InfoWindowOptions opts) {
    jso = InfoWindow.newInstance(opts);
  }


  /** */
  public InfoWindowFacade(Marker marker, Widget content) {
    jso = InfoWindow.newInstance();
    jso.setPosition(marker.getPosition());
    setContent(content);
  }



  /**
   * Detaches the handler and closes
   */
  public void close() {
    this.detachWidget();
    this.jso.close();
  }

  /**
   * Detaches the content widget, if it exists
   */
  private void detachWidget() {
    if (this.widgetAttacher != null) {
      this.widgetAttacher.detachWidget();
      this.widgetAttacher = null;
    }
  }

  /** */
  public void open(Map map) {
    this.jso.open(map);
  }

  public void open(Map map, Marker marker) {
    this.jso.open(map, marker);
  }

  /** */
  public void setOptions(InfoWindowOptions value) {
    this.jso.setOptions(value);
  }

  /** */
  public void setContent(String value) {
    this.widgetContent = null;
    this.detachWidget();
    this.jso.setContent(value);
  }

  /** */
  public void setContent(Element value) {
    this.widgetContent = null;
    this.detachWidget();
    this.jso.setContent(value);
  }

  /** */
  public void setContent(Widget value) {
    this.widgetContent = value;
    this.jso.setContent(value.getElement());

    if (this.widgetAttacher == null) {
      // Add a hook for the close button click
      this.jso.addListener("closeclick", new EventListener() {

        @Override
        public void run(JavaScriptObject eventArguments) {
          detachWidget();
        }
      });
      this.widgetAttacher = new FakePanel(value);
    } else if (this.widgetAttacher.getWidget(0) != value) {
      this.widgetAttacher.detachWidget();
      this.widgetAttacher = new FakePanel(value);
    }
  }

  /**
   * @return the widget, if a widget was set
   */
  public Widget getContentWidget() {
    return this.widgetContent;
  }

  /** */
  public LatLng getPosition() {
    return this.jso.getPosition();
  }

  /** */
  public void setPosition(LatLng value) {
    this.jso.setPosition(value);
  }

  /** */
  public int getZIndex() {
    return this.jso.getZIndex();
  }

  /** */
  public void setZIndex(int value) {
    this.jso.setZIndex(value);
  }

  public InfoWindow getJso() {
    return jso;
  }
}