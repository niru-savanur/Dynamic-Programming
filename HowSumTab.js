const howSumTab = (targerSum, arr) => {
    const table = Array(targerSum + 1).fill(null);
    table[0] = [];
    for (let i = 0; i <= targerSum; i++) {
        if (table[i] !== null) {
            for (let num of arr) {
                table[i + num] = [...table[i], num];
            }
        }
    }
    return table[targerSum];
};

console.log(howSumTab(7, [2, 3]));
console.log(howSumTab(7, [5, 3, 4, 7]));
console.log(howSumTab(7, [2, 4]));
console.log(howSumTab(8, [2, 3, 5]));
console.log(howSumTab(300, [7, 14]));