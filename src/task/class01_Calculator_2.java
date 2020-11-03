package task;       /*实现一个可以解析字符串的计算器
         传入一个字符串，解析此字符串数字与运算符做计算
         比如:
         字符串str="1+2", 可计算出结果=3
         字符串str="1+22", 可计算出结果=23
         字符串str="1+2*4", 可计算出结果=9
         字符串str="1+2*4+144/2", 可计算出结果=11
         */


    public class class01_Calculator_2 {
    String str ;
    public class01_Calculator_2(String str){
        this.str = str;
    }

    public String Calculator2(){

        float sum=0;
        String num = "";
        String s_cal="";
        String NUM_REGEX = "^(-?\\d+)(\\.\\d+)?$";//浮点数

        if (str.length()>3){
        String[] s = str.split("\\+|\\-|\\*|\\/");
//        System.out.println(s[0]);
        String[] s1= str.split("");
        for (int u=0;u<s1.length;u++){
            if (s1[u].equals("+") || s1[u].equals("-")|| s1[u].equals("*")|| s1[u].equals("/")){
                s_cal=s1[u];
            }
//            else s_cal="0";
//            System.out.println("s1="+s1[u]);
//            System.out.println("s_cal="+s_cal);
        }

        if (s[0].matches(NUM_REGEX) && s[1].matches(NUM_REGEX)  && s.length==2) {
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//        System.out.println(s[2]);
                if (s_cal.equals("+")) {
                    sum = Integer.valueOf(s[0]) + Integer.valueOf(s[1]);
                    num = String.valueOf(sum);
                } else if (s_cal.equals("-")) {
                    sum = Integer.valueOf(s[0]) - Integer.valueOf(s[1]);
                    num = String.valueOf(sum);
                } else if (s_cal.equals("*")) {
                    sum = Integer.valueOf(s[0]) * Integer.valueOf(s[1]);
                    num = String.valueOf(sum);
                } else if (s_cal.equals("/")) {
                    sum = Float.valueOf(s[0]) / Float.valueOf(s[1]);
                    num = String.valueOf(sum);
                } else {
                    num = "输入错误！";
                }
        }

        else {
                num="格式不正确，应输入数字、操作符。且只能有一位操作符。";
            }
        }
        else {
            num="长度不能小于3";
        }
        return num;
    }

}




