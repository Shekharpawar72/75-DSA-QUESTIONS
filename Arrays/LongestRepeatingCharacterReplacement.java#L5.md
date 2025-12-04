🧠 Algorithm (Step-by-Step Logic)
ALGORITHM

Create array count[26] to track character frequencies.

Initialize:

left = 0

maxCount = 0

result = 0

Loop right from 0 → n-1:

Add s[right] to count

Update maxCount

Check if window is valid:

windowLength = right - left + 1

If (windowLength - maxCount) > k:

shrink window from left (move left pointer)

Update maximum answer:

result = max(result, windowLength)

After loop ends, return result.

📝 Pseudo-code (Easy to understand)
Initialize count[26] = 0
left = 0
maxCount = 0
result = 0

for right = 0 to n-1:
    add s[right] to count
    update maxCount

    while (window size - maxCount) > k:
        remove s[left] from count
        left++

    update result = max(result, window size)

return result