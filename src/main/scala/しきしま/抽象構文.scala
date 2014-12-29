package しきしま

class 抽象構文

// Expression
abstract class 式

// Constant
case class 定数(値: Any) extends 式

// Identifier
case class 識別子(名: String) extends 式

// Assignment
case class 代入(対象: 式, 識別子: 識別子, 式: 式) extends 式

// Arguments
case class 仮引数(識別子列: 識別子*) extends 式

// Function
case class 関数(仮引数: 仮引数, 本体: 式) extends 式

// Parameters
case class 引数(式列: 式*)

// Method
case class 操作(対象: 式, 識別子: 識別子, 引数: 引数) extends 式

// Conditional branch
case class 分岐節(条件: 式, 式: 式) extends 式

// Conditional
case class 分岐(分既節列: 分岐節*) extends 式

// Loop
case class 繰返(条件: 式, 本体: 式) extends 式

// Compound
case class 複合式(式列: 式*) extends 式
