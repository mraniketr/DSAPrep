/*

a1=[1,2,4,5,7]
a2=[2,6,8,9]
k=5

compare cuuent in both
increase idx for the one which is added
*/

function findIDX(a1, a2, k) {
  let i = 0;
  let j = 0;
  let increment = true;
  if (k > a1.length + a2.length) {
    return "INVALID IDX";
  }
  if (a1.length > a2.length) {
    let temp = a2;
    a2 = a1;
    a1 = temp;
  }

  while (increment) {
    let val;
    if (a1[i] < a2[j]) {
      val = a1[i];
      i++;
    } else {
      val = a2[j];
      j++;
    }
    if (i + j === k) {
      return val;
    } else {
      increment = true;
    }
  }
}

let a1 = [2, 6, 8, 9];
let a2 = [1, 2, 4, 5, 7, 11];

let k = 5;

console.log(findIDX(a2, a1, k));
