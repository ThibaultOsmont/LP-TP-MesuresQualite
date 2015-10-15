package checkstyle;

public class Check {

	private int _resultat;
	
    public void add(int a_number, int another) {
    	_resultat = a_number + another;
    }

    public void sub(int a_number, int another) {
    	_resultat =  a_number - another;
    }

    
    public void mul(int a_number, int a_multiplicator) throws Exception {
    	if (a_multiplicator < 0) {
    		throw new Exception();
    	}
    	else if (a_number == 0)
    		_resultat = 0;
     	else if (a_multiplicator == 0)
     		_resultat = 0;
    	else {
    	   	_resultat = 0;
    		for (int i = 0; i < a_multiplicator; i++) {
    			_resultat += a_number;
    		}
        }
    }
    
    private int facto(int N) {
    	if (N == 0) 
    		return 1;
    	else if (N == 1)
    		return 1;
    	else
    		return N * facto(N - 1);
    }
    
    public void fac(int N) throws Exception {
    	if (N < 0) 
    		throw new Exception();
    	else
    		_resultat = facto(N);
    	
    }
    
    
    public int result() {
    	return _resultat;
    }

}