const allConstruct = (target, arr, memo = {}) => {
    if (target in memo) return memo[target];
    if (target === "") return [
        []
    ];

    const result = [];
    for (let prefix of arr) {
        if (target.indexOf(prefix) === 0) {
            const suffix = target.slice(prefix.length);
            const sufWays = allConstruct(suffix, arr, memo);
            const tWays = sufWays.map(way => [prefix, ...way]);
            result.push(...tWays);
        }
    }
    memo[target] = result;
    return result;
};


console.log(allConstruct("purple", ["purp", "p", "ur", "le", "purpl"]));
console.log(allConstruct("abcdef", ["ab", "abc", "cd", "def", "abcd"]));
console.log(allConstruct("skateboard", ["bo", "rd", "ate", "t", "ska", "sk", "boar"]));
console.log(allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaz", ["a", "aa", "aaa", "aaaa"]));