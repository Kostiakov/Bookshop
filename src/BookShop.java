import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import literature.Book;
import literature.Literature;
import literature.LiteratureFactory;
import literature.LiteratureType;
import literature.Magazine;

public class BookShop {
	

	public static void main(String[] args) {
		List <Literature> bookList = new ArrayList<>();
		Book book1 = new Book("���", "�������", "������-����", 1961);
		Book book2 = new Book("������", "���� � ���������", "Harcourt", 1962);
		Book book3 = new Book.Builder().withAuthor("���������").withTitle("������ � ����").withYear(1952).build();
		Magazine magazine1 = new Magazine("Times", "News Corporation", 2019, 365);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(magazine1);
		while(true) {
			System.out.println("������� 1 ��� ������ ���� ����������, 2 ��� ���������� �����, 3 ��� ������ �� ���������");
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			if(i==1) {
				System.out.println(bookList);
			}
			if(i==2) {
				System.out.println("������� ��� ����������: 1 - �����, 2 - ������");
				int j = scanner.nextInt();
				Literature litera = null;
				if(j==1) {
					System.out.println("������� ��������� ������ ����� Enter");
					System.out.println("�����, ��������, ��������, ���");
					litera = new LiteratureFactory().getLiterature(LiteratureType.BOOK);
					String author = scanner.next();
					String title = scanner.next();
					String publisher = scanner.next();
					int year = scanner.nextInt();
					litera = new Book(author, title, publisher, year);
					bookList.add(litera);
				}
				if(j==2) {
					System.out.println("������� ��������� ������ ����� Enter");
					System.out.println("������������, ��������, ���, ���������� ������� � ���");
					litera = new LiteratureFactory().getLiterature(LiteratureType.MAGAZINE);
					String publisher = scanner.next();
					String title = scanner.next();
					int year = scanner.nextInt();
					int numbersPerYear = scanner.nextInt();
					litera = new Magazine(publisher, title, year, numbersPerYear);
					bookList.add(litera);
				}
			}
			if(i==3) {
				break;
			}
			}
		System.out.println("���������� ������");

	}

}
