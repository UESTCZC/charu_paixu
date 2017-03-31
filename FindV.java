public class FindV {
	private int abc=0;
	public FindV() {
	}

	public FindV(int[] a, int v) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == v){
				System.out.println(i);
				 abc =1;
			}
		}
		if(abc==0)
			System.out.println("v是特殊值NIL");
	}
}
