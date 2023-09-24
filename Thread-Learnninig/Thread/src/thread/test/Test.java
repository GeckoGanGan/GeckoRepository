package thread.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param st string字符串
     * @return string字符串
     */
    public String get_substr(String st) {
        // 获取输入字符串的长度
        int length = st.length();
        
        // 创建一个字符串列表用于存储字符
        List<String> list = new ArrayList<String>();
        
        // 将输入字符串的每个字符存储到数组中
        String[] str = new String[length];
        for (int i = 0; i < length; i++) {
            str[i] = String.valueOf(st.charAt(i)); // 修复了toString方法的错误
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if ("".equals(str[i])) {
                continue;
            } else if (i < length - 2 && str[i].equals(str[i + 1]) && str[i + 1].equals(str[i + 2])) {
                // 如果当前字符与下两个字符相同，则跳过这三个字符
                str[i] = "";
                str[i + 1] = "";
                str[i + 2] = "";
                i += 2; // 跳过已处理的两个字符
            }
            result.append(str[i]);
        }

        // 判断是否还有连续三次出现的字符串
        boolean hasTripleDuplicates = false;
        for (int i = 0; i < str.length - 2; i++) {
            if (!"".equals(str[i]) && str[i].equals(str[i + 1]) && str[i + 1].equals(str[i + 2])) {
                hasTripleDuplicates = true;
                break;
            }
        }

        // 如果仍然存在连续三次出现的字符串，则递归调用函数
        if (hasTripleDuplicates) {
            return get_substr(result.toString());
        } else {
            return result.toString();
        }
    }
}
