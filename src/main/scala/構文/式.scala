package 構文

abstract class 式
case class 複合式(val 値:Array[式]) extends 式

case class 真偽値(val 値:Boolean) extends 式
case class 整数値(val 値:Int) extends 式
case class 文字列(val 値:String) extends 式

case class 分岐(val 条件:式, val 成立:式, val 不成立:式) extends 式
case class 繰返(val 本体:式) extends 式
case class 脱出(val 条件:式) extends 式

case class 識別子(val 値:String) extends 式
case class 代入(val 名前:識別子, val 値:式) extends 式
