package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;
import se.kodapan.gwt.google.maps.v3.client.events.EventListener;

/**
 * @author kalle
 * @since 2011-04-19 23.29
 */
public abstract class ListenableMapObject extends JavaScriptObject {

  /**
   * Required by overlays
   */
  protected ListenableMapObject() {
  }


  /**
   * Adds a listener to be triggered on a given event.
   *
   * @param eventName native event name, eg "mousemove"
   * @param listener  handler for these sort of events
   */
  public final native void addListener(String eventName, EventListener listener) /*-{
    $wnd.google.maps.event.addListener(this, eventName, function(argument) {
      listener.@se.kodapan.gwt.google.maps.v3.client.events.EventListener::run(Lcom/google/gwt/core/client/JavaScriptObject;)(argument);
    });
  }-*/;

  /**
   * Adds a listener that will be triggered on a given event once and then be removed.
   *
   * @param eventName native event name, eg "mouseover"
   * @param listener  handler for these sort of events
   */
  public final native void addListenerOnce(String eventName, EventListener listener) /*-{
    $wnd.google.maps.event.addListenerOnce(this, eventName, function(argument) {
      listener.@se.kodapan.gwt.google.maps.v3.client.events.EventListener::run(Lcom/google/gwt/core/client/JavaScriptObject;)(argument);
    });
  }-*/;

  /**
   * Removes all listeners
   */
  public final native void clearInstanceListeners() /*-{
    $wnd.google.maps.event.clearInstanceListeners(this);
  }-*/;

  /**
   * Removes all listeners of a given type.
   *
   * @param eventName
   */
  public final native void clearInstanceListeners(String eventName) /*-{
    $wnd.google.maps.event.clearInstanceListeners(this, eventName);
  }-*/;
}
