def max_removals(main_string, substrings):
    max_count = 0  
    queue = [(main_string, 0)]  
    visited = set()  

    while queue:
        current_string, count = queue.pop(0)
        max_count = max(max_count, count)

        for substring in substrings:
            if substring in current_string:
                new_string = current_string.replace(substring, "",1)
            
                if new_string not in visited:
                    visited.add(new_string)
                    queue.append((new_string, count + 1))
                
    return max_count
n = int(input().strip())  
substrings = input().strip().split()  
main_string = input().strip()  
result = max_removals(main_string, substrings)
print(result)
