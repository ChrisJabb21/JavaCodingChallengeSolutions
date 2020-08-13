class Solution {
    public int reverse(int x) {
        //12 turn into 21
		//x is number to reverse our num input
		//Algorithm
		// initialize reverse number variable to 0 and 
		// while the number  to reverse value greater than 0 after each divison by 10
        // we reversed number * 10 added to (modulo on x) and add it to our placeholder and divide it by 10 until we get to zero.
			// if 
        int rev_n = 0; //placeholder for reverse number and to 
        while(x > 0){
            rev_n = rev_n * 10 + x % 10; //
            x = x / 10;
        }
        return rev_n;

    }
}