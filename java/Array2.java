public class Array2
{
    public static void main(String[] args)
    {
        int arr[] = {5,50,11};
        if(arr.length == 0)
        {
            System.out.println("array is empty");
            return;
        }

        int min=arr[0], max=arr[0];

        for(int i=0; i<arr.length; i++)
        {
            //System.out.println("element is:" + arr[i]);
            
            if(min > arr[i])
            {
                min = arr[i];
                System.out.println(min);
            }
            else if(max < arr[i])
            {
                max = arr[i];
                System.out.println(max);
            }
        }

        System.out.println("min value:" + min);
        System.out.println("max value:" + max);
    }
}