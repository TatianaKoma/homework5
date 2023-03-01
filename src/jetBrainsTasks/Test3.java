package jetBrainsTasks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        String sDate1 = "31/12/1998";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        Book book1 = new Book("Name1", "Surname1", 2, date1);
        Book book2 = new Book("Name2", "Surname2", 10, date1);
        Book book3 = new Book("Name3", "Surname3", 20, date1);
        Book book4 = new Book("Name3", "Surname2", 70, date1);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        System.out.println(totalSoldAfterDate(books, date1));
    }

    //    public static Map<String, Integer> totalSoldAfterDate(List<Book> books, Date date) {
//
//        Map<String, Integer> map = new HashMap<>();
//        for (Book book : books) {
//            if (book.getIssueDate() == date) {
//                if (!map.containsKey(book.getAuthor())) {
//                    map.put(book.getAuthor(), book.getSold());
//                } else {
//                    int totalSold = book.getSold() + map.get(book.getAuthor());
//                    map.put(book.getAuthor(), totalSold);
//                }
//            }
//        }
//        return map;
//    }
    public static Map<String, Integer> totalSoldAfterDate(List<Book> books, Date date) {
        Map<String, Integer> map = new HashMap<>();
        for (Book book : books) {
            if (book.getIssueDate() == date) {
                if (!map.containsKey(book.getAuthor())) {
                    map.put(book.getAuthor(), book.getSold());
                } else {
                    int sum = map.get(book.getAuthor() + book.getSold());
                    map.put(book.getAuthor(), sum);
                }
            }
        }
        return map;
    }
}