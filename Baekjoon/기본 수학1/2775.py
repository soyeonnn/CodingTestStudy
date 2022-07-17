num = int(input())

for i in range(num):
    floor = int(input())
    room_num = int(input())
    
    arr = [[0 for a in range(room_num)] for b in range(floor + 1)]

    for j in range(floor + 1):
        arr[j][0] = 1
    
    for k in range(room_num):
        arr[0][k] = k+1
    
    for j in range(1, floor + 1):
        for k in range(1, room_num):
            arr[j][k] = arr[j-1][k] + arr[j][k-1]
    
    print(arr[floor][room_num-1])