package mianshiSF.xunhuan;

//猴子第一天摘了N个桃子，当时猴子就吃了一半，还不过瘾吗，又吃了一个，第二天又将剩下的吃掉一半，又吃了一个，
// 此后每天吃掉剩下的一半零一个，直到第10天时，只剩下一个了，问第一天共摘了多少个桃子
public class Hzct {


    public  static void fangf(){

        //x - 1/2*x-1 = 明天的，x 为今天的   ----> x = x - 1/2*x - 1 = x/2 - 1 , 设今天的为y ,即 x/2 - 1 = y ====>>> x = (y + 1) * 2，推出这个等式之后，将x,y都换成count便可

        int count = 1;//即将当天的数量设为count
        for(int i = 1; i <= 10; i++){//i天数;;;这个方法用等号右边推出左边的方法最简单明了
            count = (count + 1)*2;

            System.out.println("第 "+i+"天的桃子数为： "+count);
        }

        System.out.println("桃子总数为: "+count );

    }


    public static void main(String args[]){
        fangf();
    }

}
