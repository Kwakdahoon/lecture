import java.util.Scanner; // Ctrl + Shift + o(영어)

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 >>>>>>>>>>>>>>>");
		String name = sc.nextLine(); // 엔터 (\n)를 입력할 때 까지의 문자열을 가져옴
		System.out.println("이름은" + name + "입니다");
		
		System.out.println("나이를 입력쳐하세요 >>>>>>>>>>>>>>>>>>>");
		int age = sc.nextInt();
		System.out.println("나이는" + age + "입니두~");
		
		System.out.println("키 입력 ->" );
		double height = sc.nextDouble();
		System.out.println("키는" + height + "cm 입니다");
		
		
		
	}

}
