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


public static void main(String[] args) {

    int number7  = 3;
    int number8 = 5;

    int total=(number5*number6);
    if (total % 2 == 0 || total % 3== 0) {
        System.out.println("2か3の倍数です");
    }
}