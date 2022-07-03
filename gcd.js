function findGCD(x, y) {
  if (x < 0) {
    x = x * -1;
  }
  if (y < 0) {
    y = y * -1;
  }
  if (x == 0) return y;
  if (y == 0) return x;
  if (x == y) return x;
  if (x > y) return findGCD(x - y, y);
  return findGCD(x, y - x);
}
findGCD(5, 8);
