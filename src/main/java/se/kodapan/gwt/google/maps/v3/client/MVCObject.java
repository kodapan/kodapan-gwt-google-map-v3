package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author kalle
 * @since 2011-04-06 05.36
 */
public class MVCObject extends JavaScriptObject {

  /**
   * Required for overlays
   */
  protected MVCObject() {
  }

  /**
   */
  public static native MVCObject newInstance() /*-{
    return new $wnd.google.maps.MVCObject();
  }-*/;


  /**
   * Binds a View to a Model.
   */
  public final native void bindTo(String key, MVCObject target, String targetKey, boolean noNotify) /*-{
    this.bindTo(key, target, targetKey, noNotify);
  }-*/;

  /**
   * Generic handler for state changes. Override this in derived classes to handle arbitrary state changes.
   */
  public final native void changed(String key)/*-{
    this.changed(key);
  }-*/;

  /**
   * Gets a value.
   */
  public final native JavaScriptObject get(String key)/*-{
    return this.get(key);
  }-*/;

  /**
   * Notify all observers of a change on this property. This notifies both objects that are bound to the object's property as well as the object that it is bound to.
   */
  public final native void notify(String key)/*-{
    this.notify(key);
  }-*/;

  /**
   * Sets a value.
   */
  public final native void set(String key, JavaScriptObject value)/*-{
    this.set(key, value);
  }-*/;

  /**
   * Sets a collection of key-value pairs.
   */
  public final native void setValues(JavaScriptObject values)/*-{
    this.setValues(values);
  }-*/;

  /**
   * Removes a binding. Unbinding will set the unbound property to the current value. The object will not be notified, as the value has not changed.
   */
  public final native void unbind(String key)/*-{
    this.unbind(key);
  }-*/;

  public final native void unbindAll()/*-{
    this.unbindAll();
  }-*/;

}
