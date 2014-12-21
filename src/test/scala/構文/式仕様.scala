import org.scalatest.FunSuite

import 構文._

class 式仕様 extends FunSuite {
  test("真偽値") {
    // new 式
  }

  test("式の仕様") {
    val x = 論理定数(true)
    println("abc")
    assert(x.値 == true)

    val y = 複合式(Array(論理定数(true),論理定数(true)))

    val z = 分岐(
      論理定数(true),
      複合式(Array(論理定数(true),論理定数(true))),
      複合式(Array(論理定数(true),論理定数(true))))
  }
}
