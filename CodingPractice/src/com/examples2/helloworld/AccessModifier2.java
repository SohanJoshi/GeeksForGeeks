package com.examples2.helloworld;

import com.examples.helloworld.AccessModifier1;

public class AccessModifier2 {

	AccessModifier1 mod ;
	AccessModifier3 mod2 ;
	
	public AccessModifier2() {
//		mod.i = 0;
//		mod.j = 1;
//		mod.k = 2;
		mod.l = 3;
		
//		mod2.k = 4;
		mod2.l = 5;
	}
	
}

class AccessModifier3 extends AccessModifier1
{
//	protected int k;
	public AccessModifier3() {
//		i = 0;
//		j = 1;
		k = 2;
		l = 3;
	}
}
