// Social network connectivity. 
// Given a social network containing n members and a log file containing m timestamps 
// at which times pairs of members formed friendships, design an algorithm to determine 
// the earliest time at which all members are connected (i.e., every member is a friend of a friend of a friend ... of a friend). 
// Assume that the log file is sorted by timestamp and that friendship is an equivalence relation. 
// The running time of algorithm : mlogn


#include <iostream>
#include <climits>
#include<stdexcept>
#include<utility>
#include<set>
#include<vector>
#include<iterator>
using namespace std;

class UnionFind {

     private:
        int size;
        int* sz;
        int* id;
        int numComponents;

    public:
        UnionFind(int s) {

            if (s <= 0)
                throw invalid_argument("size must be +ve");
            size = numComponents = s;
            sz = new int[size];
            id = new int[size];

            for (int i = 0; i < size; i++) {
                sz[i] = 1;
                id[i] = i;
            }
        }

        int find(int p) {
            int root = p;

            while (root != id[root])
                root = id[root];

            while (p != root) {
                int next = id[p];
                id[p] = root;
                p = next;
            }

            return root;
        }

        bool connected(int p, int q) {
            return find(p) == find(q);
        }

        int componentSize(int p) {
            return sz[find(p)];
        }

        int Size() {
            return size;
        }

        int numComponent() {
            return numComponents;
        }

        void unify(int p, int q) {
            int root1 = find(p);
            int root2 = find(q);

            if (root1 == root2)
                return;
            if (sz[root1] < sz[root2]) {
                sz[root2] += sz[root1];
                id[root1] = root2;
            } else {
                sz[root1] += sz[root2];
                id[root2] = root1;
            }

            numComponents--;
        }

};

struct timestamp{
   pair<int,int> P;
    int time;
    bool operator < (const timestamp& rhs) const{ //default
            return time<rhs.time;
        }
};

int earliestTime(set<timestamp> s,int n){
    int time=0;
    UnionFind UF(n);
    for(auto i:s){
    if(UF.numComponent()==1)
    break;
    UF.unify(i.P.first,i.P.second);
    time+=i.time;
    }
    return time;
  }

int main(){

    int n,m,v1,v2,t;
    cout<<"elements :";
    cin>>n;
    cout<<"number of timestamp : ";
    cin>>m;
    set<timestamp> s;
    while(m){
        timestamp t1;
        cout<<"pair : ";
        cin>>v1>>v2;
        cout<<"timestamp :";
        cin>>t;
        t1.P=make_pair(v1,v2);
        t1.time=t;
        s.insert(t1);
        m--;
    }
    cout<<"Earliest time : "<<earliestTime(s,n);

    return 0;
}
