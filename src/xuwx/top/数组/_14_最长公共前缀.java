package xuwx.top.数组;

/**
 * leetcode : https://leetcode-cn.com/problems/longest-common-prefix/
 *
 *@ClassName _14_最长公共前缀
 *@Description TODO
 *@Author wx.Xu
 *Date 2019/12/24 13:32
 *Version 1.0
 */
public class _14_最长公共前缀 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        int prefixSize = 0;
        int max = Integer.MAX_VALUE;
        if (strs.length>0){
            for (String str:strs){
                char[] charArr = str.toCharArray();
                if(charArr.length<max){
                    max = charArr.length;
                }
            }
            char [] prefixs = new char[max];
            StringBuffer sb= new StringBuffer();
            sb.append("");
            while(prefixSize<max){
                for (int i=0;i<strs.length;i++){
                    char[] chars = strs[i].toCharArray();
                    if(prefixs[prefixSize]=='\u0000'){//由于 int数组的默认值是0
                        prefixs[prefixSize] = chars[prefixSize];
                    }else{
                       if(prefixs[prefixSize] == chars[prefixSize]){
                            continue;
                       }else{
                           return sb.toString();
                       }
                    }
                }
                sb.append(prefixs[prefixSize]);
                prefixSize++;
            }
            return sb.toString();
        }else{
            return "";
        }
    }

}
