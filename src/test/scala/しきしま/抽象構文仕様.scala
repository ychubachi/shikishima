package しきしま

import org.scalatest.FunSuite

import しきしま._

class 式仕様 extends FunSuite {
  test("代入") {
    val x = 代入(変数("変数名"), 文字列定数("あいうえお"))
    assert(x.toString == "代入(変数(変数名),文字列定数(あいうえお))")
  }

  test("分岐") {
    val z = 分岐(
      論理定数(true), // 条件
      複合式(論理定数(true),論理定数(true)), // 成立
      複合式(論理定数(true),論理定数(true))) // 不成立
  }

  test("式の仕様") {
    val x = 論理定数(true)
    assert(x.値 == true)

    val z = 複合式(論理定数(true),論理定数(true))
  }
  
  test("任意定数") {
    assert(任意定数(true).値 == true)
    assert(任意定数(10).値 == 10)
    assert(任意定数("こんにちは").値 == "こんにちは")
  }
}
