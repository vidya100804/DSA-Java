package SEARCHINGS;

public class floor {
    public static void main(String[] args) {
        //public class ceil {
           // public static void main(String[] args) {
                int[] arr = {10, 19, 24, 36, 45, 56, 77, 89};
                int target = 44;
                int result = binary(arr, target);
                System.out.println("Found At Index: " + result);
            }
        
            static int binary(int[] arr, int target) {
                int start = 0;
                int end = arr.length - 1;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (arr[mid] == target) {
                        return mid;
                    } else if (arr[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                return end; 
            }
        }
            
            
        
        
    
    

