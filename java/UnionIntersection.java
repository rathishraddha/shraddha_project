import java.util.*;

public class UnionIntersection
{
    public static List<Integer> findUnion(int[] arr1, int[] arr2)
    {
        List<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                unionList.add(arr1[i]);
                i++;
            }
            else if (arr1[i] > arr2[j])
            {
                unionList.add(arr2[j]);
                j++;
            }
            else
            {
                unionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < arr1.length)
        {
            unionList.add(arr1[i]);
            i++;
        }

        // Add remaining elements of arr2
        while (j < arr2.length)
        {
            unionList.add(arr2[j]);
            j++;
        }

        return unionList;
    }

    public static List<Integer> findIntersection(int[] arr1, int[] arr2)
    {
        List<Integer> intersectionList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                i++;
            }
            else if (arr1[i] > arr2[j])
            {
                j++;
            }
            else
            {
                intersectionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        return intersectionList;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        List<Integer> union = findUnion(arr1, arr2);
        List<Integer> intersection = findIntersection(arr1, arr2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
