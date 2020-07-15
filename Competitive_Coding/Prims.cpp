#include<bits/stdc++.h>

using namespace std;

typedef pair<int,int> ipair;

struct Graph{
    int v,e;
    vector < pair<ipair ,int> > edges;
    vector < list<int> > adjlist;
    Graph(int v,int e){
        this->v=v;
        this->e=e;

    }

    void addedges( int v,int u,int w){
        edges.push_back({{v,u},w});
        adjlist[v].push_back(u);
    }

    

};

// int primsMST(char c){

     
// }


int main(){
    int v=6,e=10;
    Graph g(v,e);

    g.addedges(1,2,7);
    g.addedges(1,3,2);
    g.addedges(1,4,6);  
    g.addedges(2,3,6);
    g.addedges(2,5,4);
    g.addedges(3,5,7);
    g.addedges(3,6,5);
    g.addedges(3,4,6);
    g.addedges(4,6,3);
    g.addedges(5,6,8);

    list<int> :: iterator  it;
    cout<<*(g.adjlist[0].end())<<"\n";
    for(it=g.adjlist[0].begin();it!=g.adjlist[0].end();it++){
        cout<<*it<<",";
    }
    
    
    // int mst_wt= primsMST('a');
    // cout<<"mst_wt :"<<mst_wt;

    return 0;
}