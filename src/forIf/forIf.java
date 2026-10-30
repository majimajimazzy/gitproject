package forIf;

//Scannnerのインポート
import java.util.Scanner;

public class forIf {
	public static void main() {
		// TODO 自動生成されたメソッド・スタブ
		//課題１
		System.out.println("課題１");
		//$を用いて表現、結果を格納する変数を用意
		String chs="$";;
		String results="";
		//Scannnerの宣言
		Scanner scanner = new Scanner(System.in);
		System.out.println("サイズの入力");
		int size = scanner.nextInt();
		//Scannerの入力値だけforを回す
		for(int i=1;i<=size;i++) {
			//文字列をforがまわる回数だけ足されるように構成・表示
			results = results+chs;
			System.out.println(results);
		}
		
		//課題２
		System.out.println("");
		System.out.println("課題2");
		
		//課題3
		System.out.println("");
		System.out.println("課題3");
		
		//課題4
		System.out.println("");
		System.out.println("課題4");
	}

}
