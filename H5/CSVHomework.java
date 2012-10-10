import java.io.FileReader;
import java.io.BufferedReader;

public class CSVParse{
        public static void main(String[] args) throws Exception {

		BufferedReader br=new BufferedReader(new FileReader("CSVHomework.csv"));
                String [] Line=new String[20];
                String [] Arr=new String[20];
                
		int result = 0;   
                
                for(int i=0;i<6;i++) {           
                        Line[i]=br.readLine();
                        Arr=Line[i].split(",");

				if(i!=0) {               
                                	result =result + Integer.parseInt(Arr[5]);
                        	}
                }

                System.out.println(result);
        }
}