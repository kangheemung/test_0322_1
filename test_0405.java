private Calculator sut;
@BeforEach
public void setUp(){
    this.sut=new Calculator();
}
@AfterEach
public void tearDown(){
    this.sut.null;
}
@Test
void //テスト実行(){
    //処理
}