package com.exceptions;

import java.math.BigInteger;

public class Index_out_ouf_bound_Exception {
	
	public static void main(String[] args) {
     
            
            BigInteger bigNumber = new BigInteger("999999999999999999999999");

            
            int number = bigNumber.intValueExact(); 

        
        }
    }

