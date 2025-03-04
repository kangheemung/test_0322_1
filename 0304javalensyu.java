// 加算 ... 足し算
int addition = 3 + 3; // 6
// 減算 ... 引き算
int subtract = 3 - 3; // 0
// 乗算 ... 掛け算
int multiplication = 3 * 3; // 9
// 除算 ... 割り算
int division = 3 / 3; // 1
// 剰余算 ... あまり算
int residueCalculation = 3 % 3; // 0
// キャストなし
2 / 3         // 0

// double型へのキャスト
2 / (double) 3 // 0.6666666666666666
(double) 2 / 3 // 0.6666666666666666

// float型へのキャスト
(float) 2 / 3  // 0.6666667
2 / (float) 3  // 0.6666667

// double型の値を計算に組み込む
2 / 3.0

// float型の値を計算に組み込む
2 / 3f
int num1 = 2;
// 加算
num1 += 3; // 5
// 減算
num1 -= 1; // 4
// 乗算
num1 *= 3; // 12
// 除算
num1 /= 2; // 6
// 剰余算
num1 %= 5; // 1
int num = 5;

// 前置インクリメント
++num; // 6
// 後置インクリメント
num++; // 7
// 前置デクリメント
--num; // 6
// 後置デクリメント
num--; // 5


int num = 5;

// この行だけ画面に出力後、加算される
System.out.println(num++); // 5
System.out.println(num); // 6
System.out.println(++num); // 7




class Sample1 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);
    }
}
class Sample1 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;
        String message = "number1とnumber2の合計は";
        System.out.println( message + (number1 + number2)+ "です。");
    }
}


int num = 5;
boolean flg = false;

System.out.println(num == 6); // false
System.out.println(num == 5); // true
System.out.println(flg == true); // false
System.out.println(flg == false); // true

System.out.println(num < 5); // false
System.out.println(num <= 5); // true
System.out.println(num > 5.44); // false
System.out.println(num >= 5.1f); // false

// boolean型は大小を比べられないためコンパイルエラーになります
System.out.println(flg > false);
System.out.println(flg < 1);


// これはtrue
String str1 = "a";
String str2 = "a";
boolean flg = str1 == str2; // true

// newキーワードでも用意可能です。別々にメモリに保存されます
str1 = new String("a");
str2 = new String("a");
// newキーワードを生成した文字列同士の比較演算結果は、falseとなります
flg = str1 == str2; // false

// 文字連結などを行なった場合もfalseとなります
str1 = str1 + "b";
str2 = str2 + "b";
flg = str1 == str2; // false


String str1 = "a";
String str2 = "a";
str1 = str1 + "b";
str2 = str2 + "b";

// 文字列.equals(文字列);
str1.equals(str2); // true


public class Main{
    public static void main(String[] args){
     // String型は特殊で同じ文字列が代入された場合、同じ参照先が使われます
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2); // 同一かどうか → true
        System.out.println(str1.equals(str2)); // 同値かどうか → true

// 別々に生成されたstr3とstr4は別々の参照先となる
        String str3 = new String("a");
        String str4 = new String("a");
        System.out.println(str3 == str4); // 同一かどうか → false
        System.out.println(str3.equals(str4)); // 同値かどうか → true
   }
}


int num = 5;
double d = 5.5;
float f = 10.1f;
String strNum = "5";
String strD = "5.5";
String strF = "10.1f";

// 文字列は数値と比較できないため次の3行はコンパイルエラーになります
System.out.println(num == strNum);
System.out.println(d == strD);
System.out.println(f == strF);

// 文字列をそれぞれ見合った型に変換します

// intに変換
System.out.println(num == Integer.parseInt(strNum)); // true
// doubleに変換
System.out.println(d == Double.parseDouble(strD)); // true
// floatに変換
System.out.println(f == Float.parseFloat(strF)); // true

class Sample1 {
    public static void main(String[] args) {
        int number1 = 103;
        int number2 = 105;
        boolean isOddNumber = false;
         isOddNumber = (number1 + number2) % 2 == 1;

          System.out.println(isOddNumber);
    }
}
int num1 = 5;
int num2 = 4;

// 論理積 ... 1つ目がTRUE且つ、2つ目がTRUEかどうか
num1 >= 5 && (num1 + num2) >= 10; // false
num1 >= 5 && (num1 + num2) > 7; // true

// 論理和 ... 1つ目がTRUEまたは、2つ目がTRUEかどうか
num1 >= 5 || num2 >= 10; // true
num1 < 5 || num2 == 4; // true
num1 < 5 || num2 >= 10; // false
// 否定 ... booleanの反転を行う
boolean flg3 = false;
boolean flg4 = true;
!flg3; // true
!flg4; // false
!(flg3 == true); // true
!(flg4 == true); // false

// 他の論理演算と組み合わせることもあります
!(flg3 == true && flg4 == true); // true
!(flg3 == true || flg4 == true);


class Sample1 {
    public static void main(String[] args) {
       int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
         // 以下の記述も可
        // int[] nums = {1, 2, 3};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
    }
}