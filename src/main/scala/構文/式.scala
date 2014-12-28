package 構文

abstract class 式

case class 複合式(val 値:Array[式]) extends 式 // Compound

case class 分岐(val 条件:式, val 成立:式, val 不成立:式) extends 式
case class 繰返(val 本体:式) extends 式
case class 脱出(val 条件:式) extends 式

case class 識別子(val 値:String) extends 式

case class 代入(val 名前:識別子, val 値:式) extends 式

case class 二項演算(val 式1:式, 式2:式, 演算:演算子) extends 式 // Binary

abstract class 定数 extends 式 // Constant
case class 論理定数(val 値:Boolean) extends 定数 // Boolean_constant
case class 整数定数(val 値:Int) extends 定数 // Integer_constant
case class 文字列定数(val 値:String) extends 定数

/*
 下記は将来的にはメソッドにする
 */
abstract class 演算子 extends 式 // Operator
abstract class 論理演算子 extends 演算子 // Boolean_op
abstract class 関係演算子 extends 演算子 // Relational_op
abstract class 算術演算子 extends 演算子 // Arithmetic_op

class 論理積 extends 論理演算子 // And
class 論理和 extends 論理演算子 // Or

class 超過 extends 関係演算子 // Greater than
class 同値 extends 関係演算子 // Equal
class 未満 extends 関係演算子 // Less than

class 加算 extends 算術演算子 // Plus
class 減算 extends 算術演算子 // Minus
class 乗算 extends 算術演算子 // Mul
class 除算 extends 算術演算子 // Div
class 剰余 extends 算術演算子 // Surplus
