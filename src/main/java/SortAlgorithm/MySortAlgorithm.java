package SortAlgorithm;

/**
 * Created by garen on 2018/9/21.
 * 排序算法总和
 */
public class MySortAlgorithm {
    /***
     * 冒泡排序算法,从小到大
     * @param a
     * @return
     */
    public void bubbleSort(int[] a)
    {
        int length = a.length;
        //int temp=0;
        for (int i=0;i<length-1;i++)
        {
            for (int j=0;j<length-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    this.swap(a,j,j+1);
                }
            }
        }
    }

    /**
     * 快速排序算法
     * @param a
     * @return
     */
    public void QuickSort(int[] a)
    {
        this.sort(a,0,a.length-1);
    }

    private void sort(int[] a,int left,int right)
    {
        int i, j, index;
        if (left > right) {
            return;
        }
        i = left;
        j = right;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j) {//这个if判断必不可少
                a[i] = a[j];// 用比基准小的记录替换低位记录
                i++;
            }
            while (i < j && a[i] < index)
                i++;
            if (i < j) { // 用比基准大的记录替换高位记录
                a[j] = a[i];
                j--;
            }
        }
        a[i] = index;// 将基准数值替换回 a[i]
        sort(a, left, i - 1); // 对低子表进行递归排序
        sort(a, i + 1, right); // 对高子表进行递归排序

    }

    /**
     * 堆排序算法
     * @param a
     *
     */
    public void HeapSort(int[] a){
        //1.构建大顶堆
        for(int i=a.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(a,i,a.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=a.length-1;j>0;j--){
            this.swap(a,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(a,0,j);//重新对堆进行调整
        }
    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     * 这里一定要注意括号里的话，并不是去调整为标准的堆树结构！
     * @param arr
     * @param i
     * @param length
     */
    private void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];//先取出当前元素i
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(arr[k] >temp){
                //如果最大的子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                //其实本质上还是交换，只不过不是直接交换!
                arr[i] = arr[k];
                i = k; //这个其实就暗含着交换的意思
            }else{
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }

    /**
     * 希尔排序
     * @param a
     * @return
     */
    public void ShellSort(int[] a)
    {
        int i, j, gap;
        int n = a.length;

        for (gap = n / 2; gap > 0; gap /= 2)
            for (i = gap; i < n; i++)
                for (j = i - gap; j >= 0 && a[j] > a[j + gap]; j -= gap)
                    this.swap(a,j, j + gap);


    }

    /**
     * 归并排序
     * @param a
     */
    public void mergeSort(int[] a)
    {
        int []temp = new int[a.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        this.msort(a,0,a.length-1,temp);


    }

    private  void msort(int[] arr,int left,int right,int []temp){
        if(left<right){
            int mid = (left+right)/2;
            msort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
            msort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }

    private void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }

    /**
     * 插入排序
     * @param a
     *
     */
    public void insertionSort(int[] a)
    {
        int length = a.length;
        Comparable temp;
        int j;
        for (int i = 1; i < length; i++) {
            temp = a[i];
            for (j = i; j > 0 && temp.compareTo(a[j - 1]) < 0; j--) {
                a[j] = a[j - 1];
            }
            a[j] = (int) temp;
        }
    }

    /**
     * 选择排序
     * @param a
     * @return
     */
    public void selectionSort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {// 做第i趟排序
            int k = i;
            for(int j = k + 1; j < a.length; j++){// 选最小的记录
                if(a[j] < a[k]){
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if(i != k){  //交换a[i]和a[k]
                swap(a,i,k);
            }
        }
    }


    /**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */
    private void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }





}
