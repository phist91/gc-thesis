public class Settings {
	/**
	 * Anzahl der Heapspalten.
	 */
	public static int HEAP_COLS = 40;
	/**
	 * Anzahl der Heapzeilen.
	 */
	public static int HEAP_ROWS = 20;
	/**
	 * Gesamtgröße des Heaps.
	 */
	public static int HEAP_SIZE = HEAP_COLS * HEAP_ROWS;
	/**
	 * Animationsdauer in Millisekunden.
	 */
	public static int ANIMATION_SPEED = 200;
	/**
	 * Untere Schranke für Objektgröße.
	 */
	public static int MIN_OBJECT_SIZE = 2;
	/**
	 * Obere Straße für Objektgröße.
	 */
	public static int MAX_OBJECT_SIZE = 30;
	/**
	 * Verzweigungsgrad.
	 */
	public static double CONNECTIVITY = 0.1;
	/**
	 * Verwaisungsgrad.
	 */
	public static double REFERENCE_DELETION = 0.3;
	/**
	 * Wahrscheinlichkeit für Basisobjekte.
	 */
	public static double ROOT_PROBABILITY = 0.2;
	/**
	 * Zellenbreite.
	 */
	public static int CELL_WIDTH = 20;
	
	// Eigenschaften der Anwendung
	/**
	 * Zellenhöhe.
	 */
	public static int CELL_HEIGHT = 30;
	/**
	 * Breite der Zeichenfläche.
	 */
	public static int CANVAS_WIDTH = HEAP_COLS * CELL_WIDTH + 2 * MARGIN_HORIZ;
	/**
	 * Höhe der Zeichenfläche.
	 */
	public static int CANVAS_HEIGHT = HEAP_ROWS * CELL_HEIGHT + 2 * MARGIN_VERT;