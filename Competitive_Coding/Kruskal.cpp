#include <bits/stdc++.h>

using namespace std;

typedef pair<int,int> ipair;
struct Graph{

    int v,e;
    vector< pair<int,ipair> > edges;

    Graph(int v,int e){
        this->e=e;
        this->v=v;
    }

    void addedge(int u,int v,int w){
        edges.push_back({w,{u,v}});
    }

    int KruskalMST();

};

struct Disjointsets{

    int *parent,*rank;
    int n;

    Disjointsets(int n){

        this->n=n;
        parent=new int[n+1];
        rank=new int[n+1];

        for(int i=0;i<n+1;i++){
            rank[i]=1;
            parent[i]=i;     
        }

    }


    int find(int u){
        if (u != parent[u]){
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }

    void merge(int x,int y){

        x=find(x),y=find(y);

        if(rank[x]>rank[y]){
            rank[x]+=rank[y];
            parent[y]=x;
            
        }
        else{
            rank[y]+=rank[x];
            parent[x]=y;
            
        }
        
    
    }

};


int Graph::KruskalMST(){
    int mst_wt=0;

    sort(edges.begin(),edges.end());

    Disjointsets ds(v);

    vector< pair<int, ipair> > :: iterator it;
    cout<<"edges :"<<"\n";
    for( it=edges.begin() ; it!= edges.end(); it++){

        int u=it->second.first;
        int v=it->second.second;
        
        int set_u=ds.find(u);
        int set_v=ds.find(v);
        
        if(set_u != set_v){
            cout<< u<<"-"<<v<<"\n";
            mst_wt+=it->first;

            ds.merge(set_u,set_v);
        }
        
    }
    return mst_wt;

}

int main(){

    //cout<<"Graph";
    int v=5,e=7;
    //cout<<v<<"-"<<e;
    Graph g(5,7);
    
    g.addedge(1,2,70);
    g.addedge(2,3,20);
    g.addedge(2,4,60);
    g.addedge(2,5,40);
    g.addedge(3,4,50);
    g.addedge(3,5,30);
    g.addedge(4,5,10);
    
    
    int mst_wt=g.KruskalMST();
    
    cout<<"MST_wt : "<<mst_wt;
    return 0;

}