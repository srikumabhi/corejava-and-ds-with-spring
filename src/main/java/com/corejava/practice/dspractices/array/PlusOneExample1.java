package com.corejava.practice.dspractices.array;

import java.util.Vector;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class PlusOneExample1 {

	public static void main(String[] args) {

		Vector<Integer> vect=new Vector<Integer>();
		//1789
		//vect.add(1);
		//vect.add(7);
		//vect.add(8);
		//vect.add(9);

		//124
		vect.add(1);
		vect.add(2);
		vect.add(4);

		incrementVector(vect);

		for (int i = 0; i < vect.size(); i++) {
			System.out.print(vect.get(i) + " ");
		}
	}

	// function for adding one to number
	static void incrementVector(Vector<Integer> a) {
		int n = a.size();

		// Add 1 to last digit and find carry
		a.set(n - 1, a.get(n - 1) + 1);
		int carry = a.get(n - 1) / 10;
		a.set(n - 1, a.get(n - 1) % 10);

		// Traverse from second last digit
		for (int i = n - 2; i >= 0; i--) {
			if (carry == 1) {
				a.set(i, a.get(i) + 1);
				carry = a.get(i) / 10;
				a.set(i, a.get(i) % 10);
			}
		}

		// If carry is 1, we need to add
		// a 1 at the beginning of vector
		if (carry == 1)
			a.add(0, 1);
	}

}
