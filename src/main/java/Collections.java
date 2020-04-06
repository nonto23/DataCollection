
import java.util.*;
public class Collections {




        // Function to find maximum number of
        // Unique integers in Sub-Array
        // of given size
        public static int MyQueeUniqueNumber(int dequee[],
                                       int number, int subSize)
        {
            int maxUnique = 0;

            // Generate all subarrays of size subsize
            for (int i = 0; i < number - subSize; i++) {
                int initialUnique = 0;

                HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

                for (int x = i+1; x < i + subSize; x++) {


                    // push the key in map and increment
                    // count for unique number
                    if (!hash.containsKey(dequee[x])) {
                        hash.put(dequee[i], 1);
                        initialUnique++;
                        continue;
                    }
                }

                if (initialUnique > maxUnique)
                    maxUnique = initialUnique;
            }

            return maxUnique;
        }

        // main code
        public static void main(String[] args)
        {


            int[] quee = {2,2,2,2,2,2,2,2 };
            int Number = 8;
            int subArraySize = 4;


//            int[] quee = {7, 5, 5 ,7, 5, 5, 7, 5 ,5, 6 };
//            int Number = 10;
//            int subArraySize = 3;



            System.out.println("The output is : "+MyQueeUniqueNumber(quee, Number, subArraySize));
        }

}
