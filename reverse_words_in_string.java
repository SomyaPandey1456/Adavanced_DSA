class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+"); // split by multiple spaces
        Stack<String> stack = new Stack<>();
        
        for (String word : parts) {
            stack.push(word);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) sb.append(" ");
        }
        
        return sb.toString();
    }
}