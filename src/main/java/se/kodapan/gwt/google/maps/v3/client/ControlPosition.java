package se.kodapan.gwt.google.maps.v3.client;

/**
 * http://code.google.com/intl/sv-SE/apis/maps/documentation/javascript/reference.html#ControlPosition
 *
 * Identifiers used to specify the placement of controls on the map.
 * Controls are positioned relative to other controls in the same layout position.
 * Controls that are added first are positioned closer to the edge of the map.
 * +----------------+
 * + TL    TC    TR +
 * + LT          RT +
 * +                +
 * + LC          RC +
 * +                +
 * + LB          RB +
 * + BL    BC    BR +
 * +----------------+
 * Elements in the top or bottom row flow towards the middle.
 * Elements at the left or right sides flow downwards.
 *
 * @author kalle
 * @since 2011-04-23 22.25
 */
public enum ControlPosition {
  /**
   * Elements are positioned in the center of the bottom row.
   */
  BOTTOM_CENTER,
  /**
   * Elements are positioned in the bottom left and flow towards the middle. Elements are positioned to the right of the Google logo.
   */
  BOTTOM_LEFT,
  /**
   * Elements are positioned in the bottom right and flow towards the middle. Elements are positioned to the left of the copyrights.
   */
  BOTTOM_RIGHT,
  /* Elements are positioned on the left, above bottom-left elements, and flow upwards. */
  LEFT_BOTTOM,
  /* Elements are positioned in the center of the left side. */
  LEFT_CENTER,
  /* Elements are positioned on the left, below top-left elements, and flow downwards. */
  LEFT_TOP,
  /* Elements are positioned on the right, above bottom-right elements, and flow upwards. */
  RIGHT_BOTTOM,
  /* Elements are positioned in the center of the right side. */
  RIGHT_CENTER,
  /* Elements are positioned on the right, below top-right elements, and flow downwards. */
  RIGHT_TOP,
  /* 	Elements are positioned in the center of the top row. */
  TOP_CENTER,
  /* Elements are positioned in the top left and flow towards the middle. */
  TOP_LEFT,
  /* Elements are positioned in the top right and flow towards the middle. */
  TOP_RIGHT
}
