#include<bits/stdc++.h>
using namespace std;
int main(){
   
       long long a,b,c,d;
       int n;
      cin>>n;
        for (int i = 0; i < n; i++) {
        cin>>a>>b;
			if(a<b){
				cout<<"impossible"<<endl;			
			}
			else{
				c=(a+b)/2;
				d=a-c;
				if(c>d){					
					cout<<c<<" "<<d<<endl;
				}else{
						cout<<d<<" "<<c<<endl;
				}
			}
            
    }

}