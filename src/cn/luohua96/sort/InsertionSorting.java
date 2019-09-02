package cn.luohua96.sort;

/**
 * 插入排序实现
 */
public class InsertionSorting implements IArraySort {
    public static void main(String[] args) {
        int[] originData = new int[]{56, 31, 5, 74, 0, 98, 67, 101, 96, 67, 89, 5};
        System.out.print("原始数据：   ");
        printData(originData);
        System.out.println();
        InsertionSorting insertionSorting = new InsertionSorting();
        int[] result = insertionSorting.sort(originData);
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
        //从下标为0的元素开始拷贝
        for (int i = 1; i < sourceArray.length; i++) {
            int tmp = sourceArray[i];

            //保存要插入的数
            int j = i;
            //从已经有序的序列最右边开始比较，找到比其小的数字
            while (j > 0 && tmp < sourceArray[j - 1]) {
                sourceArray[j] = sourceArray[j - 1];
                j--;
            }

            //存在比其小的数，插入
            if (j != i) {
                sourceArray[j] = tmp;
            }

            System.out.print("循环次数:" + i + "   ");
            printData(sourceArray);
            System.out.println();
        }
        return sourceArray;
    }
}
