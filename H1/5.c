#include <stdio.h>
#include <math.h>

int main() {
    int x, k;
    float q;
    int i = 0;
    int b = 0;
    int n=10;
    float a[10];
        
    do {
        
       printf("Vuvedete chislo X \n");
       scanf("%d", &x);
       
    }while(x>10);
    
    do {
        a[i] = cos(i);
        i++;
        
        }while(i<=10);
    do {
        printf("%4.2f ", a[b]);
        b++;
        }while(b<=10);
   
        i = 0;
        
   for (i = (n - 1); i > 0; i--) {
               for (k = 1; k <= i; k++) {
                    if (a[k-1] < a[k]) {
                       q = a[k-1];
                       a[k-1] = a[k];
                       a[k] = q;
                                       }
                                        }
                                }
        printf("\n");
        i = 0;
        do {
            printf("%4.2f ", a[i]);
            i++;
            }while(i<=10);
        
        
        
        
  
    
    getchar();
    getchar();
    
    
    return 0;
    }
