package しきしま

object 具象構文 {
	def 出力(expr: 式) :String = expr match {
      case 論理定数(true) => "真"
      case 論理定数(false) => "偽"
      case 整数定数(e) => e.toString // パラメータ変数は英小文字から始める規定
      case 変数(e) => e.toString()
      case 二項演算(t1, t2, 加算()) => 出力(t1) + "に" + 出力(t2) + "を足す"
      case 二項演算(t1, t2, 減算()) => 出力(t1) + "から" + 出力(t2) + "を引く"
      case 二項演算(t1, t2, 乗算()) => 出力(t1) + "に" + 出力(t2) + "を掛ける"
      case 二項演算(t1, t2, 除算()) => 出力(t1) + "を" + 出力(t2) + "で割る"
      case 二項演算(t1, t2, 剰余()) => 出力(t1) + "を" + 出力(t2) + "で割った余りを求める"
			case _ => "不明"
	} 
}