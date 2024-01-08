package com.KoreaIT.java.JDBCAM;

import java.util.Scanner;

import com.KoreaIT.java.JDBCAM.controller.ArticleController;

public class App {
	Scanner sc = new Scanner(System.in);

	public App() {
	}

	public void run() {

		while (true) {
			System.out.print("명령어 > ");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("exit")) {
				System.out.println("==프로그램 종료==");
				break;
			}
			if (cmd.equals("article write")) {
				ArticleController.doWrite();

			} else if (cmd.equals("article list")) {
				ArticleController.showList();

			} else if (cmd.startsWith("article modify")) {
				ArticleController.doModify(cmd);

			} else if (cmd.startsWith("article delete")) {
				ArticleController.doDelete(cmd);

			} else {
				System.out.println("사용할 수 없는 명령어입니다");
			}

		}
	}

//	private static Article findById(int id) {
//		for (Article article : articles) {
//			if (article.getId() == id) {
//				return article;
//			}
//		}
//		return null;
//
//	}
}