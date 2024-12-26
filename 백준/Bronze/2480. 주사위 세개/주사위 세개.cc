#include <bits/stdc++.h>
using namespace std;

int a, b, c;
int res, res_max;

int main() {
    cin >> a >> b >> c;
    
    if(a == b && b == c) {
        res = 10000 + a * 1000;
    }
    else if(a == b) {
        res = 1000 + a * 100;
    }
    else if(b == c) {
        res = 1000 + b * 100;
    }
    else if(a == c) {
        res = 1000 + a * 100;
    }
    else {
        res_max = max({a, b, c});
        res = res_max * 100;
    }
    
    cout << res << endl;
    return 0;
}
