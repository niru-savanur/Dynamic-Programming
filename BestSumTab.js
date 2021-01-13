const bestSumTab = (targetSum, arr) => {
    const table = Array(targetSum + 1).fill(null);

    for (let i = 0; i <= targetSum; i++) {
        if (table[i] !== null) {
            for (let num of arr) {
                const check = [...table[i], num];
                if (!table[i + num] || table[i].length > check.length)
                    table[i + num] = check;
            }
        }
    }
    return table[targetSum];
};



console.log(bestSumTab(7, [2, 3]));
console.log(bestSumTab(7, [5, 3, 4, 7]));
console.log(bestSumTab(7, [2, 4]));
console.log(bestSumTab(8, [2, 3, 5]));
console.log(bestSumTab(300, [7, 14]));