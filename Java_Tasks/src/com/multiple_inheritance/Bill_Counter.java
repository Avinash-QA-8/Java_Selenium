package com.multiple_inheritance;

public class Bill_Counter implements Customer_1, Customer_2, Customer_3

{

	@Override
	public void agar_Bathi() {
		
		System.out.println(" Pooja purpose: 300/- ");
		
	}

	@Override
	public void aavin_Milk() {
		
		System.out.println(" Coffee & Tea: 230/- ");
		
	}

	@Override
	public void deepam_Oil() {
		
		System.out.println(" Lamp Litting: 799/- ");
		
	}

	@Override
	public void rice_Brand_Oil() {
		
		System.out.println(" Cooking any dishes: 450/- ");
		
	}

	@Override
	public void rose_Water() {
		
		System.out.println(" Gives a good flavor: 234/- ");
		
	}

	@Override
	public void rava_Sooji() {
		
		System.out.println(" breakfast: 499/- ");
		
	}

	@Override
	public void tooth_Paste() {
		
		System.out.println(" brushing teeth: 549/- ");
		
	}

	@Override
	public void thoor_Dhal() {
		
		System.out.println(" Sambar: 566/- ");
		
	}

	@Override
	public void cintol_Soap() {
		
		System.out.println(" bathing: 400/- ");
		
	}
	
	
	public static void main (String [] args)
	
	{
		Bill_Counter b = new Bill_Counter();
		
		b.agar_Bathi();
		b.aavin_Milk();
		b.deepam_Oil();
		b.rice_Brand_Oil();
		b.rose_Water();
		b.rava_Sooji();
		b.tooth_Paste();
		b.thoor_Dhal();
		b.cintol_Soap();
		
		
	}

	
	
	
}
