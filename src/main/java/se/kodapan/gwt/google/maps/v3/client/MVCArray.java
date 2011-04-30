package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * @author kalle
 * @since 2011-04-06 05.44
 */
public class MVCArray<T extends JavaScriptObject> extends MVCObject {

  /**
   * Required for overlays
   */
  protected MVCArray() {
  }

  /**
   */
  public static native MVCArray newInstance() /*-{
    return new $wnd.google.maps.MVCArray();
  }-*/;

  /**
   * An attempt at more typed data, but this might just be silly.
   */
  public static native <T extends JavaScriptObject> MVCArray<T> newInstance(Class<T> type) /*-{
    return new $wnd.google.maps.MVCArray();
  }-*/;


  /**
   */
  public static native MVCArray newInstance(JsArray array) /*-{
    return new $wnd.google.maps.MVCArray(array);
  }-*/;

  /**
   * Removes all elements from the array.
   */
  public final native void clear()/*-{
    this.clear();
  }-*/;

  public abstract class ForEachCallback {
    public abstract void callback(T elem, int i);
  }

  /**
   * Iterate over each element, calling the provided callback. The callback is called for each element like: callback(element, index).
   */
  public final native void forEach(ForEachCallback callback)/*-{
    this.forEach(new function(elem, i) {
      callback.callback(elem, i);
    });
  }-*/;

  /**
   * Returns a reference to the underlying Array. Warning: if the Array is mutated, no events will be fired by this object.
   */
  public final native JsArray<T> getArray()/*-{
    return this.getArray();
  }-*/;

  /**
   * Get an element at the specified index.
   */
  public final native T getAt(int i)/*-{
    return this.getAt(i);
  }-*/;

  /**
   * Returns the number of elements in this array.
   */
  public final native int getLength()/*-{
    return this.getLength();
  }-*/;

  /**
   * Inserts an element at the specified index.
   */
  public final native void insertAt(int t, T elem)/*-{
    this.insertAt(t, elem);
  }-*/;

  /**
   * Removes the last element of the array and returns that element.
   */
  public final native T pop()/*-{
    return this.pop();
  }-*/;

  /**
   * Adds one element to the end of the array and returns the new length of the array.
   */
  public final native int push(T elem)/*-{
    return this.push(elem);
  }-*/;

  /**
   * Removes an element from the specified index.
   */
  public final native T removeAt(int i)/*-{
    return this.remveAt(i);
  }-*/;

  public final native void setAt(int i, T elem)/*-{
    this.setAt(i, elem);
  }-*/;

}
