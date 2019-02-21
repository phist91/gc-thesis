public class Lisp2<T extends Allocator> extends MarkSweep<T> {
	@Override
	void sweep() {
		controller.getObjects().sort(new AddressComparator());
		int newPosition = 0;
		ArrayList<HeapObject> toRemove = new ArrayList<>();
		for (HeapObject obj : controller.getObjects())
			if (obj.getMark() == WHITE)
				toRemove.add(obj);
			else {
				controller.getAllocator().moveObject(obj, newPosition);
				newPosition += obj.getSize();
			}
			
		toRemove.forEach(obj -> controller.getObjects().remove(obj));
		// Heap hinter kompaktierten Bereich bereinigen
		controller.getAllocator().clearRange(newPosition, controller.getAllocator().getHeapSize() - 1);
		// Allokator-Position hinter kompaktierten Bereich setzen
		controller.getAllocator().setPosition(newPosition);		
		controller.getObjects().forEach(obj -> obj.setMark(WHITE));
	}