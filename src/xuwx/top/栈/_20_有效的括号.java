package xuwx.top.栈;

import java.util.HashMap;
import java.util.Stack;

/**
 * leetcode : https://leetcode-cn.com/problems/valid-parentheses/solution/
 *@ClassName_20_有效的括号
 *@Description TODO
 *@Author wx.Xu
 *Date 2019/12/12 14:57
 *Version 1.0
 */
public class _20_有效的括号 {

    private static HashMap<Character,Character> map = new HashMap<Character, Character>();
    static {
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
    }
    public boolean isValid(String s) {
        /**
         * 思考:
         * 1.是否有效 我们满足 ( 与 ) ,[],{} 匹配,其次是括号是从左来的 有右括号才有效
         * 2.右括号 按顺序闭合
         * 解题;
         * 1.利用 栈结构特点  按顺序 装入字符串中 的左括号 遇到左括号后获取栈顶来比较,是一个 闭合则 移除栈 最后栈没有元素时说明 字符串是有效的
         * 2.如果没有左括号 就是有问题
         * 3.利用 map 集合特点 更好的比较 匹配规则
         */
        Stack<Character> stack = new Stack<Character>();
        int l = s.length();
        for (int i = 0;i<l;i++){
            char c = s.charAt(i);
            if(map.keySet().contains(c)){
                stack.push(c);
            }else{//开始 右边括号的判断
                if(stack.isEmpty()){//说明 没有左括号 但是有其他字符
                    return false;
                }
                Character peekLeft = stack.peek(); //左括号 与第一次遇到的右括号来匹配
                if(c == map.get(peekLeft)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();//栈为空说明都是符合的
    }
}
