	void markStart() {
		toScan.clear();
		for (HeapObject obj : controller.getRoots())
			if (obj.getMark() == WHITE) {
				obj.setMark(GRAY);
				toScan.add(obj);
				mark();
			}
	}
	
	void mark() {
		while (!toScan.isEmpty()) {
			HeapObject obj = toScan.remove();
			obj.setMark(BLACK);
			for (HeapObject ref : obj.getPointers())
				if (ref.getMark() == WHITE) {
					ref.setMark(GRAY);
					toScan.add(ref);
				}
		}
	}
	
	void sweep() {
		// Objekte nach Adresse sortieren, um lineare Traversierung zu simulieren
		controller.getObjects().sort(new AddressComparator());
		ArrayList<HeapObject> toRemove = new ArrayList<>();	// Löschkandidaten
		for (HeapObject obj : controller.getObjects())
			if (obj.getMark() == WHITE)
				toRemove.add(obj);
			else obj.setMark(WHITE);
		toRemove.forEach(obj -> {
			controller.getAllocator().free(obj);
			controller.getObjects().remove(obj);
		});
	}