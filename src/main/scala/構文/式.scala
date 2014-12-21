package 構文

abstract class 式

case class 文字列(val 値:String) extends 式

case class 複合式(val 値:Array[式]) extends 式 // Compound
case class 分岐(val 条件:式, val 成立:式, val 不成立:式) extends 式
case class 繰返(val 本体:式) extends 式
case class 脱出(val 条件:式) extends 式

case class 識別子(val 値:String) extends 式
case class 代入(val 名前:識別子, val 値:式) extends 式


case class 二項演算(val 式1:式, 式2:式, 演算:演算子) extends 式 // Binary

abstract class 演算子 extends 式 // Operator
abstract class 論理演算子 extends 演算子 // Boolean_op
abstract class 関係演算子 extends 演算子 // Relational_op
abstract class 算術演算子 extends 演算子 // Arithmetic_op

/*
case class 論理積 extends 論理演算 // And
case class 論理和 extends 論理演算 // Or
 */

abstract class 定数 extends 式 // Constant
case class 論理定数(val 値:Boolean) extends 定数 // Boolean_constant
case class 整数定数(val 値:Int) extends 定数 // Integer_constant
