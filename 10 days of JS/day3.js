function getSecondLargest(nums) {
    nums.sort(function(a, b){return a - b});
    let i=2;
    while(nums[nums.length-i]==nums[nums.length-1]){
        i++;
    }
    return nums[nums.length-i];
}