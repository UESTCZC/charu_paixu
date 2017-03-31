package 插入排序;

public class PaiXu {
	private int i;

	public PaiXu() {
	}
   
	public PaiXu(int[] a) {
		// 这是先把前两个元素排好位置，再把第三个排好位，以此类推，要排序的元素之前都是排好了的
		for (int j = 1; j < a.length; j++) {// 这个算法只能从数组的第二个值开始，若从第三个开始考虑2 3
											// 1这种情况
			int key = a[j];// 设计标记
			i = j - 1;
			while (i >= 0 && a[i] < key) {// 从标记的前一个元素开始比较
				a[i+1] = a[i];
				i = i - 1;
			}
			a[i + 1] = key;
		}
	}
}
