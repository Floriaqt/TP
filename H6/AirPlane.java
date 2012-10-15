import java.util.Random;

public class AirPlane {

    int [][] seats = new int[6][27];
    int finish = 0;
    int sum = 0;

  public void print() {
    for (int i=0; i<27; i++) {
        for(int j=0; j<6; j++) {
            System.out.print(seats[j][i]);
            if(j == 2){
                System.out.print(" ");
            }
          }
            System.out.println("");
    }
  };
  public void add(int rand) {
    finish = 0;
    for (int i=0; i<27; i++) {
        for(int j=0; j<6; j++) {
            if(seats[j][i] == 0){
                if(rand == 1){
                    seats[j][i]=1;
                    sum = sum + 1;
                    finish = 1;
                    break;
                }
                if(rand == 2){
                    if(j<5 && j!=2){
                        if(seats[j][i] == 0 && seats[j+1][i]==0){
                            seats[j][i]=2;
                            seats[j+1][i]=2;
                            sum = sum + 2;
                            finish = 1;
                            break;
                        }
                }
            }
                if(rand == 3){
                    if(j==0 || j==3){
                        if(seats[j][i] == 0 && seats[j+1][i] == 0 && seats[j+2][i] == 0){
                            seats[j][i]=3;
                            seats[j+1][i]=3;
                            seats[j+2][i]=3;
                            sum = sum + 3;
                            finish = 1;
                            break;
                        }
                    }
                }
            } else { continue; }
        }
            if(finish == 1) break;
    }
 }

  public boolean full() {
    for(int j=0; j<27; j++) {
        for(int i=0; i<6; i++) {
            if (seats[i][j] == 0) {
                return true;
            }
        }
    }
    return false;

  }


  public static void main(String[] args) {

    AirPlane p = new AirPlane();
    while(p.full()){
        int Passengers = new Random().nextInt(3) + 1;
        p.add(Passengers);
    };

    p.print();

  };

}  