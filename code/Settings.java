public class Settings {
	public static int HEAP_COLS = 40;
	public static int HEAP_ROWS = 20;
	public static int heapSize() {return HEAP_COLS * HEAP_ROWS;}
	public static int ANIMATION_SPEED = 200;
	public static int MIN_OBJECT_SIZE = 2;
	public static int MAX_OBJECT_SIZE = 30;
	public static double CONNECTIVITY = 0.1;
	public static double REFERENCE_DELETION = 0.3;
	public static double ROOT_PROBABILITY = 0.2;

	// Zur Verfügung stehende Kollektoren
	public static final GarbageCollectorSelection[] collectors =
		{marksweep, lisp2, semispace, naiveAlloc, semispaceAlloc};
}