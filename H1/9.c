#include <stdio.h>

int main() {
    int x;
    int z=0;
    float y;
    float i=0.0;
   do {
        printf("Vuvedete chislo X             0<X<1\n");
        scanf("%d", &x);
    
    }while((x>1)&&(x<0));
    
    
   do { 
      y += (4.0/i);
    if (y<x) { 
             printf("%f", y);
             z = 1;
             }
    i += 2.0;
    
    
    
    }while(z==0);
    
  getchar();
  getchar();
  getchar();
    
    return 0;
    }
