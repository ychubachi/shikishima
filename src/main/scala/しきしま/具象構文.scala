package しきしま

/**
 * しきしまの具象構文を定義します．
 * Scalaの制約で，パターン内のパラメータは英小文字から始めています．
 */
object 具象構文 {
	def 出力(expr: 式) :String = expr match {
      case 定数(true) => "真"
      case 定数(false) => "偽"
      case 定数(e) => e.toString
      case 識別子(e) => e.toString
      case 代入(t, i, e) => 出力(t) + "の" + 出力(i) + "は" + 出力(e) + "である"
			case _ => "不明"
	} 
}