package com.uday.day4;

class E {

}

class F extends E {

}

class G extends F {

}

abstract class H1 extends G {

	abstract F test();
}

class I1 extends H1 {

	F test() {
		return new F();
	}

}
