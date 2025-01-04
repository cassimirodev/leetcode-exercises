class Solution {
    public int romanToInt(String s) {

        Map<Character,Integer> romano = new HashMap<Character,Integer>();

        romano.put('I',1);
        romano.put('V',5);
        romano.put('X',10);
        romano.put('L',50);
        romano.put('C',100);
        romano.put('D',500);
        romano.put('M',1000);

        // IV = 4
        // IX = 9
        // XL = 40
        // XC = 90
        // CD = 400
        // CM = 900
        s=s.replace("IV", "IIII");
        s=s.replace("IX", "VIIII");
        s=s.replace("XL", "XXXX");
        s=s.replace("XC", "LXXXX");
        s=s.replace("CD", "CCCC");
        s=s.replace("CM", "DCCCC");

        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            sum = sum + (romano.get(s.charAt(i)));
        }
        return sum;
    }
}