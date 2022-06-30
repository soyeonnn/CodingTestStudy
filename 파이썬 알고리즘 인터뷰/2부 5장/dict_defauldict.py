import collections

a = collections.defaultdict(int)
a['A'] = 5
a['B'] = 4
print(a)
a['C'] += 1
print(a)