import org.scalatest.FunSuite

import 構文._

class 式仕様 extends FunSuite {
  test("代入") {
    val x = 代入(識別子("変数名"), 文字列定数("あいうえお"))
    assert(x.toString == "代入(識別子(変数名),文字列定数(あいうえお))")
  }

  test("分岐") {
    val z = 分岐(
      論理定数(true), // 条件
      複合式(Array(論理定数(true),論理定数(true))), // 成立
      複合式(Array(論理定数(true),論理定数(true)))) // 不成立
  }

  test("式の仕様") {
    val x = 論理定数(true)
    println("abc")
    assert(x.値 == true)

    val y = 複合式(Array(論理定数(true),論理定数(true)))

  }
}
