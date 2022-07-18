num = int(input())

count = 0
for hour in range(0, num+1):
    if str("3") in str(hour):
        count += 3600
        continue
    for minute in range(0, 60):
        if str("3") in str(minute):
            count += 60
            continue
        for second in range(0, 60):
            if str("3") in str(second):
                count += 1
                
print(count)