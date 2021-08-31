public class ArrayConcept {
	public static void main(String args[]) {
		// 1- int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 109;
		i[2] = 105;
		i[3] = 100;
		System.out.println(i[2]);

		// to print all value from array
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// 2 object array
		Object obj[] = new Object[5];
		obj[0] = "Manish";
		obj[1] = 2.5;
		obj[2] = 'A';
		obj[3] = "06/12/1991";
		obj[4] = 75;

		for (int k = 0; k < obj.length; k++) {
			System.out.println(obj[k]);
		}

	}
}