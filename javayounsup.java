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
//07:要素のインデックスを取得（indexOf）
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits.indexOf("orange"));
    }
}
// 出力1

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        
        System.out.println(members.indexOf("rokumura"));
    }
}
//出力 2


import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits.contains("grape"));
    }
}
//出力 false
//08:要素の有無を確認（contains）
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits.contains("apple"));
    }
}
//true

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        System.out.println(members.contains("rokumura"));
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.remove(1);

        System.out.println(fruits);
        System.out.println(fruits.size());
        
    }
}

// [apple, lemon]
// 2
//削除10:要素の削除（remove）
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        // 以下にコードを追加
members.remove(0);

        System.out.println(members);
    }
}

//削除10:全要素の削除（clear）
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        // 以下にコードを追加
        members.clear();
        
        System.out.println(members);
    }
}

// 11:要素の並び替え（Collections.sort）
import java.util.ArrayList;
import java.util.Collections;


 //＃11:要素の並び替え（Collections.sort）
public class Main {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(14);
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);

        //整列前

             Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
    }
}
// [1, 14, 10, 5, 8, 2]
// [14, 10, 8, 5, 2, 1]
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        // 以下にコードを追加
       Collections.sort(numbers);
    
        System.out.println(numbers);
    }
}
[1, 3, 8]

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        
        Collections.sort(numbers, Collections.reverseOrder());
        
        System.out.println(numbers);
    }
}
