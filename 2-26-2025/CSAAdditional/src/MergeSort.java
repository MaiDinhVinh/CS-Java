public class MergeSort {
    private static int[] myArray;
    private static int[] tempArray;

    public static void main(String[] args) {
        int[] inputArray = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(inputArray);
        for (int i : inputArray) {
            System.out.print(i + "\t");
        }
    }

    /**
     * This method starts the process of the Merge Sort.
     *
     * @param arr the array to be sorted
     */
    private static void mergeSort(int arr[]) {
        myArray = arr;
        int length = arr.length;
        tempArray = new int[length];
        setUpMerge(0, length - 1);
    }

    /**
     * This method is called recursively to divide the array
     * into each of the groups to be sorted.
     *
     * @param lower  the lower index of the subgroup
     * @param higher  the higher index of the subgroup
     */
    private static void setUpMerge(int lower, int higher)
    {
        if (lower < higher)
        {
            int middle = lower + (higher - lower) / 2;
            setUpMerge(lower, middle);
            setUpMerge(middle + 1, higher);
            doTheMerge(lower, middle, higher);
        }
    }

    /**
     * This method merges the elements in two subgroups
     * ([start, middle] and [middle + 1, end]) in ascending order.
     * @param lower the index of the lower element
     * @param middle the index of the  middle element
     * @param higher the index of the higher element
     */
    private static void doTheMerge(int lower, int middle, int higher)
    {
        for (int i = lower; i <= higher; i++)
        {
            tempArray[i] = myArray[i];
        }
        int i = lower;
        int j = middle + 1;
        int k = lower;
        while (i <= middle && j <= higher)
        {
            if (tempArray[i] <= tempArray[j])
            {
                myArray[k] = tempArray[i];
                i++;
            }
            else
            {
                myArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle)
        {
            myArray[k] = tempArray[i];
            k++;
            i++;
        }
    }
}