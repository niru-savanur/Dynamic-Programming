const howSum = (targetSum, arr, memo = {}) => {
    if (targetSum in memo) return memo[targetSum];
    if (targetSum === 0) return [];
    if (targetSum < 0) return null;

    for (let num of arr) {
        const tempSum = targetSum - num;
        const tempArr = howSum(tempSum, arr, memo);
        if (tempArr !== null) {
            memo[targetSum] = [...tempArr, num];
            return memo[targetSum];
        }
    }
    memo[targetSum] = null;
    return null;
};

console.log(howSum(7, [2, 3]));
console.log(howSum(7, [5, 3, 4, 7]));
console.log(howSum(7, [2, 4]));
console.log(howSum(8, [2, 3, 5]));
console.log(howSum(300, [7, 14]));