class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] stack = new int[temperatures.length];
        int top = -1;
        int[] answer = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            while(top >= 0 && temperatures[i]> temperatures[stack[top]]){
                int previousDay = stack[top--];
                answer[previousDay] = i - previousDay;
            }
            stack[++top] = i;
        }
        return answer;
    }
}