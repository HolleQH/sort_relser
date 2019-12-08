package com.bubbling;

public class Demo {
    public static void main(String[] args) {

        int [] arr = {11,23,45,66,33,67,78};
        method1(arr);
    }

    public static void method1(int [] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length -1 -i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (int a:arr
             ) {
            System.out.print(a + "  ");
        }


    }

    //与第一种方式相同，只不过这个是从后往前比，上一个从前往后比
    public static void test2(int arr[]){
        for(int i = 0;i < arr.length ;i++){
            for (int j = arr.length-1;j>i;j--){
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }

        }
        for (int a:arr
        ) {
            System.out.println(a);
        }

    }

    //在小循环的比较中加入判断，如果在某一次的打循环中，没有进入小循环的if里，则表示排序已经完成，直接break即可
    public static void method3(int arr[]){
        for(int i = 0;i<arr.length;i++){
            boolean falg = true;
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = tmp;
                    falg = false;
                }
            }
            if(falg) break;
        }
        for (int a:arr
        ) {
            System.out.println(a);
        }

    }
}
