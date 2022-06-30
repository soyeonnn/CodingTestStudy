a = {'key1' : 'value1', 'key2' : 'value2', 'key3' : 'value3'}

try:
	print(a['key4'])
except:
	print('존재하지 않는 키입니다.')