class FizzBuzz
  
  def playFizzBuzz(number)
    if number == 0
       return number
    end
    if number % 3 ==  0 and number % 5 == 0 
      "FizzBuzz"
    elsif number % 3 == 0 
       "Fizz"
   elsif number % 5 == 0 
     "Buzz"
   else 
     number

  end
   
        
  end
  
end