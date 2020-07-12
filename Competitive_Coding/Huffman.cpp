#include<bits/stdc++.h>

using namespace std;

struct Minheapnode{

    char ch;
    unsigned fr;

    Minheapnode *left,*right;

    Minheapnode(char ch,unsigned fr){
        this->ch=ch;
        this->fr=fr;
        left=right=NULL;
    }
};

struct compare{

    bool operator()(Minheapnode* l ,Minheapnode * r){
        return (l->fr > r->fr);
    }
};

void printcodes(Minheapnode* root,string str){

    if(!root)
    return ;

    if(root->ch != '$')
    cout<<root->ch << ":"<<str<<"\n";

    printcodes(root->left,str + "0");
    printcodes(root->right,str + "1");

}

void Huffmancodes(char arr[],int freq[],int size){

        Minheapnode *left ,*right,*top;

        priority_queue<Minheapnode *,vector<Minheapnode*>,compare> minheap;
        for(int i =0;i<size;i++)
        minheap.push(new Minheapnode(arr[i],freq[i])); 
    
        while(minheap.size() != 1){
        left=minheap.top();
        minheap.pop();
        right=minheap.top();
        minheap.pop();

        top=new Minheapnode('$',left->fr + right->fr);
        top->left=left;
        top->right=right;
        minheap.push(top);
        }

        printcodes(minheap.top(),"");
}

int main(){

    char arr[]={'a','b','c','d','e','f','g'};
    int freq[]={55,5,8,10,9,7,11};

    int sz=sizeof(arr)/sizeof(arr[0]);

    
    Huffmancodes(arr,freq,sz);
    

}
