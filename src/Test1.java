//程序目的:用分治法中的快速排序解决排序问题
//快速排序:选取基准元素,以基准元素为标准,就问题分为两个子序列,将小于或等于基准元素的子序列放在左侧,大于基准元素的子序列放在右侧

public class Test1{
    public static void swap(int array[],int a,int b){//交换函数
        int temp;
        temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    public  static int Partition(int r[],int low,int high){
        int i=low ;
        int j=high;
        int pivot=r[low];//基准元素
        while(i<j) {
            while (i < j && r[j] > pivot) //向左扫描
                j--;

            if (i < j) {
                swap(r, i++, j);
            }
            while (i < j && r[i] <= pivot) {//向右扫描
                i++;
            }
            if (i < j) {
                swap(r, i, j--);
            }
        }

        return i;
    }
    public static void QuickSort(int R[],int low,int high){
        int mid;
        for (int t:R){
            System.out.print(t+" ");
        }
        System.out.println();
        if(low<high){
            mid=Partition(R,low,high);
            QuickSort(R,low,mid-1);
            QuickSort(R,mid+1,high);
        }
    }
    public static void main(String args[]){
        int a[]={12, 0, 9, 63, 70, 86, 15, 1, 91};

        QuickSort(a,0,a.length-1);


    }
}
