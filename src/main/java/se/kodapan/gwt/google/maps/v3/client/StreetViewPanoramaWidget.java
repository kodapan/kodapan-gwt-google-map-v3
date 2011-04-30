package se.kodapan.gwt.google.maps.v3.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author kalle
 * @since 2011-04-25 00.44
 */
public class StreetViewPanoramaWidget extends Widget {

  private StreetViewPanorama panorama;

  public StreetViewPanoramaWidget(StreetViewPanoramaOptions opts) {
    this.setElement(Document.get().createDivElement());

    panorama = StreetViewPanorama.newInstance(this.getElement(), opts);
  }


  public StreetViewPanorama getPanorama() {
    return panorama;
  }
}
