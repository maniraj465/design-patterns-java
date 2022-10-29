package com.practice.exceptions;

import java.io.FileNotFoundException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		try {
            throw new FileNotFoundException("bad");
        } catch(FileNotFoundException e) {
            System.out.println("Opps!");
        }

	}

}
