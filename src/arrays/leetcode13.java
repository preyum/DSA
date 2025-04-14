package arrays;

public class leetcode13 {
    public static void main(String[] args) {
        int res = romanInteger("IV");
        System.out.println(res);
    }
    static int translate(char ch){
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    static int romanInteger(String s){
        int sum = 0;
        int current = translate(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int next = translate(s.charAt(i));
            if(current < next){
                sum -= current;
            } else {
                sum += current;
            }
            current = next;
        }
        sum += current;

        return sum;
    }
}