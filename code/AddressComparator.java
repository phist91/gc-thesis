public class AddressComparator implements Comparator<HeapObject> {
	public int compare(HeapObject first, HeapObject second) {
		if (first.getAddress() == second.getAddress())
			return (Integer.compare(first.getId(), second.getId()));
		else return Integer.compare(first.getAddress(), second.getAddress());
	}
}