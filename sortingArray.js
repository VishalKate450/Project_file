const arr1 = [23,12,34,54,23];
function arrSort(arr1) {
    arr1.sort((a,b)=> b-a);
    return arr1;
}
console.log(arrSort(arr1));
