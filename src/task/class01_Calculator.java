package task;       /*实现一个可以解析字符串的计算器
         传入一个字符串，解析此字符串数字与运算符做计算
         比如:
         字符串str="1+2", 可计算出结果=3
         字符串str="1+22", 可计算出结果=23
         字符串str="1+2*4", 可计算出结果=9
         字符串str="1+2*4+144/2", 可计算出结果=11
         */


       import java.lang.reflect.Type;
       public class class01_Calculator {
    String str ;
    public  class01_Calculator(String str){
        this.str = str;
    }

    public String Calculator(){

        float sum=0;
        String num = "";

        String[] s= str.split("");

        if (s.length==3) {
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//        System.out.println(s[2]);
            if (s[1].equals("+")) {
                sum = Integer.valueOf(s[0]) + Integer.valueOf(s[2]);
                num = String.valueOf(sum);
            } else if (s[1].equals("-")) {
                sum = Integer.valueOf(s[0]) - Integer.valueOf(s[2]);
                num = String.valueOf(sum);
            } else if (s[1].equals("*")) {
                sum = Integer.valueOf(s[0]) * Integer.valueOf(s[2]);
                num = String.valueOf(sum);
            } else if (s[1].equals("/")) {
                sum = Float.valueOf(s[0]) / Float.valueOf(s[2]);
                num = String.valueOf(sum);
            } else {
                num = "输入错误！";
            }
            return num;
        }

        else {
            num="长度不能超过3位！";
            return num;
        }

    }

}




