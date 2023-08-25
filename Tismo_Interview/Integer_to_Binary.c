

#include <stdio.h>

void intToBinary(int num){
    int arr[32];
    int i=31;
    while(num>0){
        arr[i--]=num%2;
        num/=2;
    }
    int l=sizeof(arr)/sizeof(arr[0]);
    for(int i=0;i<l;i++){
        printf("%d ",arr[i]);
    }
    
}

int main()
{
    int a=12;
    intToBinary(a);
    // 1100
    

    return 0;
}
