public class Main {
    public static void main(String... args) {
        Integer i = 10;

        if (i == 10) {
            System.out.println("iは10");
        }
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(30);
        scores.add(70);
        scores.add(90);
        scores.add(69);
     
        scores.forEach(score -> {
            if (score >= 70) {
                System.out.println("合格");
            } else {
                System.out.println("不合格");
            }
        });
    }
}

public class Main {
    public static void main(String... args) {
        String s= "ABC";
        if (s=="PAIZA"){
           System.out.println("sはpaizaです。");
        }else{
            System.out.println("sはpaizaではないです。");
        }
    }
}


import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        
        members.add("kirishima");
        members.add("rokumura");

        members.forEach(member -> {
            if (member.contains("kirishima")) {
                System.out.println(member + "はmembersに含まれています");
            } else {
                System.out.println(member + "はmembersに含まれていません");
            }
        });
    }
}



public class Main {
    public static void main(String... args) {

        Integer x = 37;
        Integer y = 16;
        // 以下のコードを修正
        if (x % 2 == 0 || y % 2 == 0) {
            System.out.println("xとyのいずれか、もしくは両方とも偶数です");
        } else {
            System.out.println("xとyは奇数です");
        }
    }
}

public class Main {
    public static void main(String... args) {
        Integer japanese = 80;
        Integer mathematics = 80;
        if (japanese >= 80 && mathematics >= 80) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
    }
}


public class Main {
    public static void main(String... args) {

        Integer x = 30;
        Integer y = 18;
        // 以下のコードを修正
        if (x%2==0  && y%2==0 ) {
            System.out.println("xとyは偶数です");
        } else {
            System.out.println("xとyのいずれか、もしくは両方とも奇数です");
        }
    }
}

public class Main {
    public static void main(String... args) {
        // System.out.println(0);
        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);
        // System.out.println(5);
        for (Integer i=0; i<6; i++){
            System.out.println(i);
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String... args) {
        for (Integer i=0; i<11; i++){
            System.out.println(i);
        }
    }
}



import java.util.*;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("grape");

        // System.out.println(fruits.get(0));
        // System.out.println(fruits.get(1));
        // System.out.println(fruits.get(2));
        // System.out.println(fruits.get(3));
        // System.out.println(fruits.get(4));
        for (Integer i=0; i<fruits.size(); i++){
            System.out.println(fruits.get(i));
        }
    }
}


import java.util.*;

public class Main {
    public static void main(String... args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("kirishima");
        users.add("rokumura");
        users.add("midorikawa");
 for (Integer i=0; i<users.size(); i++){
            System.out.println(users.get(i));
        }
    }
} 

import java.util.*;
public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("grape");
    //for 
     for (int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }
        //forEach 
    fruits.forEach(fruit-> System.out.println(fruit));
    //
    for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String... args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("kirishima");
        users.add("rokumura");
        users.add("midorikawa");
         for (int i = 0; i < users.size(); i++){
               System.out.println(users.get(i));
        }
        //forEach
        users.forEach(user -> System.out.println(user));
    //
        for (String user : users){
                System.out.println(user);
        }
    }
} 
public class Main {
    public static void main(String... args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + "日目");
            if(i==6||i==7){
                 System.out.println("今日はお休み");
            }
        }
    }
} 





