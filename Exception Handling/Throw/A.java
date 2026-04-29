package com.Throw;

public class A {
public void m1() {
	int a=2;
	int b=0;
	if(b==0) {
		throw new CustomeException("/ 0  is not possible");
	}
	System.out.println(a/b);

}
}
