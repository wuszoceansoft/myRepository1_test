package mianshiSF.xunhuan;

public class zhijiaoSJX {

    public static void main(String args[]){
        System.out.println("ooo888ookkkkk5555");
        /*zZjsjx();
        dZjsjx();*/

       /* zDysjx(); 这两个组合得到菱形
        dDysjx();*/

        zkDysjx();
        kdLX();

        jjcfb();
        //jjcfby();
    }

    //正直角三角形;;正的话，i <= 行数，i++
    public static void zZjsjx(){
        for(int i = 1;i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //倒直角三角形；；倒的话，i = 行数，i > 0; i--;;j 的方向不变
    public static void dZjsjx(){
        for(int i = 4;i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    //正向的等腰三角形
    public static void zDysjx(){
        for(int i = 1; i <= 4; i++){//控制行
            for(int x = 1; x <= 4 - i+5; x++){//控制输出空格 +4 表示往右边移动4个空格
                System.out.print(" ");
            }
            for(int y = 1; y <= i*2-1; y++){//控制输出***
                System.out.print("*");
            }
            System.out.println();
        }

    }
    //倒向的等腰三角形
    public static void dDysjx(){
        for(int i = 5; i > 0; i--){//控制行
            for(int x = 1; x <= 5 - i+4; x++){ //控制输出空格 +4 表示往右边移动4个空格
                System.out.print(" ");
            }
            for(int y = 1; y <= i*2-1; y++){//控制输出***
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //正向的空的等腰三角形
    public static void zkDysjx(){
        for(int i = 1; i <= 4; i++){//控制行
            for(int x = 1; x <= 4 - i+5; x++){//控制输出空格 +4 表示往右边移动4个空格
                System.out.print(" ");
            }
            for(int y = 1; y <= i*2-1; y++){//控制输出***
                if(y > 1 && y < i*2-1 && i < 4){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }

    //空的菱形
    public static void kdLX(){
        for(int i = 1; i <= 4; i++){//控制行
            for(int x = 1; x <= 4 - i+5; x++){//控制输出空格 +4 表示往右边移动4个空格
                System.out.print(" ");
            }
            for(int y = 1; y <= i*2-1; y++){//控制输出***
                /*if(y > 1 && y < i*2-1 && i < 4){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }*/
                if(y > 1 && y < i*2-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        for(int i = 5; i > 0; i--){//控制行
            for(int x = 1; x <= 5 - i+4; x++){//控制输出空格 +4 表示往右边移动4个空格
                System.out.print(" ");
            }
            for(int y = 1; y <= i*2-1; y++){//控制输出***
                /*if(y > 1 && y < i*2-1 && i < 4){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }*/
                if(y > 1 && y < i*2-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }


    //九九乘法表
public static void jjcfb(){
    for(int i = 0; i <= 9; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j + "x" + i + " = "+ (i *j)+" \t" );
        }
        System.out.println();
    }

}

   /* public static void jjcfby(){
        for(int i = 9; i > 0; i--){
            *//*for(int x = 1; x < i; x++){
                System.out.print(" ");
            }*//*
            for(int j = 1; j <= i; j++){
                System.out.print(j + "x" + i + " = "+ (i *j)+" \t" );
            }
            System.out.println();
        }

    }*/



}
