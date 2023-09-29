package vo;

public class production {
	
	private Integer id;
	private Integer A;
	private Integer B;
	private Integer C;
	private Integer sum;
	
	
	public production() {
		super();
	}
	
	public production(Integer a, Integer b, Integer c) {
		super();
		A = a;
		B = b;
		C = c;
		sum=A*50+B*100+C*150;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getA() {
		return A;
	}
	public void setA(Integer a) {
		A = a;
	}
	public Integer getB() {
		return B;
	}
	public void setB(Integer b) {
		B = b;
	}
	public Integer getC() {
		return C;
	}
	public void setC(Integer c) {
		C = c;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
}
