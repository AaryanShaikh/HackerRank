function modifyArray(nums) {
    const num = nums.map(s => { return (s%2==0)?s*2:s*3; });
     return num;
}