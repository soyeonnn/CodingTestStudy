import collections

a = [1,2,3,4,5,5,5,6,6]
b = collections.Counter(a)
print(b.most_common(2))