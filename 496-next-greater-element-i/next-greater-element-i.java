import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] stack = new int[nums2.length];
        int top = -1;
        int[] greater = new int[10001];
        Arrays.fill(greater, -1);
        for(int i=0; i<nums2.length; i++){
            while(top>=0 && nums2[i] > stack[top]){
                greater[stack[top]] = nums2[i];
                top--;
            }
            stack[++top] = nums2[i];
        }
        int[] answer = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            answer[i] = greater[nums1[i]];
        }
        return answer;
    }
}