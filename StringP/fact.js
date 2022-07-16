// facts = [1,2,6,24,..]
//         [1,2,3,4....]
function fact(n) {
  let res = 1;
  for (let i = 1; i <= n; i++) {
    res *= i;
  }
  return res;
}

function logic() {
  console.log(fact(4) / fact(2));
}

logic();
