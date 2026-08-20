class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']','[');
        map.put('}','{');


        for(char chr: s.toCharArray()){
            if(map.containsKey(chr)){
                if(!stack.isEmpty() && stack.peek() == map.get(chr)){
                    stack.pop();
                } 
                else{
                    return false;
                }
            }else{
                stack.push(chr);
            }
        }
        return stack.isEmpty();
    }
}
