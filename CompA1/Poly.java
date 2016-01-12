package compA1;
import java.util.Arrays;

public class Poly {

	double[] coefficients;

	public Poly() {
		coefficients = new double[1];
		coefficients[0] = 0;
	}

	public Poly(int degree) {
		coefficients = new double[degree+1];
		for (int i = 0; i <= degree; i++)
			coefficients[i] = 0;
	}

	public Poly(double[] a) {
		coefficients = new double[a.length];
		for (int i = 0; i < a.length; i++)
			coefficients[i] = a[i];
	}

	public int getDegree() {
		return coefficients.length-1;
	}

	public double getCoefficient(int i) throws Exception{
		if (i >= coefficients.length)
			throw new Exception("Bad Poly");
		return coefficients[i];
	}

	public void setCoefficient(int i, double value) {
		coefficients[i] = value;
	}

	public Poly add(Poly p) {
		int n = getDegree();
		int m = p.getDegree();
		Poly result = new Poly(Poly.max(n, m));
		int i;

		try{
			for (i = 0; i <= Poly.min(n, m); i++) 
				result.setCoefficient(i, coefficients[i] + p.getCoefficient(i));
			if (i <= n) {
				//we have to copy the remaining coefficients from this object
				for ( ; i <= n; i++) 
					result.setCoefficient(i, coefficients[i]);
			} else {
				// we have to copy the remaining coefficients from p
				for ( ; i <= m; i++) 
					result.setCoefficient(i, p.getCoefficient(i));
			}
		} catch (Exception e) {
		}
		return result;
	}

	public void displayPoly () {
		for (int i=0; i < coefficients.length; i++)
			System.out.print(" "+coefficients[i]+"*X^"+i);
		System.out.println();
	}

	private static int max (int n, int m) {
		if (n > m)
			return n;
		return m;
	}

	private static int min (int n, int m) {
		if (n > m)
			return m;
		return n;
	}

	public Poly multiply(Poly p) throws Exception{

		try{

			int pDeg=p.getDegree();
			int thisDeg=this.getDegree();

			//find the degree of the new polynomial we are creating
			int newDeg=(pDeg+thisDeg);

			//create new polynomial, using constructor method provided, with new degree
			Poly result = new Poly(newDeg);

			//now multiply and add to the right spot
			for(int i=0; i<=thisDeg+1; i++){
				int counter=i;//this just accounts for the part of the array we need to start at
				for(int j=0;j<pDeg;j++){
					double val=(this.getCoefficient(j))*(p.getCoefficient(i));
					result.coefficients[counter]=(val+result.coefficients[counter]);
					counter++;
				}
			}
			return result;

		}
		catch(NullPointerException e){
			throw new NullPointerException("Polynomial you gave is null");
		}

	}

	public void constantMult(int C) throws Exception{
		//first make constant into poly of deg 0
		Poly constant = new Poly(0);
		constant.setCoefficient(0, C);

		try{
			//there may be a problem because p might not work
			if(this==null){
				Exception e = new Exception();
			}
			this.multiply(constant);
		}
		catch(Exception e){
			System.out.println("Please enter/create a non null polynomial");
			throw e;
		}
	}

	public void zeroResize(Poly p) throws Exception{
		//this checks for leading zero's and resizes the polynomial
		int size=this.getDegree();
		try{
			//find the number of leading zero's
			int counter=0;
			for(int i=size;i>=0;i--){
				if(this.getCoefficient(i)==0){
					counter++;
				}
				else{
					//we know how many leading zero's there are
					break;
				}
			}
			//truncate our polynomial, and transform it
			Arrays.copyOfRange(coefficients, 0, ((this.getDegree()+1)-counter));

		}catch(Exception e){
			System.out.println("Bad poly");
			throw e;
		}
	}

	public static Poly derivative(Poly p) throws Exception{

		Poly derivative = new Poly(p.getDegree());


		try{
			p.zeroResize(p);
			//we just need to multiply our polynomial by a specific constant at each point, and then shift left
			for(int i=0; i<=p.getDegree()+1;i++){
				p.setCoefficient(i, (p.getCoefficient(i)*i));
			}
			//shift it left
			for(int i=0; i<p.getDegree();i++){
				p.setCoefficient(i, p.getCoefficient(+1));
			}

		}catch(Exception e){
			System.out.println("Bad poly");
			throw e;
		}
		return derivative;
	}

	public static void main(String[] args) {

		Poly test = new Poly(2);
		Poly test2 = new Poly(3);
		Poly result;

		for(int i=0;i<test.getDegree()+1;i++){
			test.setCoefficient(i, 3);
		}

		for(int i=0;i<test2.getDegree()+1;i++){
			test2.setCoefficient(i, 3);
		}


		//test.displayPoly();
		test2.displayPoly();
		test.displayPoly();
		try{

			test.displayPoly();

		}
		catch(Exception e){
			System.out.println("Please enter a valid (non-null) polynomial");


		}
	}


















}