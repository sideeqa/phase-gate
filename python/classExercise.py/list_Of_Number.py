import random



def getNumber():
    listOfNumbers = []
    count = 0

    while count < 10:
        choice = random.randint(2, 50)
        listOfNumbers += [choice]
        count += 1
    return listOfNumbers
print(getNumber())




def lengthOf(listOfNumbers):
    count = 0
    for value in listOfNumbers:
        count += 1
    return count



ages = [12, 45, 34, 23, 15, 17, 45, 90, 1123, 789, 5678]
print(lengthOf(ages))


    
def sumAtEvenPosition(listOfNumbers):
    sum = 0
    for index in range(1, len(listOfNumbers)+1):
        if index % 2 == 0:
            sum += listOfNumbers[index]
        
    return sum


ages = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(sumAtEvenPosition(ages))



def sumAtOddPosition(listOfNumbers):
    sum = 0
    for index in range(len(listOfNumbers)):
        if (index+1) % 2 != 0:
            sum += listOfNumbers[index]
        
    return sum


ages = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(sumAtOddPosition(ages))


def multiplyAtEveryThirdPosition(ages):

    Multiply = 0

    for index in range(len(ages)):

        if (index+1) % 2 != 0:

            Multiply += ages[index]
        
    return Multiply

print(multiplyAtEveryThirdPosition([1, 2, 3, 4, 5, 6, 7, 8, 9]))


numbers = [4, 8, 10, 6]
average = sum(numbers) / len(numbers)
print(average)

numbers = [4, 8, 10, 6]

largest = max(numbers)
print("Largest:", largest)



numbers = [4, 8, 10, 6]

smallest = min(numbers)
print("Smallest:", smallest)


words = ["aba", "xyz", "aa", "x", "bbb"]

count = 0
result = []

for word in words:
    if len(word) >= 2 and word[0] == word[-1]:
        count += 1
        result.append(word)

print("Matching strings:", result)
print("Count:", count)

numbers = list(range(1, 16))
print(numbers)

def sum_every_third(lst):
    total = 0
    for i in range(2, len(lst), 3):
        total += lst[i]
    return total


numbers = [1,2,3,4,5,6,7,8,9]
print(sum_every_third(numbers))



