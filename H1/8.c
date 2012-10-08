#include <stdio.h>

int main() {
    int x;
    int i=0;
    int y=0;
    int sum;
    int b=1;
    int a[10];
    do {
        printf("Vuvedete chislo X po malko ot 10\n");
        scanf("%d", &x);
    
    }while((x>10)&&(x<0));
    
    
   do {
    
    sum = y + b;
    y = b;
    b = sum;
      if (y%x==0) {
                  a[i]=y;
                  i++;
                  }
     }while(i<=10);
    i=0;
    do {
        printf("%d  ", a[i]);
        i++;
        }while(i<=10);
    
    
    
    
    
    getchar();
    getchar();
    return 0;
    }
