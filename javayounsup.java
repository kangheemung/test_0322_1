public class Main {
    public static void main(String... args) {
        Integer x = 10;

        System.out.println(x);
    }
}

public class Main {
    public static void main(String... args) {
        Integer x = 10;
          Integer y = 20;

        System.out.println(--x + 50);
        System.out.println(y-- + 50);
    }
}
//05:インクリメント・デクリメント演算子
public class Main {
    public static void main(String... args) {
        Integer i = 5;
        System.out.println(i);
        i +=1;
        System.out.println(i);
        // 以下にコードを追加
    }
}

public class Main {
    public static void main(String... args) {
        Integer i = 5;
        System.out.println(i);
         i -= 1;
        System.out.println(i);
        // 以下にコードを追加
        
    }
}
public class Main {
    public static void main(String... args) {
        double tax = 0.1;
        System.out.println(tax); 

    }
}

//値が 0.1 である tax を定数で宣言して、出力してください。


public class Main {
    public static void main(String... args) {
        final Integer money = 1000;
        money = 2000;
        System.out.println(money);
    }
}
// Main.java:4: error: cannot assign a value to final variable money
//         money = 2000;
//         ^
// 1 error
// new 演算子
public class Main {
    public static void main(String... args) {
        Item sword = new Item();

    }
}

class Monster {

}


public class Main {
    public static void main(String... args) {
        Monster slime = new Monster();

        // String text = "paiza";
        // Intger x = 100;
        String text = new String("paiza");
        integer x =new integer(100);
        System.out.println(text);
        System.out.println(x);
    }
}

class Monster {
}

public class Main {
    public static void main(String... args) {
        Monster slime = new Monster();

        // String text = "paiza";
        // Intger x = 100;
        String text = new String("paiza");
        Integer x = new Integer(100);
        System.out.println(text);
        System.out.println(x);
    }
}

class Monster {
}

// 01:ArrayList型の変数の宣言方法
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits =new ArrayList<String>();
        System.out.print(fruits);
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        System.out.println(fruits);
    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add(1,"grape");

        System.out.println(fruits);
    }
}


import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add(0,"rokumura");
        //以下にコードを追加


        System.out.println(members);
    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.set(1,"grape");

        System.out.println(fruits);
    }
}
//[apple, grape, lemon]

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        //以下にコードを追加
        
     members.set(members.indexOf("rokumura"), "nara");
        System.out.println(members);
    }
}
// 04:要素の置き換え（set）
// 05:要素の取得（get）
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        String fruit=fruits.get(1);
        System.out.println(fruit);
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");

        String fruit=members.get(1);
                System.out.println(fruit);

    }
}
//:要素数の取得(size)
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        
        System.out.println(members.size());
    }
}
