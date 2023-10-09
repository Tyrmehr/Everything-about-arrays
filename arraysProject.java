/*
 * Having fun with arrays
 */
package havingFunArrays;

public class arraysProject {

	public static void main(String[] args) {
		System.out.println ("Using Methods with Arrays");

        // Generate an array of 30 doubles between 1 and 100 – including 1 and 100 
        double[] firstList = generateArray (30, 1, 100);

	    // Display array, with 10 numbers in each row
        System.out.println ("Here are the numbers: ");
        displayArray (firstList, 10);

        // Find and display the average of the numbers in the array
        System.out.print ("The average of the numbers in the above array is: ");
        System.out.printf ("%.1f%n", averageOfArray (firstList));

        // Find and display the index and value of the smallest number
        int index = indexOfSmallest (firstList);
        System.out.print ("\nThe index of the smallest number is: ");
        System.out.println (index);
        System.out.print ("The smallest number in the above list is: ");
        System.out.printf ("%.2f%n", firstList [index]);

        // Sort and then display the array, with 8 numbers in each row
        sortArray (firstList);
        System.out.println ("\nHere is the first sorted array: ");
        displayArray (firstList, 8);

        /// Generate a second array of 25 elements between -100 and 100, inclusive, 
    	// and sort this second list
    	double[] secondList = generateArray (25, -100, 100);
    	sortArray (secondList);
    	System.out.println ("\nHere is the second sorted array: ");
    	displayArray (secondList, 6);
    	
    	// Merge the two sorted arrays into a single sorted array
    	double[] mergedList = mergeArrays (firstList, secondList);      


    	// Display the merged array, with 12 numbers in each row
    	System.out.println ("\nHere is the merged array: ");
    	displayArray (mergedList, 12);

        System.out.println ("The Using Methods with Arrays Program is Complete");
    } 
	//Start of our methods
	public static double[] generateArray(int size, double start, double end)
    {
        //Taking a double for the first list and getting it's size
		double[]firstList= new double[size+1];
        //Putting it into a for loop to generate the numbers
		for(int i=0; i<firstList.length; i++)
        {
            firstList[i] = (double)(Math.random()*(end-start))+start;
        }
        //Setting a return
		return firstList;
    }//end of inner loop
        
        public static double averageOfArray(double[] firstList)
        {
            //This code calculates the average number by finding the sum of the numbers
            double total=0;
            //for loop to find the length of the array
            for(int i=0; i<firstList.length; i++)
            {
                total = (double) (total + firstList[i]);
            }
            //Divide to find the average and get the return
            double average = total / firstList.length;
            return average;
        }//end of inner loop
        
            
            public static int indexOfSmallest(double[] firstList)
            {
            	//Great an double for the minimum number and int for the index
            	double min = firstList[0];
      	       int index=0;
      	       //Make a for loop for the length
      	       for(int i = 0; i < firstList.length; i++)
      	       {
      	            //Create an if statement for the smallest number
      	    	   if(min > firstList[i])
      	            {
      	                min = firstList[i];
      	                index=i;
      	            }
      	            
      	        }
      	     //Get the return
      	       return index;
            }//end of inner loop
      	     
      	   //In class activity
            public static void sortArray(double firstList[]) 
      	    {
      	        // We remember the length of the original array
      	        int a = firstList.length;

      	        //The number passes through the array and get -1 each time
      	        for (int i = 0; i < a-1; i++) 
      	        {
      	            //This for loop is so it starts to scan the elements at the beggining, then it goes on to the next, and so on until variable becomes zero
      	            for (int j = 0; j < a-i-1; j++) 
      	            {
      	                //Now, if the larger value is bigger than the smaller one we swap them
      	                if (firstList[j] > firstList[j+1]) 
      	                {
      	                    // swap firstList[j+1] and firstList[j]
      	                    double temp = firstList[j];
      	                    firstList[j] = firstList[j+1];
      	                    firstList[j+1] = temp;
      	                }
      	            }// end inner for loop
      	            
      	        } 
      	    }
      	            
      	         

      	      public static double[] mergeArrays(double firstList[],double secondList[])
      	    {
      	        //Create a loop that takes the two arrays and make them into one bigger array
      	        double length1= firstList.length;
      	        double length2= secondList.length;

      	        double[] result= new double[(int) (length1+length2)];
      	        //Create 3 variables for the lengths
      	        int firstL=0;
      	        int secondL=0;
      	        int finalL=0;
      	        //Create a while loop for the lengths to be largewr than both of the lists
      	        while(firstL<length1 && secondL<length2)
      	        {
      	            if(firstList[firstL]<secondList[secondL])
      	            {
      	                result[finalL++]=firstList[firstL++];
      	            }
      	            else
      	            {
      	                result[finalL++]=secondList[secondL++];
      	            }
      	        }
      	        //Create another while loop for if the first length is less than the given first list
      	        while(firstL<length1)
      	        {
      	            result[finalL++]=firstList[firstL++];
      	        }
      	        //Now a while loop is the second is less than the length
      	        while(secondL<length2)
      	        {
      	            result[finalL++]=secondList[secondL++];
      	        }
      	        //Return results
      	        System.out.println();
      	        return result;
      	    }//End of inner loop
      	   
      	      public static double[] displayArray(double[] firstList, int row)
      	    {

      	        //Create a for loop to display
      	        for(int i = 1; i < firstList.length; i++) 
      	        {
      	        	//Create a math random to round
      	            double newList = Math.round(firstList[i]*10)/10.0;
      	            System.out.printf("%.2f ", newList);
      	            if(i % row == 0)
      	            {	
      	            	//Next line
      	                System.out.println();
      	            }
      	        }

      	        //Obtain return
      	        return firstList;
      	    }//end of inner loop

            
      	
            
        

}//end of the program






