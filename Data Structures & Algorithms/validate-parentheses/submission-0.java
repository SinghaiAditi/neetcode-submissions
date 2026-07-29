class Solution {
    
    public static char openCurl = '{';
    public static char closeCurl = '}';

    public static char openSquare = '[';
    public static char closeSquare = ']';

    public static char openRound = '(';
    public static char closeRound = ')';

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if(curr == openCurl || curr == openSquare || curr == openRound) {
                stack.push(curr);
            }else if(curr == closeCurl && !stack.isEmpty() && stack.peek() == openCurl) {
                stack.pop();
            } else if(curr == closeSquare && !stack.isEmpty() && stack.peek() == openSquare) {
                stack.pop();
            } else if(curr == closeRound && !stack.isEmpty() && stack.peek() == openRound) {
                stack.pop();
            } else {
                return false;
            }
        }

        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
