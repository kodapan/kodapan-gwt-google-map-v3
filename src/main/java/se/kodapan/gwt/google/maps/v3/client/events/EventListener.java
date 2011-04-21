package se.kodapan.gwt.google.maps.v3.client.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author kalle
 * @since 2011-04-06 03.55
 */
public interface EventListener<T extends JavaScriptObject> {

  public abstract void run(T eventArguments);

}
