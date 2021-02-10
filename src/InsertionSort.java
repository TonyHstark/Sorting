
class InsertionSort
{ 
    void insert_sort(int arc[]) 
    { 
        int n = arc.length; 
        for (int i = 1; i < n; ++i)
        { 
            int key = arc[i]; 
            int j = i - 1; 
            while (j >= 0 && arc[j] > key)
            { 
                arc[j + 1] = arc[j]; 
                j = j - 1; 
            } 
            arc[j + 1] = key; 
        } 
    } 
 
    static void print_array(int arc[]) 
    { 
        int n = arc.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arc[i] + " "); 
  
        System.out.println(); 
    } 
  
 
    public static void main(String args[]) 
    { 
        int arc[] = { 9,1,2,55,44,23,0,99}; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.insert_sort(arc);
        System.out.println("Sorted array :");
  
        print_array(arc); 
    } 
}