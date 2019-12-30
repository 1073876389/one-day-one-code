package xuwx.top;/**
 * Created by xuwx on 2019/12/20.
 */

/**
 *@ClassNameTest
 *@Description TODO
 *@Author wx.Xu
 *Date 2019/12/20 9:59
 *Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(test1());
    }
    public static int test1(){
        int a=0;
        try{
            a=1/0;
        }catch (Exception e){
            a=20;
            return a;
        }finally{
            a=99;
            return a;
        }
    }
}
