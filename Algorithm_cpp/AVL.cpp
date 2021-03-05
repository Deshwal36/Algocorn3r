#include<bits/stdc++.h>

using namespace std;

class Node{
    public:

        int data;
        Node* left;
        Node* right;
        int height;
};

int HeightBTree(Node* root){
    if(root==NULL)
    return 0;
    return root->height;
}

Node* newNode(int data){
    Node* node = new Node();
    node->data=data;
    node->left=NULL;
    node->right=NULL;
    node->height=1;

    return node;
}

int max(int a,int b){
    return (a>b) ? a : b ;
}


int getBalance(Node* N){
    if(N == NULL)
    return 0;
    return HeightBTree(N->left) - HeightBTree(N->right);
}


Node* rightRotate(Node* z){
    Node* y= z->left;
    Node* T3= y->right;

    y->right=z;
    z->left=T3;
    
    z->height = 1 + max(HeightBTree(z->left) , HeightBTree(z->right));
    y->height = 1 + max(HeightBTree(y->left) , HeightBTree(y->right));

    return y;

}


Node* leftRotate(Node* z){
    Node* y= z->right;
    Node* T3= y->left;

    y->left=z;
    z->right=T3;

    z->height = 1 + max(HeightBTree(z->left) , HeightBTree(z->right));
    y->height = 1 + max(HeightBTree(y->left) , HeightBTree(y->right));
    
    return y;

}



Node* Insert(Node* root,int data){
    
   
    if(root == NULL)
    return newNode(data);

    if(data < root->data){
        ///cout<<"data < \n";
        root->left=Insert(root->left,data);
    }
    else if(data > root->data){
    //cout<<" data > \n";
        root->right=Insert(root->right,data);
    }
    else    
    return root; // equal keys are not allowed in BST   
    
    root->height=1+max(HeightBTree(root->left),HeightBTree(root->right));
    //cout<<"height"<<root->height<<root->right->data;
    int Balance = getBalance(root);
    //cout<<"Balance"<<Balance;
    if( Balance > 1 && data < root->left->data){ //LL CASE
            return rightRotate(root);
    }

    if( Balance >1 && data > root->left->data ){ //LR CASE
         root->left = leftRotate(root->left);
         return rightRotate(root);
    }

     if( Balance < -1 && data < root->right->data){ //RL CASE
            root->right=rightRotate(root->right);
            return leftRotate(root);
    }

    if( Balance < -1 && data > root->right->data ){ //RR CASE
        return  leftRotate(root);
    }

    return root;
    
}

void preOrder(Node* root){

    if( root != NULL ){
    cout<< root->data <<" ";
    preOrder(root->left);
    preOrder(root->right);
  }
}


int main(){
    
   Node *root = NULL;  
      
    /* Constructing tree given in  
    the above figure */
    root = Insert(root, 10);  
    //cout<<root->data<<"\n ";
    root = Insert(root, 20); 
    //cout<<root->data<<"\n "; 
    root = Insert(root, 30);
    //cout<<root->data<<"\n ";  
    root = Insert(root, 40);
    //cout<<root->data<<"\n ";  
    root = Insert(root, 50);
    //cout<<root->data<<"\n ";  
    root = Insert(root, 25);
    //cout<<root->data<<"\n ";  
      
    /* The constructed AVL Tree would be  
                30  
            / \  
            20 40  
            / \ \  
        10 25 50  
    */
    cout << "Preorder traversal of the "
            "constructed AVL tree is \n";  
    preOrder(root);  
      
    return 0;  

}