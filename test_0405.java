private Calculator sut;
@BeforEach
public void setUp(){
    this.sut=new Calculator();
}
@AfterEach
public void tearDown(){
    this.sut.null;
}
// @Test
// void //テスト実行(){
//     //処理
// }
@Test 
public void 整理をー除計算する()throws Exception{
    //ここでArithneticExceptionが発生
    Integer actual = 5 / 0;
}
@Test
public void 整理を0除算する throws Exception {
    assertThatThrownBy(()=>{
        Interger actual = 5 / 0;
    })
    .isInstanceOf()ArithemticException.class)
    .hasMessage("/by zero");
}
isEmpty();//空文字の検証
//assertThat("").Empty();
isNull();//Nullであうかの検証
//assertThat(null).isNull();
inNotNull();//Null以外であるかの検証
//assertThat("").isNotNull();
isBetween(int start , int end);//実測値が指定の範囲ないか検証
//assertThat(5).isBetween(4,6);
contains(object...values);//実測値が設定の範囲ないが含まれるが検証
                        //配列やコレクションに値が含まれる検証
//assertThat("abcde").contains("b","d");
//assertThat({1,2,3}).contains(1,3)