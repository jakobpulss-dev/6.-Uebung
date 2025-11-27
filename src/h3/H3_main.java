package h3;

public class H3_main {
	public static boolean compareArraysVal(int[] a, int[] b) {

		if (a.length != b.length) {
			return false;
		}

		int[] copyA = a.clone();
		int[] copyB = b.clone();

		java.util.Arrays.sort(copyA);
		java.util.Arrays.sort(copyB);

		for (int i = 0; i < copyA.length; i++) {
			if (copyA[i] != copyB[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 3, 2, 1 };
		int[] c = { 1, 1, 2 };
		int[] d = { 1, 2, 2 };
		int[] e = { 1, 2, 3 };

		System.out.println(compareArraysVal(a, b));
		System.out.println(compareArraysVal(a, e));
		System.out.println(compareArraysVal(c, d));
		System.out.println(compareArraysVal(a, c));
	}

}
