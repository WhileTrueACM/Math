long inv(long x , long mod){
	    long r, y;
	    for(r = 1 , y = mod - 2 ; y != 0 ;x = x * x % mod, y>>=1)
	    	if ((y & 1) == 1)
	    		r = r * x % mod;
	    return r;
	}
