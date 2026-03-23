def test_counteven():
    assert counteven([1, 2, 3, 4, 6]) == 3
    assert counteven([1, 3, 5]) == 0
    assert counteven([2, 4, 6, 8]) == 4
    print("counteven passed")

def test_linearsearch():
    assert linearsearch([5, 3, 7, 1], 7) == 2
    assert linearsearch([1, 2, 3], 4) == -1
    assert linearsearch([], 10) == -1
    print("linearsearch passed")

def test_square():
    assert square(5) == [1, 4, 9, 16, 25]
    assert square(1) == [1]
    assert square(0) == []
    print("square passed")

def test_array_equal():
    assert array_equal([1, 2], [1, 2]) == 2
    assert array_equal([1, 2], [2, 1]) == 0
    assert array_equal([1, 2, 3], [1, 2]) == 0
    print("array_equal passed")

def test_remove_duplicate():
    assert remove_duplicate([1, 2, 2, 3, 1]) == [1, 2, 3]
    assert remove_duplicate([5, 5, 5]) == [5]
    assert remove_duplicate([]) == []
    print("remove_duplicate passed")
