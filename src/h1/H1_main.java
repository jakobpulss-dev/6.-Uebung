package h1;

public class H1_main {
	public static boolean isMirrorArray(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[b.length - 1 - i]) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 8 };
		int[] b = { 1, 4, 5, 2 };
		int[] c = { 2, 4, 6 };
		int[] d = { 6, 4, 2 };

		System.out.println("isMirrorArray(a, b): " + isMirrorArray(a, b)); // true
		System.out.println("isMirrorArray(b, a): " + isMirrorArray(b, a)); // true
		System.out.println("isMirrorArray(c, d): " + isMirrorArray(c, d)); // false
		System.out.println("isMirrorArray(a, c): " + isMirrorArray(a, c)); // false
	}

}
