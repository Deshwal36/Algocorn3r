/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class LinesProcMap {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         [
            22, Ravi Pawar, Aundh, 1603
            23, Suvarna Kale, Baner, 803
            27, Vinod Chavan, Aundh, 809
            29, Vasant Mahajan, Aundh, 617
            32, Aarti Patil, Baner, 351
            34, Swaran Bijur, Baner, 352
         ]
         *
         * */
        int size=array.size();

        if(size==0){
            return null;
        }
        String[][] arr=new String[size][4];

        for (int i=0;i<size;i++ ){

            arr[i]=array.get(i).split(", ");

        }

        Map<String,Integer> maxCon = new HashMap<String,Integer>();
        Map<String,Integer> retVal = new HashMap<String,Integer>();

        System.out.println(maxCon.toString());
        System.out.println(retVal.toString());

        maxCon.put(arr[0][2],Integer.valueOf(arr[0][3]));
        retVal.put(arr[0][2],Integer.valueOf(arr[0][0]));
        
        for (int i=1; i<size ; i++ ){

            if(maxCon.containsKey(arr[i][2])){
                if(Integer.valueOf(arr[i][3]) > maxCon.get(arr[i][2])){
                    retVal.put(arr[i][2],Integer.valueOf(arr[i][0]));
                }
            }else{
                maxCon.put(arr[i][2],Integer.valueOf(arr[i][3]));
                retVal.put(arr[i][2],Integer.valueOf(arr[i][0]));
            }

        }


       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
