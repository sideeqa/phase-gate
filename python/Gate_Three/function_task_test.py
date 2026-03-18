import unnitest import Testcase
from function_task import *
 

class Testfunctiontask(Testcase):


def test_letters(self): 
   expected_result = [A1a2B2c1]
    actual_result = function_task.character(AaaBBc)
    self.assertEqual(expected_result,actual_result)
    


