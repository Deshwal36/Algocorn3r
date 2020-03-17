#include<bits/stdc++.h>
#include<stack>
/* g++ compiler
 that allows us to
 include the entire standard library.
 Thus, it is not needed to separately
 include libraries such as iostream, vector and algorithm*/

typedef long long ll;

using namespace std;
/*using line declares that the classes and functions
of the standard library can be used directly in the code. Without
the using line we would have to write, for example,
std::cout, but now it sufﬁces to write cout. */

  int main() {
      stack s;
      ios::sync_with_stdio(0);
      cin.tie(0);
      std::cin >> s.push(1);
      for(int i =1;i<10;i++){
      cout<<i<<s.top()<<"\n";
      }
    return 0;
  }

//cout : g++ -std=c++11 -O2 -Wall test.cpp -o test
