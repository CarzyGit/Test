/**
 * @author wlkq
 * @date 2022-07-14 9:53
 */
public class Test2 {
    public static int binarySearch(int[] arr,int left,int right,int findVal) {

        //递归的终止条件之二：找不到该元素
        if(left > right) {
            return -1;
        }

        //没有查找完该序列的时候
        int mid = (left + right)/2;
        int midVal = arr[mid];

//		System.out.println("二分查找");

        //判断midVal与findVal的大小关系
        if(findVal > midVal) {//（1）findVal > midVal，则进行向右递归，查找findVal；
            return binarySearch(arr, mid+1, right, findVal);
        }else if(findVal < midVal) {
            return binarySearch(arr, left, mid-1, findVal);//（2）findVal < midVal，则进行向左递归，查找findVal；
        }else {//（3）findVal == midVal，则表明找到了待查找的findVal，直接return mid的坐标值；
            return mid;
        }

    }

}
