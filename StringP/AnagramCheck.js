function createHashtable(text) {
  var obj = new Object();

  Array.from(text).map((x) => {
    let item = obj[x];
    // console.log(item, x);
    obj[x] = item === null || item === undefined ? 1 : item + 1;
  });
  console.log(obj);
  return obj;
}

function compareHashTables(hash1, hash2) {
  let keys1 = Object.keys(hash1);
  let keys2 = Object.keys(hash2);

  if (keys1.length !== keys2.length) {
    return false;
  } else {
    keys1.map((x) => {
      if (hash1[x] !== hash2[x]) {
        return false;
      }
    });
    return true;
  }
}

// hash1 = createHashtable("HELLO");
hash1 = createHashtable("2ehCk");
// hash2 = createHashtable("ELLOH2");
hash2 = createHashtable("Chek2");

console.log(compareHashTables(hash1, hash2));
