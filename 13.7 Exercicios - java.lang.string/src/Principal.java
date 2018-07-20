
public class Principal {

	public static void main(String[] args) {
		String a = "julio ";
		String b = "j";

		if (a.indexOf(b) >= 0) {
			System.out.println("Contem");
		} else {
			System.out.println("não");
		}

		System.out.println(a);
		System.out.println(a.trim());

		System.out.println(a.isEmpty());
		System.out.println(a.length());

		String exe5 = "julio";

		for (int i = 0; i < exe5.length(); i++) {
			System.out.println(exe5.charAt(i));
		}

		for (int i = exe5.length() -1; -1 < i; i--) {
			System.out.print(exe5.charAt(i));
		}
	}

}
