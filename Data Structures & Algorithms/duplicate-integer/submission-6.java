class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> adenine = new HashSet<>();
        for (int num : nums) {
            if (adenine.contains(num)) {
                return true;
            }
            else {
                adenine.add(num);
            }
        }
        return false;
    }
}