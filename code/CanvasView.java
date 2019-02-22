public class CanvasView extends JFrame {
	public void refreshFrame(int positionMarker) {
		this.positionMarker = positionMarker;
		this.revalidate();
		this.repaint();		// ruft paintComponent auf
	}
	
	private class CanvasPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, Settings.canvasWidth(), Settings.canvasHeight());
			drawGrid(g);                        // Zeichne Grundraster
			for (HeapObject obj : objects)      // Zeichne jedes Objekt
				drawObject(g, obj);
			drawPositionMarker(g);              // Zeichne Allokatorposition
		}
		
		private void drawObject(Graphics g, HeapObject obj) {
			// Bestimme Startzelle
			int row = obj.getAddress() / Settings.HEAP_COLS;
			int col = obj.getAddress() % Settings.HEAP_COLS;
			int remaining = obj.getSize();   // noch zu zeichnende Zellen
			Color color;
			switch (obj.getMark()) {         // Farbe anhand Markierung festlegen
				case MarkSweep.MS_WHITE:
					color = Settings.COLOR_DEAD; break;
				case MarkSweep.MS_GRAY:
					color = Settings.COLOR_MARKED; break;
				case MarkSweep.MS_BLACK:
					color = Settings.COLOR_LIVE; break;
				...
			}
			
			// Zeichne Objekt Zeile für Zeile
			while (remaining > Settings.HEAP_COLS - col) {
				drawBlock(g, col, row, Settings.HEAP_COLS - col, color);
				remaining = remaining - (Settings.HEAP_COLS - col);
				++row;
				col = 0;
			}
			
			if (remaining > 0)		// Zeichne Reststück
				drawBlock(g, col, row, remaining, color);
			drawObjectStart(g, obj.getAddress() % Settings.HEAP_COLS,
					obj.getAddress() / Settings.HEAP_COLS);
			drawObjectEnd(g, col + remaining, row);
		}
	}
}