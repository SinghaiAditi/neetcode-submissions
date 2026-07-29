class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i = 0; i < operations.length;i++) {
            String curr = operations[i];
            if(curr.equals("D")) {
                Integer top = s.peek();
                s.push(top*2);
            }else if(curr.equals("C")) {
                s.pop();
            }else if (curr.equals("+")) {
                Integer first = s.pop();
                Integer second = s.peek();
                Integer calc = first + second;

                s.push(first);
                s.push(calc);
            }else {
                int num = stringToInteger(curr);
                s.push(num);
            }
        }

        int ans = 0;

        while(!s.isEmpty()) {
            ans = ans + s.pop();
        }

        return ans;
    }

    public int stringToInteger(String s) {
        int num = 0;
        int i = 0;
        boolean signedNeg = false;
        if(s.charAt(0)=='-') {
            signedNeg = true;
            i = 1;
        }

        while(i < s.length()) {
            int curr = s.charAt(i)-'0';
            num = num*10+curr;
            i++;
        }

        if(signedNeg) {
            num = num * -1;
        }
        System.out.println("num: "+num);
        return num;
    }
}