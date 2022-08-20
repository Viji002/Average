
public class EmployeeTaxProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeTaxProcessor employeeTaxProcessor = new EmployeeTaxProcessor();
		employeeTaxProcessor.employeeTax();

	}
	
	
	public void employeeTax() {
		EmpSal 	empSal1 = new EmpSal();
		empSal1.setBasicpay(7000);
		empSal1.setLevel(1);
		empSal1.setBonus(2000);
		empSal1.setBoa(5000);
		int sum1 = empSal1.getBasicpay()+empSal1.getBoa()+empSal1.getBonus();
		int yearPay1 = sum1 *12;
empSal1.setSum(yearPay1);
		EmpSal 	empSal2 = new EmpSal();
		empSal2.setBasicpay(10000);
		empSal2.setLevel(2);
		empSal2.setBonus(2500);
		empSal2.setBoa(7000);
		int sum2 = empSal2.getBasicpay()+empSal2.getBoa()+empSal2.getBonus();
		int yearPay2 = sum2 *12;
		empSal2.setSum(yearPay2);
		EmpSal 	empSal3 = new EmpSal();
		empSal3.setBasicpay(12000);
		empSal3.setLevel(3);
		empSal3.setBonus(3000);
		empSal3.setBoa(9000);
		int sum3 = empSal3.getBasicpay()+empSal3.getBoa()+empSal3.getBonus();
		int yearPay3 = sum3 *12;
		empSal3.setSum(yearPay3);
		EmpSal 	empSal4 = new EmpSal();
		empSal4.setBasicpay(15000);
		empSal4.setLevel(4);
		empSal4.setBonus(3500);
		empSal4.setBoa(10000);
		int sum4 = empSal4.getBasicpay()+empSal4.getBoa()+empSal4.getBonus();
		int yearPay4 = sum4 *12;
		empSal4.setSum(yearPay4);
		
		double emp1sal  = calculateTax(empSal1.getSum());
		System.out.println("emp 1 take home :"+ emp1sal);
		double emp2sal  = calculateTax(empSal2.getSum());
		System.out.println("emp 2 take home :"+ emp2sal);
		
//		

		
	}
	
	public double calculateTax(int sal) {
		if(sal < 250000 ) {
			return sal;
		}
		else if (sal < 500000 && sal>250000) {
			return sal*0.05;
		}else if (sal < 1000000 && sal> 500000) {
			return sal*0.2;
		}else {
			return sal*0.3;
		}
	}
}
