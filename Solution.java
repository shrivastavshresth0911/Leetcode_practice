package Leetcode_practice;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int[] twosum(int[] nums, int target){
        
        HashMap <Integer, Integer> maps = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(maps.containsKey(complement)){
                return new int[]{maps.get(complement), i};
            }

            maps.put(nums[i], i);
        }
        return new int[]{};
    }

        public int[] twosumOtwo(int[] nums, int target){
        for(int i = 0 ; i < nums.length; i++){
            for (int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int []{i, j};
                }
            }
        }
        return new int[]{};
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;
        //Transverse Both
        while(l1 != null || l2 != null || carry != 0){
            int x = (l1 != null) ? l1.value:0;
            int y = (l2 != null) ? l2.value:0;
            int sum = x + y + carry;
            carry = sum / 10;

            // create new node for current digit
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            //move to next node if any
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l1 = l2.next;
        }

        return dummy.next;
    }

    public static int lenghtOfLongestString(String s){
        int n = s.length();
        int left = 0, right = 0, maxlen = 0;
        HashSet<Character> set = new HashSet<>();

        while(right<n){
            char currentchar = s.charAt(right);
            if(!set.contains(currentchar)){
                set.add(currentchar);
                maxlen = Math.max(maxlen, right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
    
}