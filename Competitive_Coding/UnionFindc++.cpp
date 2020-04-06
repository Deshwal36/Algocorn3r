#include <iostream>
#include <climits>
#include<stdexcept>
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

int main(){
 
    int n;
    cin>>n;
    UnionFind UF(n);
    cout<<"componentSize : "<<UF.componentSize(1)<<"\n";
    cout<<"connected ? :"<<UF.connected(1,2)<<"\n";
    cout<<"numberofComponent : "<<UF.numComponent()<<"\n";
    cout<< "size : "<<UF.Size()<<"\n";
    cout<<endl;

    UF.unify(1,2);

    cout<<"componentSize : "<<UF.componentSize(1)<<"\n";
    cout<<"connected ? :"<<UF.connected(1,2)<<"\n";
    cout<<"numberofComponent : "<<UF.numComponent()<<"\n";
    cout<< "size : "<<UF.Size()<<"\n";
    cout<<endl;

    int p=UF.find(2);

    cout<<p;


    return 0;
}
