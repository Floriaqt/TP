#include <stdio.h>

int main() {
    int x, y, i, k;
    int t=0;
    int a[100];
    int s;
    int z = 0;
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
    s = (y - x);   
    k = x;
    x = (x-1) + x;
    a[i] = x;
    
    do {
        a[i] = a[i-1] + a[i];
        
        i++;
        k++;
        }while (k<=y);
    i=0;
    do {
        
        printf("%d ", a[i]);
        z++;
        i++;
        }while (z<=s);
    
    getchar();
    getchar();
 return 0;
}
