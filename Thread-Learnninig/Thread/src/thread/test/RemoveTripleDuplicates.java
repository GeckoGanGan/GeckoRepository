package thread.test;

public class RemoveTripleDuplicates {
    public static void main(String[] args) {
        String input = "asfadfadfafddddaaaasdasdasddd";
        String result = removeTripleDuplicates(input);
        System.out.println(result);
    }

    public static String removeTripleDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        char prevChar = '\0'; // 用于追踪前一个字符
        int count = 0; // 用于追踪当前字符的连续出现次数

        for (char currentChar : input.toCharArray()) {
            if (currentChar == prevChar) {
                count++;
                if (count <= 2) {
                    result.append(currentChar); // 最多保留两个相同字符
                }
            } else {
                count = 1; // 重置计数器
                result.append(currentChar);
                prevChar = currentChar;
            }
        }

        return result.toString();
    }
}
