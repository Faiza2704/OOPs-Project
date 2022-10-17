public class TargetNum {

      public static void main(String[] args)
        {
            int[] arr = {4,6,12,18};
            int target = 18;

            for (int i = 0; i < arr.length-1; i++) {
                for (int j=i+1; j<arr.length; j++){
                    if(arr[i]+arr[j]==target){
                        System.out.println("index:"+i+","+j+" "+arr[i]+"+"+arr[j]+"="+target);
                        break;
                    }
                }
            }
        }
    }


