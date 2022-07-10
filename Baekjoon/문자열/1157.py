import collections

string = input()
string = string.upper()
string_dict = collections.Counter(string)

string_most = string_dict.most_common(2)

if len(string_most) == 1:
    print(string_most[0][0])
elif string_most[0][1] == string_most[1][1]:
    print('?')
else:
    print(string_most[0][0])