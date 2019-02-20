	int allocate(int size) {
		int gapSize = 0;        // Größe der aktuell betrachteten Lücke
		int end = position;     // Beginne bei aktueller Position
		int start = position;
		
		// durchsuche Heap hinter position
		while (gapSize < size && end != heapSize) {
			start = allocationBitmap.nextFree(end);
			if (start == -1)   		// Am Heapende angekommen?
				break;
			end = allocationBitmap.nextUsed(start);
			if (end == -1)      	// Am Heapende angekommen?
				end = heapSize;
			gapSize = end - start;
		}
		
		// Prüfe, ob gefundene Lücke groß genug
		if (gapSize >= size) {       
			position = (start + size) % heapSize;   	// position anpassen
			for (int i = start; i < start + size; i++)  // Bitvektor anpassen
				allocationBitmap.setBit(i, true);
			return start;
		}
		
		// Suche am Heapanfang fortsetzen
		...
		
		return -1;      // keine hinreichend große Lücke gefunden
	}