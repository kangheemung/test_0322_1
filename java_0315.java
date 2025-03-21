public class Main {
    public static void main(String[] args) {
        int number = 0;

        // 出力結果) 0 1 2 3 4 5
        while (number <= 5) {
            System.out.println(number);
            number++;
        }
    }
}
//次の変数を用意し、for文を利用して各要素の二乗された値を出力しなさい。
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[3];
            nums[0] = 2;
            nums[1] = 4;
            nums[2] = 6;
        for(int i=0; i< nums.length; i++) {
            System.out.println(nums[i]*nums[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                System.out.println("繰り返し");
                break;
            }
            System.out.println(i);
        }
        System.out.println("処理終了");
    }
}
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                break;
            }
         System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                continue;
            }
         System.out.println(i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        for (int i = 1000; i < 2000; i++) {
            if (i % 10 == 7) { // 一の位が7のときとは、10で割ったあまりが7のとき
                System.out.print(i);
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0|| i % 7 == 0) {
                count++;
            }
        }
        System.out.println(count + "個");
    }
}

public class Main {
    public static void main(String[] args) {
        int count=0;
        for (int i = 99; i >= 1; i--) {
            if (i % 3 == 0|| i % 7 == 0) {
                count++;
                if (count == 5) { 
                    System.out.println("5番目に大きい数字: " + i);
                    break;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 3; i++) {
                for (int j = 0; j < i; j++) { // 行数分の数字を出力するループ
                System.out.print("0");
            }
             System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 0; i < rows; i++) {
            // スペースを出力
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // 数字を出力
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("0");
            }
            // 改行
            System.out.println();
        }
    }
}

class Advanced6 {
    public static void main(String [] args) {

        int width = 5;
        int height = 5;
        int start = (width - 1) / 2;
        int end = start;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(j >= start && j <= end ? 0 : " ");
            }

            System.out.print("\n");

            if (i < (height - 1) / 2) {
                start --;
                end ++;
            } else {
                start ++;
                end --;
            }
        }
    }
}