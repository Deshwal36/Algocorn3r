#include <bits/stdc++.h> /* g++ compiler
                         that allows us to
                         include the entire standard library.
                         Thus, it is not needed to separately
                         include libraries such as iostream, vector and algorithm*/
//#include<stack>

typedef long long ll;

using namespace std;

// class Person{
//   public:
//   int id;
//   string a;

//   Person(int id,string a){
//   id=id;
//   a=a;
//   }

// };

void fun(int** edges, int v)
{
  for (int i = 0; i < v; i++)
  {
    cout <<"fun :" <<edges[0][i];
  }
}
int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int v, e;
  cin >> v >> e;

  int** edges;
  edges=new int*[v];
  for (int i = 0; i < v; i++)
  {
    edges[i]=new int[v];
    for (int j = 0; j < v; j++)
      edges[i][j] = 0;
  }
  for (int i = 0; i < v; i++)
  {
    for (int j = 0; j < v; j++)
      cout << edges[i][j];
    cout << endl;
  }

  fun(edges, v);

  return 0;
}