package cn.luohua96.sort;

/**
 * 选择排序实现
 */
public class SelectionSort implements IArraySort {
    public static void main(String[] args) {
        int[] originData = new int[]{56, 31, 5, 74, 0, 98, 67, 101, 96, 67, 89, 5};
        System.out.print("原始数据：   ");
        printData(originData);
        System.out.println();
        SelectionSort selectionSort = new SelectionSort();
        int[] resultData = selectionSort.sort(originData);
        System.out.print("结果是： ");
        printData(resultData);
    }


    public static void printData(int[] data) {
        for (int k : data) {
            System.out.print(k + " ");
        }
    }

    @Override
    public int[] sort(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length - 1; i++) {
            int min = sourceArray[i];
            int index = i;
            for (int j = i; j < sourceArray.length; j++) {
                if (sourceArray[j] < min) {
                    min = sourceArray[j];
                    index = j;
                }
            }
            int temp = sourceArray[index];
            sourceArray[index] = sourceArray[i];
            sourceArray[i] = temp;
            System.out.print("循环次数:" + (i + 1) + "   ");
            printData(sourceArray);
            System.out.println();

        }
        return sourceArray;
    }
}
