package mianshiSF.xunhuan;

//公鸡5元一只，母鸡3元一只，小鸡1元三只，现要用100块钱能够买100只鸡，总共有多少种方案(隐藏的条件，小鸡数一定能够被3整除)
public class Bqmbq {

    public static void fangf(){

        /*for(int x = 1;x < 20; x++){  //1
            for(int y = 1; y < 33; y++){
                for(int z = 3; z < 33; z++){
                    if(x*5 + y*3 + z*1 == 100){
                        System.out.println(" 公鸡有 "+x+" 只，母鸡有 "+y+" 只，小鸡有 "+z+" 只");
                    }
                }
            }
        }*/
        int count = 0;
        /*for(int x = 1;x < 20; x++){  //2
            for(int y = 1; y < 33; y++){

                if(x*5 + y*3 +(100-x-y)*1/3 == 100){//隐含条件的没写 1 / 3 为每只小鸡的单价
                    System.out.println("9999");
                    count++;
                    System.out.println("第 "+count+" 种方式： 公鸡有 "+x+" 只，母鸡有 "+y+" 只，小鸡有 "+(100-x-y)+" 只");
                }

            }
        }*/

        for(int x = 1;x < 20; x++){  //3 ok
            for(int y = 1; y < 33; y++){

                //小鸡的单价为 1/3 小鸡的数量为 xj = 100-x-y
                int xj = 100-x-y;

                if(x*5 + y*3 + xj * 1/3 == 100 && xj % 3 == 0){//隐含条件的没写 1 / 3 为每只小鸡的单价
                   // System.out.println("9999");
                    count++;
                    System.out.println("第 "+count+" 种方式： 公鸡有 "+x+" 只，母鸡有 "+y+" 只，小鸡有 "+(100-x-y)+" 只");
                }

            }
        }

    }

    public static void main(String args[]){
        fangf();
    }

}
