public class Main {
	public static void main (String []args){
		Calculator cal = new Calculator();
		Operator op = new Operator();
		op.setx(4);
		op.sety(2);
		System.out.println (cal.Tambah().op.getx());
		System.out.println (cal.Kurang().op.gety());
	}
}