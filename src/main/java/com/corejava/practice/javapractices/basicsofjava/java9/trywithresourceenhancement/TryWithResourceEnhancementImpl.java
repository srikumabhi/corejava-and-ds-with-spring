package com.corejava.practice.javapractices.basicsofjava.java9.trywithresourceenhancement;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Administrator
 *
 */
@Service("trywithresourceenhancementimpl")
public class TryWithResourceEnhancementImpl {

	@Autowired
	public TryWithResourceEnhancement tryWithResourceEnhancement;

	public void tryWithResourceEnhancementImplInJava9() {

		try {
			tryWithResourceEnhancement.resourceDeclaredOutsideTheResourceBlock();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
