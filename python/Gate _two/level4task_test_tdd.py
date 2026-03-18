from unittest import TestCase
from level4task import *

class Testlevel4Task(TestCase):


    def test_addition(self): 
        result = addition(6,7)
        self.assertEqual(result,13)
    
    def  test_addition_again(self):
        result = addition(3,5)
        self.assertEqual(result,8)




    def Test_that_if_the_number_is_even(self):
        result = even(6)
        self.assertEqual(result,even)

    def Test_that_if_the_number_is_even(self):
        result = even(12)
        self.assertEqual(result,even)



    def Test_that_convert_celcius_to_fahrenheit(self):
        result = fahrenheit(5/9 * 32)
        self.assertEqual(result,fahrenheit)




    def Test_that_if_the_number_is_prime(self):
        result = numberisprime(7)
        self.assertEqual(result,prime)

    def Test_that_if_the_number_is_prime(self):
        result = numberisprime(11)
        self.assertEqual(result,prime)

#    def Test_that_the_largest_of_number

