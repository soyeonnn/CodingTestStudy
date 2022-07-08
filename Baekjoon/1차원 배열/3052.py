import collections

arr = []

for i in range(10):
    arr.append(int(input()) % 42)

arr_dict = collections.Counter(arr)

print(len(arr_dict))