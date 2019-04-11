package com.PintsizedSix40.pcipher;

import java.util.ArrayList;
import java.util.function.Consumer;

public class main {

	static void println(Object t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		if(args.length < 3) {
			println("ERROR: Invalid Syntax. Please use the following syntax: 'encrypt/decrypt \"Input Text\" 5'");
			System.exit(0);
		}
		if(args[args.length-3].equalsIgnoreCase("encrypt")) {
			ArrayList<String> t = new ArrayList<String>();
			String tee = args[args.length-2];
			for(int i = 0; i< tee.toCharArray().length; i++) {
				t.add(Character.toString(tee.toCharArray()[i]));
			}
			Polygon p = new Polygon(t);
			p.encrypt(Integer.parseInt(args[args.length-1]));
			String[] ci = p.get().toArray(new String[0]);
			String val = "";
			for(int i = 0; i < ci.length; i++) {
				val+=ci[i];
			}
			if(val.equals(args[args.length-2])) {
				println("WARNING: PROVIDED KEY RESULTS IN SAME VALUE. PLEASE CHOOSE A NEW KEY!");
				System.exit(0);
			}
		println(val);
		}else if(args[args.length-3].equalsIgnoreCase("decrypt")) {
			ArrayList<String> t = new ArrayList<String>();
			String tee = args[args.length-2];
			for(int i = 0; i< tee.toCharArray().length; i++) {
				t.add(Character.toString(tee.toCharArray()[i]));
			}
			Polygon p = new Polygon(t);
			p.decrypt(Integer.parseInt(args[args.length-1]));
			String[] ci = p.get().toArray(new String[0]);
			String val = "";
			for(int i = 0; i < ci.length; i++) {
				val+=ci[i];
			}
			println(val);
		}else {
			println("ERROR: Invalid Syntax. Please use the following syntax: 'encrypt/decrypt \"Input Text\" 5'");
		}
		
		
}

		
		
		}
	

	
