複数条件の設定

条件分岐というくらいなので、複数の条件の設定が可能です。

elseやelse ifを利用することで、複数条件記述することができます。

else if

ifの条件が合致しなかった場合に、別条件を用意したい場合にelse ifを利用します。

else ifはifの後に任意の数、立て続けに記述することが可能です。

次の例は、numが10以上であればgreat、7以上であればgood、 5以上であればokと出力されます。

3つの条件いずれにも合致しない場合は、何も処理されません。

今回の例ではint numは6なのでokと出力されます。

int num = 6;
// numが10以上だったら処理
if (num >= 10) {
    System.out.println("great");
// numが7以上だったら
} else if (num >= 7) { // 上の条件が合致しなければ処理
    System.out.println("good");
// numが5以上だったら
} else if (num >= 5) { // 立て続けに条件をかける
    System.out.println("ok");
}

else

条件分岐においてifの条件にもelse ifの条件にも合致しないとき、特定の処理を実行したいという場合はelseを利用します。

次の例ではif、else if共にいずれも合致しないため、badと出力されます。

int num = 0;
// numが10以上だったら処理
if (num >= 10) {
    System.out.println("great");
// numが7以上だったら
} else if (num >= 7) { // 上の条件が合致しなければ実行される
    System.out.println("good");
// numが5以上だったら
} else if (num >= 5) { // 立て続けに条件をかける
    System.out.println("ok");
// 上の条件いずれにも合致しなければ処理
} else {
    System.out.println("bad");
}

if文の構文パターンを覚えよう

条件分岐の構文その1としてif文を学習しました。

if、else if、elseの組み合わせは一見複雑に見えるかもしれませんが、構文の組み合わせのパターンは決まっています。

混乱しないようにおさらいしておきましょう。

else ifの数が異なることはありますが、全部で6パターンです。

// パターン1
if (条件) {
    // 処理
}

// パターン2
if (条件1) {
    // 処理1
} else {
    // 処理2
}

// パターン3
if (条件1) {
    // 処理1
} else if (条件2) {
    // 処理2
}

// パターン4
if (条件1) {
    // 処理1
} else if (条件2) {
    // 処理2
} else if (条件n) {
    // 処理n
} /* 以降 else ifが任意の数続く */

// パターン5
if (条件1) {
    // 処理1
} else if (条件2) {
    // 処理2
} else {
    // 処理3
}

// パターン6
if (条件1) {
    // 処理1
} else if (条件2) {
    // 処理2
} else if (条件n) {
    // 処理n
}
/* 以降 else ifが任意の数続く */
else {
    // 処理last
}

変数のスコープ

Javaの変数はどこで宣言されたかによって利用可能な有効範囲が変わります。

この有効範囲のことをスコープと言います。

条件分岐における { から } までをブロックと言います。

メインメソッドの{}もブロックの一種です。

public static void main(String[] args) { // メソッドのブロックです
    if (条件) { // if文のブロックです
        処理
    }
}

今回はif文スコープについての説明です。

ブロックには親子関係が存在します。

if文のブロックはメソッドのブロックにとって子のブロックとなります。

親ブロックで宣言された変数は子ブロックで利用が可能です。

public static void main(String[] args) {
    // 親ブロックで宣言された変数str
    String str = null;
    int num = 10;
    if (num >= 10) {
        // 子ブロックで代入など利用可能
        str = "ok";
    }
    System.out.println(str); // okと画面に出力
}

//対して子ブロックで宣言された変数を親ブロックで利用することはできません。

//子ブロック内でのみ利用が可能です。

public static void main(String[] args) {
    int num = 10;
    if (num >= 10) {
        // 子ブロックで宣言された変数
        String str;
        str = "ok"; // 同じブロック内では利用可能
    }
    str = "ok"; // 変数を利用できず、コンパイルエラーになります
}