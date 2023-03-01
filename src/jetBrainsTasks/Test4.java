package jetBrainsTasks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        String sDate1 = "31/12/1998";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        Book book1 = new Book("Name1", "Surname1", 2, date1);
        Book book2 = new Book("Name2", "Surname1", 10, date1);
        Book book3 = new Book("Name3", "Surname3", 20, date1);
        Book book4 = new Book("Name3", "Surname2", 70, date1);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        System.out.println(groupByAuthor(books));
        Map<String, List<Book>> map = new HashMap<>();
        map = books.stream().collect(Collectors.groupingBy(Book::getAuthor));
        System.out.println(map);


    }

    //    public static Map<String, List<Book>> groupByAuthor(List<Book> books) {
//        Map<String, List<Book>> map = new HashMap<>();
//        for (Book book : books) {
//            if (!map.containsKey(book.getAuthor())) {
//                map.put(book.getAuthor(), new ArrayList<>());
//            }
//            map.get(book.getAuthor()).add(book);
//        }
//        return map;
//    }
    public static Map<String, List<Book>> groupByAuthor(List<Book> books) {
        Map<String, List<Book>> map = new HashMap<>();
        for (Book book : books) {
            if (!map.containsKey(book.getAuthor())) {
                map.put(book.getAuthor(), new ArrayList<>());
            }
            map.get(book.getAuthor()).add(book);
        }
        return map;
    }
}