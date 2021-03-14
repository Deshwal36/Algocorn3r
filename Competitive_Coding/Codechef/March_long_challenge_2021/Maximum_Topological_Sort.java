import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
//import java.util.Map.Entry;

class Maximum_Topological_Sort{
    // k,v --> node,fact
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n,k,u,v,count;
        

        while(t>0){
        n=sc.nextInt();
        k=sc.nextInt();
            
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<Integer>());
        
        for(int i=0;i<n-1;i++){
            u=sc.nextInt();
            v=sc.nextInt();
            addEdge(adj, u-1, v-1);
        }
        Map<Integer,BigInteger> topologicalSort=new HashMap<>();
        
        for(int i=0;i<adj.size();i++){
            count=0;
             for(int j=0;j<adj.get(i).size();j++){

                 count+=count(adj,i,adj.get(i).get(j));//count(adj,1,2)
                
            }
            BigInteger topsort=factorial(count);
            topologicalSort.put(i, topsort);
        }
        
//        for(int i=0;i<n;i++){
//            System.out.println(i+" : "+topologicalSort.get(i));
//        }
        
        
        //printGraph(adj);
        //System.getProperty("java.classpath");
        //System.out.println(topologicalSort.get(0));

        //System.out.println(getMaxEntryInMapBasedOnValue(topologicalSort));
        
//        BigInteger maxValue=Collections.max(topologicalSort.values());
//        
//        System.out.println(maxValue);
        
//        Integer keyy1=maxUsingCollectionsMaxAndLambda(topologicalSort);
//        if(k==1)
//        System.out.println(keyy1+1+" "+topologicalSort.get(keyy1));
//        else {
//        	
//        topologicalSort.remove(keyy1);
//        keyy1=maxUsingCollectionsMaxAndLambda(topologicalSort);
//        System.out.println(keyy1+2+" : "+topologicalSort.get(keyy1));
//        }
        //System.out.println("--------");
        Map<Integer,BigInteger> top=sortbyvalue(topologicalSort,true);
//        top.forEach((key,value)->{
//        	System.out.println(key+1 +" : "+value);
//        });
        
        
        //System.out.println("------");
        Iterator it=top.entrySet().iterator();
        int i=1;
        while(it.hasNext()) {
        	Entry<Integer,BigInteger> en=(Entry)it.next();
        	if(i==k) {
        	System.out.println(en.getKey()+1+" "+en.getValue()); 
        	break;
        	}
        	i++;
        	
        }
//        for (Map.Entry<Integer, BigInteger> en : top.entrySet()) {
//			
//		}
//        
        
        
        t--;
        }
        sc.close();
        return;
    }
    
    static Map<Integer,BigInteger> sortbyvalue(Map<Integer,BigInteger> map,final boolean order){
    	
    	List<Entry<Integer,BigInteger>> list = new LinkedList<Entry<Integer,BigInteger>>(map.entrySet());  
    	
//    	Collections.sort(list, new Comparator<Entry<Integer,BigInteger>>(){
//    		public int compare(Entry<Integer,BigInteger> o1, Entry<Integer,BigInteger> o2)   
//    		{  
//    		
//    		return o2.getValue().compareTo(o1.getValue());   
//    		
//    		}  
//    	});
//    	
//    	Map<Integer,BigInteger> sortedMap = new LinkedHashMap<Integer,BigInteger>();  
//    	for (Entry< Integer,BigInteger> entry : list)   
//    	{  
//    	sortedMap.put(entry.getKey(), entry.getValue());  
//    	}
//    	
//    	return sortedMap;
    	
    	 list.sort((o1, o2) -> order ? o1.getValue().compareTo(o2.getValue()) == 0
                 ? o2.getKey().compareTo(o1.getKey())
                 : o2.getValue().compareTo(o1.getValue()) : o2.getValue().compareTo(o1.getValue()) == 0
                 ? o2.getKey().compareTo(o1.getKey())
                 : o2.getValue().compareTo(o1.getValue()));
         return list.stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    	
    }
//    public static <K, V extends Comparable<V>> K maxUsingCollectionsMaxAndLambda(Map<K, V> map) {
//        Entry<K, V> maxEntry = Collections.max(map.entrySet(), (Entry<K, V> e1, Entry<K, V> e2) -> e1.getValue()
//            .compareTo(e2.getValue()));
//        return maxEntry.getKey();
//    }
    
//    public static <K, V extends Comparable<V> > Entry<K, V> getMaxEntryInMapBasedOnValue(Map<K, V> map) 
//    { 
//        
//        Map.Entry<K, V> entryWithMaxValue = null; 
//  
//        
//        for (Map.Entry<K, V> currentEntry : map.entrySet()) { 
//  
//            if (  entryWithMaxValue == null
//  
//            	|| currentEntry.getValue() 
//                           .compareTo(entryWithMaxValue.getValue()) 
//                       > 0) { 
//  
//                entryWithMaxValue = currentEntry; 
//            } 
//        } 
//  
//       
//        return entryWithMaxValue; 
//    } 
  

    static int count(ArrayList<ArrayList<Integer>> adj, Integer source,Integer current) {//1,1
        int count=0;
        for(int j=0;j<adj.get(current).size();j++){
            if(adj.get(current).size()==1 && adj.get(current).get(j)==source)
                return 1;
            else if(adj.get(current).size()!=1 && adj.get(current).get(j)==source)
                continue;
            else
                count+=count(adj, current, adj.get(current).get(j));
        }
        return count;
           
    }

    

    static void printGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + (i+1));
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+(adj.get(i).get(j)+1));
            }
            System.out.println();
        }
    }

    static BigInteger factorial(int n){
        BigInteger M=new BigInteger("1000000007");
        BigInteger fact=BigInteger.ONE;
        for(int i=2;i<=n;i++){
            fact=(fact.multiply(BigInteger.valueOf(i))).mod(M);
        }
        return fact.mod(M);
    }

    static void addEdge(ArrayList<ArrayList<Integer> > adj,int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}
