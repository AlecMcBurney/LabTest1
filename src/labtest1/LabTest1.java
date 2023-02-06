package labtest1;


public class LabTest1 {
    
    void sortFunction1(int unsorted[])
    {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) // removed equals sign.
        { 
            int index = i;
            for (int j = len-1; j > i; j--) // j can be an index one higher than is in the array. Made the for loop decrement instead of increment.
                if (unsorted[j] < unsorted[index])
                    index = j;
            int t = unsorted[index]; 
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }
 
    void sortFunction2(int unsorted[])
    {
        int length = unsorted.length;
        
        for (int i = 0; i < length; i++) // allowed i to be 1 less than length instead of 2 less.
            for (int j = i +1; j < length; j++) // removed the restricted range.
                if (unsorted[j] < unsorted[i]) { 
                    int t = unsorted[i]; // save index i value
                    unsorted[i] = unsorted[j]; // switch index i and j values
                    unsorted[j] = t; // switch index j instead of j+1
                }
        
    }
     
    void sortFunction3(int unsorted[])
    {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];
            int j = i + 1; 
            
            while (j > 0 && unsorted[j] > item ) { 
                unsorted[j + 1] = unsorted[j];// Tries to access array length + 1
                j = j - 1;
            }
            
            unsorted[j + 1] = item;
        }
    }
     
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        LabTest1 obj = new LabTest1();
        /*
        int unsorted[] = {64,25,12,22,11}; // should output 11 12 22 25 64
        obj.sortFunction1(unsorted);
        System.out.println("Sorted array1 : ");
        obj.printArray(unsorted);
        */
        
        /*
        int unsorted2[] = {64,25,12,22,11}; // Originally just moves 12 to the beginning of the array.
        obj.sortFunction2(unsorted2);
        System.out.println("Sorted array2 : ");
        obj.printArray(unsorted2);
        */
        
        
        int unsorted3[] = {64,25,12,22,11};
        obj.sortFunction3(unsorted3);
        System.out.println("Sorted array3 : ");
        obj.printArray(unsorted3);
        
    }
    
}
