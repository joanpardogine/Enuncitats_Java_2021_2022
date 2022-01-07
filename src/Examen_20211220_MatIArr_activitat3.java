
public class activitat3 {
	public static void main(String[] args) {
		int maxnum=10;
		int cur=1,count=0;
		int[] array;

		//Comptem quantes posicions necessitem per l'array. En aquest cas, 55.
		while(cur <= maxnum) {
			count = count + 1*cur;
			cur++;
		}
		array= new int[count];

		//Omplim l'array.
		count=0;
		cur=1;
		for(int length=0;length<array.length;length++,count++) {
			if(count==cur) {
					cur++;
					count=0;
			}
			array[length]=cur;
		}

		for(int length=0;length<array.length;length++) {
			System.out.print(array[length]+" ");
		}
	}

}
