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



Java
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