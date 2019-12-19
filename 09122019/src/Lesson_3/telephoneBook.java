package Lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class telephoneBook {
    public HashMap<String, ArrayList<String>> book = new HashMap<>();

    public telephoneBook(HashMap<String, ArrayList<String>> new_book) {
        book = new_book;
    }

    public void add(String secondname, String number) {

        if (this.book.containsKey(secondname)) {
            ArrayList<String> temp = this.book.get(secondname);
            temp.add(number);
            this.book.put(secondname, temp);
        } else {
            ArrayList<String> nw = new ArrayList<>();
            nw.add(number);
            this.book.put(secondname, nw);
        }
    }

    public void get(String secondname){
        if (this.book.containsKey(secondname)){
            ArrayList<String> temp = new ArrayList<>();
            temp=book.get(secondname);
            System.out.println(secondname+":");
            System.out.println(this.book.get(secondname).toString());

            }
        else {
            System.out.println("Нет номмера человека с такой фамилией: "+ secondname);
        }
        }


    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> book = new HashMap<>();
        ArrayList<String> first= new ArrayList<String>();
        first.add("8905068406");
        book.put("Black",first);
        telephoneBook myBook = new telephoneBook(book);
        myBook.add("Black","84968967484");
        myBook.add("Kevinston","8657394593");
        myBook.add("Davidson","89467568384");
        myBook.get("Black");
        myBook.get(("Karlinsky"));
    }
}
