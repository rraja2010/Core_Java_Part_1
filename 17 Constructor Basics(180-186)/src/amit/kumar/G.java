//186
package amit.kumar;

class G {
	int i;

	G(int i) {
		this.i = i;
		System.out.println(i);
	}

	public static void main(String[] args) {
		G g1 = new G(2);
		System.out.println("done");
		System.out.println(g1.i);
	}
}
// Initialize the i value while object creation and same we are passing through parameter -2 .