package しきしま

import org.scalatest.FunSuite

import しきしま._

class 具象表現仕様 extends FunSuite {
  test("定数") {
    assert(具象構文.出力(定数(true)) == "真")
    assert(具象構文.出力(定数(false)) == "偽")
    assert(具象構文.出力(定数(0)) == "0")
    assert(具象構文.出力(定数(99)) == "99")
  }

  test("変数") {
    assert(具象構文.出力(識別子("名前")) == "名前")
  }
  
  test("代入") {
    assert(具象構文.出力(代入(識別子("自分"), 識別子("名前"), 定数("太郎"))) == 
      "自分の名前は太郎である")
    assert(具象構文.出力(代入(識別子("相手"), 識別子("成人"), 定数(true))) == 
      "相手の成人は真である")
  }
  
  test("引数") {
//    assert(具象構文.出力(引数(変数("縦"), 変数("横"))))
  }

}
