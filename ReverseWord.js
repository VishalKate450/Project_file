const str = "This is a sunny day";
const reverseSentence = str => {
    const arr = str.split(" ");
    const reversed = arr.map(e => {
        return e.split('').reverse().join("");
    });
    return reversed.join(" ");
};
console.log(reverseSentence);
