package com.preparing.interview_qa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/*
 * READ CSV file it as student details which has student name and student mark, sort the data based on mark in descending order and print the result
 * 
 * SAMPLE CSV CONTENTS
 * name,mark
 * john,60
 * susan,90
 * david,50
 * viera,78
 * 
 * OUTPUT
 * susan,90
 * viera,78
 * john,60
 * david,50
 */
public class CSVReader {

	public static void main(String[] args) {

		// here we can check the args should present.

		try {
			List<String> readAllLines = Files.readAllLines(Paths.get("students.csv"));
			// skipping header schema
			List<Data> dataList = readAllLines.stream().skip(1).map(data -> {
				String[] split = data.split(",");
				return new Data(split[0], Integer.parseInt(split[1]));
			}).collect(Collectors.toList());

			// sorting
			List<Data> sortData = sortData(dataList);

			System.out.println(sortData);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static List<Data> sortData(List<Data> dataList) {
		for (int i = 0; i < dataList.size(); i++) {
			for (int j = i + 1; j < dataList.size(); j++) {
				if (dataList.get(i).getMark() < dataList.get(j).getMark()) {
					// swap
					Data data = dataList.get(i);
					dataList.set(i, dataList.get(j));
					dataList.set(j, data);

				}
			}
		}
		return dataList;
	}

}
