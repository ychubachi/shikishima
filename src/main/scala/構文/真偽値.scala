package 構文

case class 真偽値(val 値:Boolean) extends 式
case class 整数値(val 値:Int) extends 式

case class 複合式(val 値:Array[式]) extends 式
case class 分岐(val 条件:式, val 成立:式, val 不成立:式)
    extends 式

case class 識別子(val 値:String) extends 式
case class 代入(val 名前:識別子, val 値:式) exends 式
