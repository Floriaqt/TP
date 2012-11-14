import java.util.Arrays;
import java.util.Collections;

public class HomeWork1{
	public static void main (String[] args){
		String[] tempStr = new String[args.length];
		int sortOrder = 0;
		for(int i=0;i<args.length;i++){
			if(System.getProperty(args[i])==null){
				tempStr[i]="error";
				continue;
			}else{
				tempStr[i]=System.getProperty(args[i]);
			}
		}
		if(args[(args.length)-1].equals("down")){
			sortOrder = 1;
		}
		if(sortOrder==1){
			Arrays.sort(tempStr, Collections.reverseOrder());
		}else{
			Arrays.sort(tempStr);
		}
		for(int i=0;i<args.length;i++){
			if(tempStr[i].equals("error")){
				continue;
			}else{
				System.out.println(tempStr[i]);
			}
		}
	}
}

