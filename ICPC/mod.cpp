#include<iostream>
using namespace std;
int main(){
long long a,b,c;
cin>>a>>b>>c;
cout<<(((a%c)+(b%c))%c)<<" "<<(((a%c)-(b%c))%c)<<" "<<(((a%c)*(b%c))%c);

}