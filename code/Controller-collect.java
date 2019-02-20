	public void collectGarbage() {
		ctrlView.setInputs(false);    // Eingaben deaktivieren
		killRoots();                  // Basisobjekte vernichten
		killReferences();             // Referenzen vernichten
		gc.collect(true);             // Kollektor auslösen
	}
	
	private void killRoots() {
		ArrayList<HeapObject> toRemove = new ArrayList<>();
		for (HeapObject obj : roots)
			if (ThreadLocalRandom.current().nextDouble() <= Settings.REFERENCE_DELETION)
				toRemove.add(obj);
		toRemove.forEach(obj -> roots.remove(obj));
	}
	
	private void killReferences() {
		ArrayList<HeapObject> toRemove = new ArrayList<>();
		for (HeapObject obj : objects) {
			toRemove.clear();
			for (HeapObject ref : obj.getPointers())
				if (ThreadLocalRandom.current().nextDouble() <= Settings.REFERENCE_DELETION)
					toRemove.add(ref);
			toRemove.forEach(ref -> obj.getPointers().remove(ref));
		}
	}