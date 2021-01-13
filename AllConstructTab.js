const allConstructTab = (target, wordbank) => {
    const table = Array(target.length + 1).fill().map(() => []);
    table[0] = [];
    for (let i = 0; i < target.length; i++) {
        for (let word of wordbank) {
            if (target.slice(i, i + word.length) === word) {
                const newCombination = table[i].map(subArray => [...subArray, word]);
                table[i].push(newCombination);
            }
        }
    }
    return table[target];
};










console.log(allConstructTab("purple", ["purp", "p", "ur", "le", "purpl"]));
console.log(allConstructTab("abcdef", ["ab", "abc", "cd", "def", "abcd"]));
console.log(allConstructTab("skateboard", ["bo", "rd", "ate", "t", "ska", "sk", "boar"]));
console.log(allConstructTab("aaaaaaaaaaaaaaaaaaaaaaaaz", ["a", "aa", "aaa", "aaaa"]));