/*
 * File Name            :    CouponsDiscountsPromos.java com.data.rest
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
 * CouponsDiscountsPromos.java
 */
public class CouponsDiscountsPromos {
	public static void main(String[] args) {
		CouponsDiscountsPromos r = new CouponsDiscountsPromos();
		var coupon = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\2. coupons_discounts_promos\\1. coupon.txt");

		System.out.println("1. coupon.txt");
		System.out.println("/////////");
		r.jacksonParsser(coupon);

		r.gjonParsser(coupon);
		System.out.println("/////////");

		var databar_coupon = r.readJsonFile(
				"C:\\Ncr Stuff\\RBS project\\Transaction examples\\2. coupons_discounts_promos\\2. databar_coupon.txt");

		System.out.println("2. databar_coupon");
		System.out.println("/////////");
		r.jacksonParsser(databar_coupon);

		r.gjonParsser(databar_coupon);
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
