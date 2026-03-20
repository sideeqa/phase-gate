def is_palindrome(arr):
    start = 0
    end = len(arr) - 1

    while start < end:
        if arr[start] != arr[end]:
            return False
        start += 1
        end -= 1

    return True



input_array = [4, 0, 8, 0, 45]

result = is_palindrome(input_array)

print(result)
