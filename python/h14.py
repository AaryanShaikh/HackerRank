from collections import deque
# first make the deque from the input
for _ in range(int(input())):  
    _, queue =input(), deque(map(int, input().split()))
    # sort the nums in deque and start reading in reversed order
    for cube in reversed(sorted(queue)):
        #pick the biggest size (because reading in reverse order ) and check whether the item on the left side or right side of the deque is equal to that, and if such a number exist pop it from the deque.
        if queue[-1] == cube: queue.pop()
        elif queue[0] == cube: queue.popleft()
        # Finally if there are no such number it means the numbers in the deque are in such a order that you can't make the pile.
        else:
            print('No')
            break
    else: print('Yes')
