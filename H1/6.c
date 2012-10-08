#include <stdio.h>

int main() {
    
    int x, k, q;
    int a[100];
    int i=0;
    int n = 100;
    
    
    printf("Vuvedete chislo X koeto e po-malko ot 10 \n");
    scanf("%d", &x);
    
    do {
        a[i] = rand() % 100;
        i++;
        }while(i<=100);
        
    for (i = (n - 1); i > 0; i--) {
               for (k = 1; k <= i; k++) {
                    
                      if (a[k]%10==x) {
                       q = a[k-1];
                       a[k-1] = a[k];
                       a[k] = q;
                                       }
                                        }
                                }    
        
        do {
            
            printf("%d ", a[i]);
            i++;
            }while(i<=100);
        
    getchar();
    getchar();
    
    
    return 0;
    }
