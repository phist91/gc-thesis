	public void collect() {
		controller.getAllocator().swapSemispaces();
		newPosition = controller.getAllocator().getTarget();
		toScan.clear();
		
		for (HeapObject obj : controller.getRoots())
			update(obj);
		while (!toScan.isEmpty()) {
			HeapObject obj = toScan.remove();
			for (HeapObject target : obj.getPointers())
				update(target);
			obj.setMark(DONE);
		}
		cleanUp();
	}
	
	void update(HeapObject obj) {
		if (obj.getMark() == UNDISCOVERED) {
			obj.setMark(DISCOVERED);
			controller.getAllocator().moveObject(obj, newPosition);
			newPosition += obj.getSize();
			toScan.add(obj);
		}
	}
	
	void cleanUp() {
		ArrayList<HeapObject> toRemove = new ArrayList<>();
		for (HeapObject obj : controller.getObjects())
			if (obj.getMark() != DONE)
				toRemove.add(obj);
			else obj.setMark(UNDISCOVERED);
		
		toRemove.forEach(obj -> controller.getObjects().remove(obj));
		controller.getAllocator().clearSource();
	}