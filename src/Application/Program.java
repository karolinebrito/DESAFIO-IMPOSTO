package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Annual income with Salary: ");
		double annualSalary = sc.nextDouble();
		System.out.print("Annual income with service provision: ");
		double annualServices = sc.nextDouble();
		System.out.print("Annual income with capital gain: ");
		double annualCapitalGain = sc.nextDouble();
		System.out.print("Medical expenses: ");
		double annualMedicalExpenses = sc.nextDouble();
		System.out.print("Educational expenses: ");
		double annualEducationalExpenses = sc.nextDouble();
		
		System.out.println();
		System.out.println("Taxes Report: ");
		System.out.println();
		
		double salaryTax, serviceTax, capitalTax, maximumDeductible, deductibleExpenses, grossTax;
		
		System.out.print("Salary tax = ");
		if ((annualSalary/12)<=3000) {
			System.out.println(salaryTax = 0);
		}
		else if ((annualSalary/12)>3000 && (annualSalary/12)<=5000) {
			System.out.println(salaryTax = annualSalary*0.1);
		}
		else {
			System.out.println(salaryTax = annualSalary*0.2);			
		}
		
		System.out.printf("Service tax  = %.2f\n", serviceTax = annualServices*0.15);
		
		System.out.printf("Capital gain tax:  = %.2f\n", capitalTax = annualCapitalGain*0.20);
		
		System.out.println();
		System.out.println("Deduction: ");
		System.out.println();
		
		grossTax = salaryTax + serviceTax + capitalTax;
		System.out.printf("Maximum deductible = %.2f\n", maximumDeductible = 0.3*grossTax);
				
		deductibleExpenses = annualMedicalExpenses + annualEducationalExpenses;
		
		if (deductibleExpenses>(maximumDeductible)) {
			System.out.printf("Deductible Expenses = %.2f\n", deductibleExpenses = maximumDeductible);
		}
		else {
			System.out.printf("Maximum deductible = %.2f\n", deductibleExpenses);
		}		
		
		System.out.println();
		System.out.println("Resume: ");
		System.out.println();
		
		System.out.printf("Total Gross Tax = %.2f\n", grossTax);
		System.out.printf("Abatement = %.2f\n", deductibleExpenses);
		System.out.printf("Tax due = %.2f\n", grossTax-deductibleExpenses);
		
		sc.close();

	}

}
