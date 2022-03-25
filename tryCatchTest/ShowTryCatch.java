package tryCatchTest;

public class ShowTryCatch {
	public static void main(String[] args) {
		TestMethods testar = new TestMethods();

		try {
			System.out.println(testar.divisao(5, 0));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println(testar.matriz(0));
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
