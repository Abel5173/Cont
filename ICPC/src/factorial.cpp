#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
int main()
{
    int n = 100;
    ll x = 1;
    for (int i = n - 1; i >= 0; i--)
    {
        x = (x * i) % n;
    }
    cout << x;
    return 0;
}