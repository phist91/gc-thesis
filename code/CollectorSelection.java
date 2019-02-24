	private static GarbageCollectorSelection marksweep = 
		new GarbageCollectorSelection(
			"Mark Sweep",
			() -> new CollectionController<NaiveAllocator>(
					false,
					new NaiveAllocator(Settings.heapSize()),
					new MarkSweep<NaiveAllocator>())
	);
	
	private static GarbageCollectorSelection lisp2 = 
		new GarbageCollectorSelection(
			"Lisp 2",
			() -> new CollectionController<NaiveAllocator>(
					false,
					new NaiveAllocator(Settings.heapSize()),
					new Lisp2<NaiveAllocator>())
	);

	private static GarbageCollectorSelection semispace =
		new GarbageCollectorSelection(
			"Halbraumverfahren",
			() -> new CollectionController<SemispaceAllocator>(
					false,
					new SemispaceAllocator(Settings.heapSize()),
					new SemispaceCollector<SemispaceAllocator>())
	);
	
	public static final GarbageCollectorSelection[] collectors = {
			marksweep, lisp2, semispace, naiveAlloc, semispaceAlloc
	};