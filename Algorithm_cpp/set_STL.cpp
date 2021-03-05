// SYNTAX - std::set<T> obj; "UNIQUE ELEMENT IN SORTED ORDER"

// 1.std::set is an associative container that contains a sorted set of unique objects of type key.
// 2.usually implemented using R-B Tree.
// 3.insetion,removal,searching : log(N)
// 4.Provide compare function for user defined data type for comparision.
//     std::set< U,std::greater<> >


#include<iostream>
#include<string>
#include<set>
#include<vector>
#include<functional>
using namespace std;
class Person{
   public :

        string name;
        int age;

         bool operator < (const Person& rhs) const{ //default
             return age<rhs.age;
       }
         bool operator > (const Person& rhs) const{
             return age>rhs.age;
        }

        
};
int main(){

        
        set<Person,greater<>> s={{"shivam",24},{"akash",28},{"rashi",18}};
        for(auto i:s)
        cout<<i.age<<" "<<i.name<<endl;
        
        
        return 0;

    
}