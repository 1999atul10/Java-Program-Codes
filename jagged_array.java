class jagged_array { 
    public static void main(String[] args)   { 
        // Declare a 2-D array with 5 rows 
        int intArray[][] = new int[5][]; 
          // create a jagged array that has i column(s) for ith row 
         for (int i=0; i&lt;intArray.length; i++) 
           intArray[i] = new int[i+1]; 
          // Initialize the jagged array 
         int count = 0; 
         for (int i=0; i&lt;intArray.length; i++) 
            for(int j=0; j&lt;intArray[i].length; j++) 
               intArray[i][j] = count++; 
 
        // Display the values of 2D Jagged array 
       System.out.println("A two-dimensional Jagged Array contents:"); 
       for (int i=0; i&lt;intArray.length; i++) 
        { 
           for (int j=0; j&lt;intArray[i].length; j++) 
               System.out.print(intArray[i][j] + " "); 
           System.out.println(); 
        } 
    } 
}