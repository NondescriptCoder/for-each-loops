import java.util.ArrayList;

public class EnhancedForLoop
{
    public void example()
    {
        /********** Examples **********/

        int[] arr = {4,5,1,2,3,8};

        // Ex. 1
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();

        // Ex. 2
        for (int x: arr)
            x++; // remember, x is a copy of each item in the array

        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();

        // Ex. 3
        for (int i=0; i<arr.length; i++)
            arr[i]++; // now we are actually changing elements in the array

        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();

        // Ex. 4
        Pet[]   pets = {new Pet("Phineas"),new Pet("Ferb"),new Pet("Perry")};

        for (Pet p : pets)
            p.sleep();

        for (Pet p : pets)
            System.out.println(p);

        ArrayList<Pet> morePets = new ArrayList<Pet>();
        morePets.add(new Pet("Milo"));
        morePets.add(new Pet("Otis"));

        for (int i=morePets.size()-1; i>=0; i--) {
            Pet p = morePets.get(i);

            morePets.remove(i);
            p.eat();
        }

    }
    
    /**********Tester Method********/
    public static void main(String[] args)
    {
        //Test Arrays
        double[] doubleArray = {2.6, 4.7, 8.9, 1.1, 88.2, 13.7};
        int[] intArray = {6, 2, 17, 9, 5, 33};
        String[] stringArray = {"alpha", "beta", "gamma", "delta"}; 
        
        //1
        System.out.println(mean(doubleArray));
        
        //2
        System.out.println(max(doubleArray));
        
        //3
        System.out.println(sumEvenVals(intArray));
        
        //4
        System.out.println(vowelCount(stringArray));
        
        //5
        System.out.println(sumEvenLocs(doubleArray));
        
    }

    /********** Your turn **********/

    // #1 - Write a method mean(double nums[]) which uses an enhanced
    //      for loop to return the mean of the elements in nums. Test
    //      the method here.

    public static double mean(double nums[])
    {
        double total = 0;

        for(double a: nums)
        {
            total += a;
        }

        return total / nums.length;
    }

    // #2 - Write a method max(double nums[]) which uses an enhanced
    //      for loop to return the maximum value of the elements in
    //      nums. Then test the method.

    public static double max(double nums[])
    {
        double max = nums[0];

        for(double a: nums)
        {
            if (a > max) max = a;
        }

        return max;
    }

        
    // #3 - Write a method sumEvenVals that uses an enhanced for 
    //      loop to return the sum of all even values stored in an 
    //      Array.  Then test the method.

    public static int sumEvenVals(int nums[])
    {
        int sum = 0;

        for(int a: nums)
        {
            sum += a;
        }

        return sum;
    }

    // #4 - Write a method vowelCount that uses an enhanced for loop
    //      to count the number of vowels (a,e,o,u only) in a list
    //      of words.

    public static int vowelCount(String list[])
    {
        int count = 0;

        for(String a: list)
        {
            for(int i = 0; i < a.length(); i++)
            {
                if(a.charAt(i)=='a'||
                a.charAt(i)=='e'||
                a.charAt(i)=='i'||
                a.charAt(i)=='o'||
                a.charAt(i)=='u')
                {
                    count++;
                }
            }
        }

        return count;
    }

    // #5 - Write a method sumEvenLocs that uses an enhanced for 
    //      loop to find the sum of all values stored with even 
    //      numbered indices in an Array. Then test the method.

    public static double sumEvenLocs(double nums[])
    {
        int sum = 0;
        boolean isEven = true;

        for(double a: nums)
        {
            if(isEven) 
            {
                sum++;
                    isEven = false;
                }
                else
                {
                    isEven = true;
                }
            }

            return sum;
    }

    // #6 - Solve #5 using a regular for loop. Then explain why a
    //      regular for loop is more appropriate for that problem.

    public static double regularSumEvenLocs(double nums[])
    {
        int sum = 0;
        boolean isEven = true;

        for(int i = 0; i < nums.length; i+=2)
        {
            sum++;
        }

        return sum;
        
        /**
         * A regular for loops is more appropriate for this problem because
         * it allows one to iterate by 2 as opposed to iterating through all
         * of the elements in an array and then checking the index.
         */
    }

}