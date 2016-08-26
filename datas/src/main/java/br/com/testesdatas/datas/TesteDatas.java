package br.com.testesdatas.datas;

import java.util.Calendar;

public class TesteDatas {

	public static void main(String[] args) {
		
		Calendar dataInicial = Calendar.getInstance();
		Calendar dataFinal = Calendar.getInstance();
		dataFinal.add(Calendar.DAY_OF_MONTH, 40);
		System.out.println(dataInicial.getTime());
		System.out.println(dataFinal.getTime());
		 	 	 	
		int weekend = 0;
		while (!dataInicial.after(dataFinal)) {
			if (dataInicial.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				weekend ++;
			}
			dataInicial.add(Calendar.DAY_OF_MONTH, 1);
		}
		dataFinal.add(Calendar.DAY_OF_MONTH, weekend*2);
		
		//garantindo que proximo dia util será realmente dia de semana
		while (!isDiaUtil(dataFinal))
			dataFinal.add(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println(dataFinal.getTime());
		
	}
	
	public static boolean isDiaUtil(Calendar cal) {
		return !((cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY));
	}

}
