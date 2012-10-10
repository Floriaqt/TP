import java.util.Arrays;
import java.util.Collections;

public class JavaHomework{

        public static void main(String[] args) {

		int length=args.length;
                int i;           
                String[] Arr=new String[length];

                for(i=0; i<length; i++) {
                        Arr[i] = System.getProperty(args[i]);
                        	if(Arr[i] == null) {
                        		Arr[i] = "Invalid";
                        	}
                }

                if(args[length-1].matches("up") == true) {
                        Arrays.sort(Arr);         
                }
			else {
				Arrays.sort(Arr,Collections.reverseOrder()); 
                	}

                for(String info:Arr) {
                        if(info != "Invalid"){
                                System.out.println(info);
                        }
                }
        }
}