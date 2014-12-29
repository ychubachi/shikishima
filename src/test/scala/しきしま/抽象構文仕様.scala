package しきしま

import org.scalatest.FunSuite

import しきしま._

class 抽象構文仕様 extends FunSuite {
  test("定数") {
    assert(定数(true).値 == true)
    assert(定数(10).値 == 10)
    assert(定数("こんにちは").値 == "こんにちは")
  }
  
  test("変数") {
    assert(識別子("x").名 == "x")
    assert(識別子("年齢").名 == "年齢")
  }

  test("代入") {
    val x = 代入(識別子("自分"), 識別子("名前"), 定数("田中太郎"))
    assert(x.対象 == 識別子("自分"))
    assert(x.識別子 == 識別子("名前"))
    assert(x.式 == 定数("田中太郎"))
  }
  
  test("仮引数") {
    val x = 仮引数(識別子("縦"), 識別子("横"))
    assert(x.識別子列.length == 2)
  }
  
  test("関数") {
    val x = 関数(仮引数(識別子("縦"), 識別子("横")), 定数(0)) // 縦 * 横
    assert(x.仮引数.識別子列.length == 2)
    assert(x.本体 == 定数(0))
    
    val y = 代入(識別子("四角形"), 識別子("面積"), x) // バインド
    assert(y.対象 == 識別子("四角形"))
    assert(y.識別子 == 識別子("面積"))
    assert(y.式 == x)
  }
  
  test("引数") {
    val x = 引数()
    assert(x.式列.length == 0)
    val y = 引数(定数(true))
    assert(x.式列.length == 1)
    val z = 引数(定数(true), 定数(1))
    assert(z.式列.length == 2)
  }
  
  test("操作") {
    val x = 操作(定数(1), 識別子("+"), 引数(定数(2))) // 1.+(2)
    assert(x.対象 == 定数(1))
    assert(x.識別子 == 識別子("+"))
    assert(x.引数 == 引数(定数(2)))
  }
  
  test("分岐節") {
    val x = 分岐節(定数(true), 定数(1))
    assert(x.条件 == 定数(true))
    assert(x.式 == 定数(1))
  }

  test("分岐") {
    val z = 分岐(分岐節(定数(true), 定数(1)), 分岐節(定数(false), 定数(0)))
  }
  
  test("複合式") {
    val x = 複合式(定数(true),定数(true))
  }
}
