#include <stdio.h>

int main() {
    int x, y, k;
    int t=0;
    int sum = 0;
    do {
       printf("Vuvedete cqlo chislo X  \n");
       scanf("%d", &x);
       printf("Vuvedete cqlo chislo Y  \n");
       scanf("%d", &y);
        if (x<y) {
                t = 1; 
                 }
       }while (t==0);
    k = x;
    do {
        
        if (k%17==0) {
                   sum = sum + k;
                   }
        k++;
        
        }while (k<=y);
    printf("Sumata na chislata delqshti se na 17: %d", sum);
    
    getchar();
    getchar();
 return 0;
}
