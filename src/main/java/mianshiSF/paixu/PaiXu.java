package mianshiSF.paixu;


import java.util.*;

public class PaiXu {



    //定义一个数组
  public static int[] arrayT1 ={2,6,3,1,4,8,9,5,7,10};

    /*static int a = 90;
    int b = 99;*/


    public static void paixu1(){// b = 70;静态方法只能用静态成员变量，不能用非静态成员变量
        int[] arrayT ={2,6,3,1,4,8,9,5,7,10};
        int temp = 0;
        //选择排序
        for(int i = 0; i < arrayT.length;i++){
            for(int j = i+1; j < arrayT.length ; j++){
                if(arrayT[i] > arrayT[j]){
                    temp = arrayT[i];//临时变量存起arrayT[i]
                    arrayT[i] = arrayT[j];//arrayT[j]赋值给arrayT[i];
                    arrayT[j] = temp;//arrayT[j]变为临时变量的值，即arrayT[i]的前值;
                }
            }

        }
        //System.out.println(arrayT.toString());
        System.out.println(Arrays.toString(arrayT));
    }

    public void test1(){//但非静态方法可以用静态成员变量，也可以用非静态成员变量
        //a = 2;
    }


    //冒泡排序
    public static void mpPx(){
        int[] arr ={2,6,3,1,4,8,9,5,7,10};
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i -1;j++){
                System.out.println("j = "+j+", i = "+(arr.length - i -1));
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }  //456
        System.out.println(Arrays.toString(arr));
    }

    public  static void main(String args[]){
        //paixu1();
        mpPx();
    }

}
