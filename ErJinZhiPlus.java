public class ErJinZhiPlus {
	public ErJinZhiPlus() {
	}

	public ErJinZhiPlus(int[] A, int[] B) {
		int[] C = new int[A.length + 1];
		int key = 0;
		for (int i = 0; i < A.length; i++) {

			int zhi = A[i] + B[i] + key;// zhi最高为3
			C[i] = zhi % 2;
			if (zhi > 1)// 大于一就要进位。
				key = 1;
			else
				key = 0;//书上没有这个else 我认为应该加
		}
		if (key == 1)
			C[A.length] = 1;
		for(int j=0;j<C.length;j++){
			System.out.print(C[j]+" ");
		}
	}
}
