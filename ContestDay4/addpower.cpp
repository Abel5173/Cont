#include<bits/stdc++.h>
using namespace std;
int main(){
   int count;
       int a,b,n;
       cin>>n;
        for (int i = 0; i < n; i++) {
             count=0;
             a=0;
            int ino;
            cin>>ino;
            for (int j = 0; j < ino; j++) {
                cin>>b;
                if(b>a){
                    count++;
                    a=b;
                }
            }
        cout<<count<<endl;
    }

}