public class DividAndConquir {
    public int binarySearch(int target) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        DividAndConquir obj=new DividAndConquir();
        int target=10;
        int result=obj.binarySearch(target);
        if(result!=-1){
            System.out.println("Element found at index: "+result);
        }
        else{
            System.out.println("Element not found in the array.");
        }
    }
}
