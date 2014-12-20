import org.scalatest.FunSuite

import 構文._

class 式仕様 extends FunSuite {
  test("真偽値") {
//    intercept[NoSuch] {
      new 式
//    }
  }

  test("式の仕様") {
    val x = 真偽値(true)
    println("abc")
    assert(x.値 == true)

    val y = 複合式(Array(真偽値(true),真偽値(true)))

    val z = 分岐(
      真偽値(true),
      複合式(Array(真偽値(true),真偽値(true))),
      複合式(Array(真偽値(true),真偽値(true))))
  }
}
