let arr1 = [1, 2, 4, 5, 8];

function binarySearch(arr, elem, start, end) {
  if (end < start) {
    return "NAN";
  }
  const middle = Math.floor((start + end) / 2);
  // console.log(middle, arr[middle]);
  if (arr[middle] === elem) {
    return middle;
  }
  if (elem < arr[middle]) {
    return binarySearch(arr1, elem, start, middle - 1);
  } else {
    return binarySearch(arr1, elem, middle + 1, end);
  }
}

console.log(binarySearch(arr1, 50, 0, arr1.length));
