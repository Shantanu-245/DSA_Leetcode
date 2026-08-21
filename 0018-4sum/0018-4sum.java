class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {

            for (int j = i + 1; j < n - 2; j++) {

                for (int k = j + 1; k < n - 1; k++) {

                    long sum = (long) nums[i] + nums[j] + nums[k];

                    long fourth = (long) target - sum;

                    // Binary search for fourth
                    int st = k + 1;
                    int ed = n - 1;

                    while (st <= ed) {

                        int md = st + (ed - st) / 2;

                        if (nums[md] == fourth) {

                            List<Integer> curr = Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[k],
                                nums[md]
                            );

                            if (!res.contains(curr)) {
                                res.add(curr);
                            }

                            break;
                        }

                        if (nums[md] < fourth) {
                            st = md + 1;
                        } else {
                            ed = md - 1;
                        }
                    }
                }
            }
        }

        return res;
    }
}