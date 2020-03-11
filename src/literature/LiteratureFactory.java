package literature;

public class LiteratureFactory {
	
	public Literature getLiterature(LiteratureType type) {
		Literature toReturn = null;
		switch (type) {
		case BOOK:
			toReturn = new Book();
			break;
		case MAGAZINE:
			toReturn = new Magazine();
			break;
		}
		return toReturn;
	}

}
