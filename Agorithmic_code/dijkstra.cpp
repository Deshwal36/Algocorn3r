#include <iostream>
#include <climits>
using namespace std;

int findminVertex(int *distance, bool *visited, int v)
{

    int minVertex = -1;
    for (int i = 0; i < v; i++)
    {
        if (!visited[i] && (minVertex==-1 ||  distance[i] < distance[minVertex]))
        {
            minVertex = i;
        }
    }
    return minVertex;
}

void dijkstra(int **edges, int v)
{

    int *distance = new int[v];
    bool *visited = new bool[v];

    for (int i = 0; i < v; i++)
    {
        distance[i] = INT_MAX;
        visited[i] = false;
    }
    cout << "distance :" ;
    for (int i = 0; i < v; i++)
        cout << distance[i] <<" ";
        cout<<endl;
    cout << "visited :";
    for (int i = 0; i < v; i++)
         cout<< visited[i] <<" ";
        cout<<endl;
    distance[0] = 0;

    for (int i = 0; i < v-1; i++)
    {

        int minVertex = findminVertex(distance, visited, v);
        visited[minVertex]=true;
        cout<<"minVertex : "<<minVertex<<endl;
        for (int j = 0; j < v; j++)
        {
            if (!visited[j] && edges[minVertex][j] != 0)
            {
                int dist = distance[minVertex] + edges[minVertex][j];
                cout<<"distance :"<<dist<<endl;
                if (dist < distance[j])
                {
                    distance[j] = dist;
                    cout<<"distance :";
                    for(int i=0;i<v;i++)
                    cout<<distance[i]<<" ";
                    cout<<endl;
                }
            }
        }
    }

    for (int i = 0; i < v; i++)
    {
        cout << i << " " << distance[i] << endl;
    }

    delete[] distance;
    delete[] visited;
}

int main()
{
    int v, e;
    cin >> v >> e;

    int **edges;
    edges = new int *[v];
    for (int i = 0; i < v; i++)
    {

        edges[i] = new int[v];
        for (int j = 0; j < v; j++)
            edges[i][j] = 0;
    }

    for (int i = 0; i < e; i++)
    {
        int f, s, w;
        cin >> f >> s >> w;
        edges[f][s] = w;
        edges[s][f] = w;
    }

    cout << endl;


    dijkstra(edges, v);

    for (int i = 0; i < v; i++)
        delete[] edges[i];

    return 0;
}
