const bestSum = (targetSum, arr, memo = {}) => {
    if (targetSum in memo) return memo[targetSum];
    if (targetSum === 0) return [];
    if (targetSum < 0) return null;

    let bestArr = null;
    for (let num of arr) {
        const tempSum = targetSum - num;
        const curArr1 = bestSum(tempSum, arr, memo);
        if (curArr1 !== null) {
            const curArr = [...curArr1, num];

            if (bestArr === null || curArr.length < bestArr.length) {
                bestArr = curArr;
            }
        }
    }
    memo[targetSum] = bestArr;
    return bestArr;
};

console.log(bestSum(7, [5, 3, 4, 7]));
console.log(bestSum(8, [2, 3, 5]));
console.log(bestSum(8, [1, 4, 5]));
console.log(bestSum(100, [1, 2, 25, 5]));