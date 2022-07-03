def whatFlavors(cost, money):
    hT = {}
    for i, x in enumerate(cost, 0):
        if money - x in hT:
            res = hT[money - x] + 1
            print(i + 1, res) if (res > i) else print(res, i + 1)
        else:
            hT[x] = i


whatFlavors([1, 4, 5, 3, 2], 4)
# whatFlavors([2, 2, 4, 3], 4)
