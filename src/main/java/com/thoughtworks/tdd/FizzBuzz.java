package com.thoughtworks.tdd;

public class FizzBuzz {
    public String answer(int i){
        String result = "";
        if(i%3 == 0){ result += "Fizz";}
        if(i%5 == 0){ result += "Buzz";}
        if(i%7 == 0){ result += "Whizz";}
        return result.equals("")?String.valueOf(i):result;
    }
}
