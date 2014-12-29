package しきしま

class 抽象構文

/**
 * Graalとの違い
 * - Declaration_list を削除
 * - Instruction を削除（すべて値を返す「式」とする）
 * - Skipを削除
 * - Operatorは将来的にはメソッドにする
 */

// Program -> 実装せず
// Declaration_list -> 実装せず
// Type -> 実装せず

// Instruction -> 「式（Expression）」とする
//   Assignment | Compound | Conditional | Loop |
//   Constant | Variable |Binary
abstract class 式

// Declaration
case class 宣言(変数: 変数, 型: 型) extends 式

// Type
abstract class 型 extends 式

// Boolean_type
class 論理型 extends 型

// Integer_type
class 整数型 extends 型

// Assignment
case class 代入(先: 変数, 元: 式) extends 式

// Compound
case class 複合式(式列: 式*) extends 式

// Conditional
case class 分岐(条件: 式, 成立: 式, 不成立: 式) extends 式

// Loop
case class 繰返(本体: 式) extends 式

// Expression -> Instructionと統合

// Constant
abstract class 定数 extends 式
case class 論理定数(値: Boolean) extends 定数 // Boolean_constant
case class 整数定数(値: Int) extends 定数 // Integer_constant

// Binary
case class 二項演算(式1: 式, 式2: 式, 演算: 演算子) extends 式

// Operator
abstract class 演算子 extends 式

// Boolean_op
abstract class 論理演算子 extends 演算子
class 論理積 extends 論理演算子 // And
class 論理和 extends 論理演算子 // Or

// Relational_op
abstract class 関係演算子 extends 演算子
class 超過 extends 関係演算子 // Gt
class 同値 extends 関係演算子 // Eq
class 未満 extends 関係演算子 // Lt

// Arithmetic_op
abstract class 算術演算子 extends 演算子
case class 加算() extends 算術演算子 // Plus
case class 減算() extends 算術演算子 // Minus
case class 乗算() extends 算術演算子 // Mul
case class 除算() extends 算術演算子 // Div
case class 剰余() extends 算術演算子 // Surplus

// Variable
case class 変数(名前: String) extends 式

// 追加分
case class 文字列定数(値: String) extends 定数
case class 任意定数(値: Any) extends 定数
// case class 脱出(val 条件:式型) extends 式型
