package com.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class writeToTxtFile {
	private static void writeToFile(String str) {
		try {

			FileWriter fr = new FileWriter(new File("d:\\1.txt"));

			BufferedWriter br = new BufferedWriter(fr);

			br.append(str);
			br.flush();
			br.close();
			fr.close();

		} catch (IOException e) {

			System.out.println("Wriring problem");

		}


	}
}