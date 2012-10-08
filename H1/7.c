#include <stdio.h>
#include <math.h>

int main() {
    int x;
    float b;
    int y;
    float a[10];
    int i=0;
    int t=0;
    do {
        printf("Vuvedete chislo X po malko ot 10\n");
        scanf("%d", &x);
    
    }while((x>10)&&(x<0));
    
    do {
        b = cos(t);
        b = b*1000;
        y = b;
        if (y%10==x) {
                   a[i] = y;  
                   i++;
                     }
        t++;
        
        }while(i<=10);
        
    i=0;
    do {
        
        
        a[i] = a[i]/1000;
        printf("%5.3f  ", a[i]);
        i++;
        }while(i<=10);
    
    
    getchar();
    getchar();
    return 0;
    }
