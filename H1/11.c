#include <stdio.h>
#include <math.h>
int main() {
    int x, z, n;
    float q;
    int i;
    float a[10];
    
    do {
    printf("Vuvedete chislo X po malko ot 10\n");
    scanf("%d", &x);
    }while((x>10)&&(x<0));
    
  q = 0.0;  
  for (i=0;i<10;i++){
      for (z=x*n;(z<(n+1)*x);z++) {
          q += cos(z);

             }       
   a[i] = q;
   n += 1;          
      }
      i=0;
   do {
       printf("%4.2f  \n", a[i]);
       i++;
       }while(i<=10);
   
   

    
    
    
getchar();
getchar();    
    
    return 0;
    }
