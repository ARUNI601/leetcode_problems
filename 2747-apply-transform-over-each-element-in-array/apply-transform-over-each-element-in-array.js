/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const result = [];
    const len = arr.length;

    for (let i = 0; i < len; i++) {
        result[i] = fn(arr[i], i);
    }

    return result;
};