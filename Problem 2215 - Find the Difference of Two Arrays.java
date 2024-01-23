import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for(int num: nums1){
            nums1Set.add(num);
        }

        for(int num: nums2){
            nums2Set.add(num);
        }

        for(int num1: nums1Set){
            if(!nums2Set.contains(num1)){
                list1.add(num1);
            }
        }

        for(int num2: nums2Set){
            if(!nums1Set.contains(num2)){
                list2.add(num2);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);

        return answer;

    }
}