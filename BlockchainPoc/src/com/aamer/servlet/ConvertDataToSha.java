package com.aamer.servlet;

import org.apache.commons.codec.digest.DigestUtils;

public class ConvertDataToSha {

	public static void main(String[] args) {
		String input = "       Aamer    Shaikh        ";
		
		String finalOutput = input.trim().replaceAll("\\s+", "");
		System.out.println(finalOutput);
		String hash = DigestUtils.sha256Hex(input);
		System.out.println("Enrypted :"+hash);
		

	}

}
