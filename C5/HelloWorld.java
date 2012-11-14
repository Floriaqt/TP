public class HelloWorld11b {
	public static void main(String[] args) {
		Integer sum=new Integer(0);
		System.out.println("Hello World!");
		for(int i=0;i<101;i++) {
			sum = sum + i;
		}
		int Arr[]= new int[20];
		Integer j=new Integer(0);
		for(int i=0;i<100;i++){
			if(i%2!=0){
			 	Arr[j]=i;
				j++;
				System.out.println(Arr[j]);
			}
			if (j==10){
				break;
			}
		}
		System.out.println(sum);
	}
}