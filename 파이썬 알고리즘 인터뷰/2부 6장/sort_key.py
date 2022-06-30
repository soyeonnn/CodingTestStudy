arr = [(1,2), (1,3), (2,1), (4,4)]

arr.sort(key = lambda arr: arr[1], reverse = True)

print(arr)