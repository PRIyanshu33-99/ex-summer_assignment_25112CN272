import java.util.Scanner;

class day13_assignment
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements");

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        // Q49 Display Array
        System.out.println("\nArray Elements are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }

        // Q50 Sum and Average
        int s = 0;

        for(int i=0;i<n;i++)
        {
            s = s + a[i];
        }

        double avg = (double)s/n;

        System.out.println("\n\nSum = " + s);
        System.out.println("Average = " + avg);

        // Q51 Largest and Smallest
        int big = a[0];
        int small = a[0];

        for(int i=1;i<n;i++)
        {
            if(a[i] > big)
            {
                big = a[i];
            }

            if(a[i] < small)
            {
                small = a[i];
            }
        }

        System.out.println("\nLargest Element = " + big);
        System.out.println("Smallest Element = " + small);

        // Q52 Even and Odd Count
        int even = 0, odd = 0;

        for(int i=0;i<n;i++)
        {
            if(a[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.println("\nEven Elements Count = " + even);
        System.out.println("Odd Elements Count = " + odd);
    }
}