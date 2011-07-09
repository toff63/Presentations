require "App"
require "test/unit"

class TestApp < Test::Unit::TestCase
    
    def test_0
      assert_equal(0, FizzBuzz.new.playFizzBuzz(0))
    end
    
    def test_1
      assert_equal(1, FizzBuzz.new.playFizzBuzz(1))
    end
    
    def test_2
      assert_equal(2,FizzBuzz.new.playFizzBuzz(2))
    end
    
    def test_3
      assert_equal("Fizz",FizzBuzz.new.playFizzBuzz(3))
    end
    def test_4
      assert_equal(4, FizzBuzz.new.playFizzBuzz(4))
    end
    
    def test_5
      assert_equal("Buzz", FizzBuzz.new.playFizzBuzz(5))
    end
    
    def test_6
      assert_equal("Fizz",FizzBuzz.new.playFizzBuzz(6))
    end
    
    def test_7
      assert_equal(7,FizzBuzz.new.playFizzBuzz(7))
    end
    
    def test_8
      assert_equal(8,FizzBuzz.new.playFizzBuzz(8))
    end
    
    def test_9
      assert_equal("Fizz",FizzBuzz.new.playFizzBuzz(9))
    end
    
    def test_10
      assert_equal("Buzz",FizzBuzz.new.playFizzBuzz(10))
    end
    
    def test_11
      assert_equal(11,FizzBuzz.new.playFizzBuzz(11))
      
   end
   
   def test_12
     assert_equal("Fizz",FizzBuzz.new.playFizzBuzz(12))
   end
   
   def test_15
     assert_equal("FizzBuzz",FizzBuzz.new.playFizzBuzz(15))
     
   end
   
   def test_30
     assert_equal("FizzBuzz",FizzBuzz.new.playFizzBuzz(30))
   end
   
   def test_45
     assert_equal "FizzBuzz",FizzBuzz.new.playFizzBuzz(45), "esperando receber FizzBuzz " 
    end  
    
    def test_negativo_1
      assert_equal -1,FizzBuzz.new.playFizzBuzz(-1), "esperando receber -1"
    end
    
    
   
end
