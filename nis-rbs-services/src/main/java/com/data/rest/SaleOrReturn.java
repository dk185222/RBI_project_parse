/*
 * File Name            :    RestControler.java com.data.rest
 * Project Title        :    nis-rbs-services
 * Copyright            :    Copyright (c) 2018-2019 NCR Corporation
 * Author               :    dk185222
 * Date					:	 Aug 26, 2021
 *
 */
package com.data.rest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.data.model.root.TlogData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

/**
 * RestControler.java
 */
public class SaleOrReturn {
	public static void main(String[] args) {
		SaleOrReturn r = new SaleOrReturn();
		var cash_sale = r
				.readJsonFile("C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\1. cash_sale.txt");

		System.out.println("1. cash_sale.txt");
		System.out.println("/////////");
		r.jacksonParsser(cash_sale);

		r.gjonParsser(cash_sale);
		System.out.println("/////////");

		var debit_sale = r
				.readJsonFile("C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\2. debit_sale.txt");

		System.out.println("2. debit_sale.txt");
		System.out.println("/////////");
		r.jacksonParsser(debit_sale);

		r.gjonParsser(debit_sale);
		System.out.println("/////////");

		var multi_tender_sale = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\3. multi_tender_sale.txt");

		System.out.println("3. multi_tender_sale.txt");
		System.out.println("/////////");
		r.jacksonParsser(multi_tender_sale);

		r.gjonParsser(multi_tender_sale);
		System.out.println("/////////");

		var bottle_deposit = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\5. bottle_deposit.txt");

		System.out.println("5. bottle_deposit.txt");
		System.out.println("/////////");
		r.jacksonParsser(bottle_deposit);

		r.gjonParsser(bottle_deposit);
		System.out.println("/////////");

		var payment_at_pump = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\6. payment_at_pump.txt");

		System.out.println("6. payment_at_pump.txt");
		System.out.println("/////////");
		r.jacksonParsser(payment_at_pump);

		r.gjonParsser(payment_at_pump);
		System.out.println("/////////");

		var traninig = r
				.readJsonFile("C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\7. traninig.txt");

		System.out.println("7. traninig.txt");
		System.out.println("/////////");
		r.jacksonParsser(traninig);

		r.gjonParsser(traninig);
		System.out.println("/////////");

		var return_data = r
				.readJsonFile("C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\8. return.txt");

		System.out.println("8. return.txt");
		System.out.println("/////////");
		r.jacksonParsser(return_data);

		r.gjonParsser(return_data);
		System.out.println("/////////");

		var age_verify = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\9. Age verify 02-02-1963.txt");

		System.out.println("9. Age verify 02-02-1963.txt");
		System.out.println("/////////");
		r.jacksonParsser(age_verify);

		r.gjonParsser(age_verify);
		System.out.println("/////////");

		var age_verify_bypass = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\10. Age verify bypass.txt");

		System.out.println("10. Age verify bypass.txt");
		System.out.println("/////////");
		r.jacksonParsser(age_verify_bypass);

		r.gjonParsser(age_verify_bypass);
		System.out.println("/////////");

		var verify_cashier = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\11. Age verify-cashier under age.txt");

		System.out.println("11. Age verify-cashier under age.txt");
		System.out.println("/////////");
		r.jacksonParsser(verify_cashier);

		r.gjonParsser(verify_cashier);
		System.out.println("/////////");

		var item_not_found = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\12. Item not found 141456.txt");

		System.out.println("12. Item not found 141456.txt");
		System.out.println("/////////");
		r.jacksonParsser(item_not_found);

		r.gjonParsser(item_not_found);
		System.out.println("/////////");

		var post_price_override = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\13. post price override.txt");

		System.out.println("12. Item not found 141456.txt");
		System.out.println("/////////");
		r.jacksonParsser(post_price_override);

		r.gjonParsser(post_price_override);
		System.out.println("/////////");

		var resume_trs = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\14. resume_trs.txt");

		System.out.println("12. Item not found 141456.txt");
		System.out.println("/////////");
		r.jacksonParsser(resume_trs);

		r.gjonParsser(resume_trs);
		System.out.println("/////////");

		var return_TRS = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\15. return TRS.txt");

		System.out.println("15. return TRS.txt");
		System.out.println("/////////");
		r.jacksonParsser(return_TRS);

		r.gjonParsser(return_TRS);
		System.out.println("/////////");

		var tenderCorrection = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\1. sale_or_return\\16. tenderCorrection.txt");

		System.out.println("16. tenderCorrection.txt");
		System.out.println("/////////");
		r.jacksonParsser(tenderCorrection);

		r.gjonParsser(tenderCorrection);
		System.out.println("/////////");

	}

	/**
	 * fasterxml.jackson
	 *
	 * @param data
	 */
	private void jacksonParsser(String data) {

		long startFj = System.currentTimeMillis();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			TlogData jackson = objectMapper.readValue(data, TlogData.class);

			System.out.println("data" + jackson.getDataProviderName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		long endFj = System.currentTimeMillis();
		long elapsedTimeFj = endFj - startFj;
		System.out.println("fasterxml.jackson : " + elapsedTimeFj);

	}

	/**
	 * google Gson
	 *
	 * @param data
	 */
	private void gjonParsser(String data) {
		long startGj = System.currentTimeMillis();
		Gson gson = new Gson();
		TlogData gjonOP = gson.fromJson(data, TlogData.class);

		System.out.println("data" + gjonOP.getDataProviderName());
		long endGj = System.currentTimeMillis();
		long elapsedTimeGj = endGj - startGj;
		System.out.println("Gjson : " + elapsedTimeGj);
	}

	private String readJsonFile(String fileName) {
		StringBuilder fullData = new StringBuilder();
		try {
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				fullData.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fullData.toString();
	}
}
