package inheritanceassignment;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println("It is Axis Bank deposit Machine");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
	}

}
