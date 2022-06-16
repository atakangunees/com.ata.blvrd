package com.ata.blvrd.baslangic;

public class Zaman {

	 int saat;
	 int dakika;
	 int saniye;
	 
	
	void saatiGöster() {
		
		System.out.println( saat + ":" +  dakika + ":" +  saniye);
	}
	
	public   Zaman(int saat, int dakika, int saniye) {
		
		if(saat >= 0 && saat <24) {
			
			this.saat= saat;
			
		}if (dakika >= 0 && dakika < 60) {
			
			this.dakika = dakika;
			
		}if(saniye >= 0 && saniye < 60) {
			
			this.saniye= saniye;
			
		}
			
		
		}
		
		void ilerle() {
			
			saniye++;
			
		if(saniye == 60) {
			
			saniye=0;
			dakika++;
			
		}if(dakika == 60) {
			
			dakika = 0;
			saat++;
			
		}if(saat == 24) {
			saat = 0;
		}
		
	}
	
	void ilerle(int saniye) {
		 for(int i = 0; i <= saniye; i++) {
			 ilerle();
		 }
		
		
	}
	
	
	
	
	
	
	
	
	
}
