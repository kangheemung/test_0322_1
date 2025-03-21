public static void main(String[] args) {
    // 親ブロックで宣言された変数str
    int number3 = 2;
    int number4 = 3;
    boolean isOddNumber = false;
    int total=number3+number4;
    // 比較した結果をそのまま代入
        isOddNumber = (number3 + number4) % 2 == 1;
    if (isOddNumber) {
        System.out.println("奇数です");
    } else {
        System.out.println("偶数です");
    }
}


public static void main(String[] args) {

    int number5 = 3;
    int number6 = 5;

    int total=(number5*number6);
    if (total % 3 == 0 && total % 5 == 0) {
        System.out.println("3と5の倍数です");
    }
}


class Sample5 {
    public static void main(String[] args) {
        int number7 = 4;
        int number8 = 5;
        int product = (number7 * number8);

        if (product % 2 == 0 || product % 3 == 0) {
            System.out.println("2か3の倍数です");
        }
    }
}
class Sample6 {
    public static void main(String[] args) {
        int number9 = 6;
        int number10 = 8;
        // 偶数と奇数の組み合わせなので足し合わせた結果が奇数か確認する
        int sum = number9 + number10;

        if (sum % 2 == 1) {
            System.out.println("偶数と奇数の組み合わせです");
        }
    }
}


public class Main {
    public static void main(String[] args) {
         int totalSum = 0;
        for (int i = 1; i < 30; i++) {
           if (i % 3==0)
           {
            totalSum += i ;
            }
        }
         System.out.println("合計:"+totalSum);
    }
}
