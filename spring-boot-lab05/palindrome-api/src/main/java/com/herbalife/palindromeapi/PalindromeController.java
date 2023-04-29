package com.herbalife.palindromeapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {
    @GetMapping("/{testString}")
    public Boolean isPalindrome(@PathVariable("testString") String str){
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String data = buffer.toString();
        if(str.equals(data)){
            return true;
        }else{
            return false;
        }
    }

}
