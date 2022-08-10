package com.ipreptech;

public class ArrayUtils {
    public static int arrayMax(int[]array){
        int max =0;
        for(int i = 0;i < array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int arrayMin(int[]array){
        int min = array[0];
        for(int i = 0;i < array.length;i++){
            if(min < array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static int linearSearch(int[]sourceArray, int searchValue){
        for (int i = 0;i < sourceArray.length;i++){
            if(searchValue == sourceArray[i]){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int []array,int value){
        int low = 0;
        int high = array.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(array[mid] == value){
                return mid;
            }else if (array[mid] <value){
                low = mid + 1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void arraySearch(int[] sourceArray,int[] searchArray) {
        insertionSort(sourceArray);
        for (int i = 0; i < searchArray.length; i++) {
           int v = binarySearch(sourceArray, searchArray[i]);
            if (v == -1) {
                System.out.println(searchArray[i] + "no");
            }else {
                System.out.println("yes");
        }

        }
    }



    public static int[] insertionSort(int[]array){
        for(int i = 1;i < array.length;i++){
            int j = i-1;
            int key = array[i];
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        return array;
    }

    public static int [] bubbleSort(int []array){
        for (int i = 0;i < array.length;i++){
            for (int j = 1;j < array.length-1;j++){
                if (array [j-1] < array [j]){
                    int temp = array[j];
                    array [j-1] =array[j];
                    array [j] = temp;
                }
            }
        }
        return array;
    }

    public static int [] selectionSort(int []array){
        for (int i = 0;i < array.length-1;i++){
           int temp = i;
           for (int j = i+1;j < array.length;j++){
               if(array [temp]  > array[j]){
                    temp = j;
               }
           }
           int v = array[i];
           array[i] = array[temp];
           array[temp] = v;
        }
        return array;
    }

    public static String ifSort(int[] array){
        boolean c = true;
        for (int i = 0 ;i < array.length-1;i++){
            if (!(array[i] < array[i+1])){
                c = false;
                break;
            }

        }
        if(c == true) {
            System.out.println("Ascending Order");
            return "Ascending";
        }
        for (int i = 0;i < array.length-1;i++){
            if (!(array[i] > array[i+1])){
                c = true;
                break;
            }

        }
        if(c == false){
            System.out.println("Descending Order");
            return "Descending";
        }else {
            System.out.println("Not Sorted");
            return "None sorted";
        }
    }
}
