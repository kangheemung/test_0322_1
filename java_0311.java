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
class Sample4 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;
        String message = "number1とnumber2の合計は";

        System.out.println(message + (number1 + number2) + "です。");
    }
}

// int num = 5;
// double d = 5.5;
// float f = 10.1f;
// String strNum = "5";
// String strD = "5.5";
// String strF = "10.1f";

// // 文字列は数値と比較できないため次の3行はコンパイルエラーになります
// System.out.println(num == strNum);
// System.out.println(d == strD);
// System.out.println(f == strF);

// // 文字列をそれぞれ見合った型に変換します

// // intに変換
// System.out.println(num == Integer.parseInt(strNum)); // true
// // doubleに変換
// System.out.println(d == Double.parseDouble(strD)); // true
// // floatに変換
// System.out.println(f == Float.parseFloat(strF)); // true

class Sample5 {
    public static void main(String[] args) {
        int number1 = 103;
        int number2 = 105;
        boolean isOddNumber = false;
        // 比較演算結果の代入
        isOddNumber = (number1 + number2) % 2 == 1;

        System.out.println(isOddNumber);
    }
}
// 比較演算結果の代入と出力

// 次の変数を初期化しなさい。

// int number1 = 103;
// int number2 = 105;
// boolean isOddNumber = false;

// int型の変数2つを加算した結果によって以下の値をisOddNumberに代入し、isOddNumberを出力しなさい。

// 代入される内容

// 奇数なら ... true
// 偶数なら ... false


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
// 配列の基本操作1

// 次の要素を持つ配列を用意し、配列内に保存した要素を添字0番目から順に出力しなさい。

// [1, 2, 3]

// 出力結果

// 1
// 2
// 3