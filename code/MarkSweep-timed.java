	private void markStartTimed() {
		toScan.clear();
		// zunächst Iteration über roots
		Iterator<HeapObject> iterator = controller.getRoots().iterator();      
		gcTimer = new Timer(Settings.ANIMATION_SPEED, action -> {
			// mit jeder Timer-Iteration ein Basisobjekt abarbeiten
			if (iterator.hasNext()) {
				HeapObject obj = iterator.next(); 
				if (obj.getMark() == WHITE) {
					obj.setMark(GRAY);
					toScan.add(obj);
					controller.refreshView();      // Anzeige aktualisieren
				}
			} else {              // alle Basisobjekte abgearbeitet
			  gcTimer.stop();     // diesen Timer anhalten
			  markTimed();        // nächste Mark-Phase ausführen
			}
		});
		gcTimer.start();            // starte erzeugten Timer
	}