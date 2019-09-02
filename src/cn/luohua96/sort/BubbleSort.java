package cn.luohua96.sort;

/**
 * 冒泡算法实现
 */
public class BubbleSort implements IArraySort {
    public static void main(String[] args) {
        int[] originData = new int[]{12, 3, 45, 34, 0, 98, 67, 101, 96, 67, 89, 5};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.print("原始数据：  ");
        printData(originData);
        System.out.println();
        int[] result = bubbleSort.sort(originData);
        System.out.print("结果是： ");
        printData(result);
    }


    public static void printData(int[] data) {
        for (int k : data) {
            System.out.print(k + " ");
        }
    }

    @Override
    public int[] sort(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length - 1; i++) {
            int temp = 0;
            for (int j = 0; j < sourceArray.length - i - 1; j++) {
                if (sourceArray[j] > sourceArray[j + 1]) {
                    temp = sourceArray[j + 1];
                    sourceArray[j + 1] = sourceArray[j];
                    sourceArray[j] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "趟排序结果： ");
            printData(sourceArray);
            System.out.println();
        }
        return sourceArray;
    }
}
