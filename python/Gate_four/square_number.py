class TestPerfectSquares(unittest.TestCase):

    def test_normal_case(self):
        self.assertEqual(
            get_perfect_squares([4, 7, 9, 10, 16, 18]),
            [4, 9, 16]
        )

    def test_empty_array(self):
        self.assertEqual(
            get_perfect_squares([]),
            [] def test_no_perfect_squares(self):
        self.assertEqual(
            get_perfect_squares([2, 3, 5, 6]),
            []
        )

    def test_all_perfect_squares(self):
        self.assertEqual(
            get_perfect_squares([1, 4, 9, 16]
