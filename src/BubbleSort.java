class BubbleSort
{
    void bubble_sort(int arc[])
    {
        int n = arc.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arc[j] > arc[j+1])
                {
                  
                    int temp = arc[j];
                    arc[j] = arc[j+1];
                    arc[j+1] = temp;
                }
    }
 

    void print_array(int arc[])
    {
        int n = arc.length;
        for (int i=0; i<n; ++i)
            System.out.print(arc[i] + " ");
        System.out.println();
    }
 
 
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arc[] = {9,11,2,1,44,99,53,0};
        ob.bubble_sort(arc);
        System.out.println("Sorted array :");
        ob.print_array(arc);
    }
}