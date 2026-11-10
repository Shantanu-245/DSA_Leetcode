class Solution {
    public int longestBalanced(String s) {
        int n = s.length();

        int res = 0;
        for(int i = 0; i < n; i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j = i; j < n; j++){
                char currChar = s.charAt(j);
                map.put(currChar,map.getOrDefault(currChar, 0) + 1);

                boolean check = true;

                int target = map.get(currChar);

                for(char ch : map.keySet()){
                    if(target != map.get(ch)){
                        check = false;
                        break;
                    }
                }
                if(check){
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }
}