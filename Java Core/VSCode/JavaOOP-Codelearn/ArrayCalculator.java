class ArrayCalculator {
    public static int maxOfArray(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
    public static double maxOfArray(double[] arr){
        double max = arr[0];
        for(double i : arr){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
    public static int minOfArray(int[] arr){
        int min = arr[0];
        for(int i : arr){
            if(min > i){
                min = i;
            }
        }
        return min;
    }
    public static double minOfArray(double[] arr){
        double min = arr[0];
        for(double i : arr){
            if(min > i){
                min = i;
            }
        }
        return min;
    }    
}