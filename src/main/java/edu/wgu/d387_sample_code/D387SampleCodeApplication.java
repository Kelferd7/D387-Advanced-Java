package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.controller.Timezone;
import edu.wgu.d387_sample_code.controller.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(D387SampleCodeApplication.class, args);


		WelcomeMessage displayMessageEnglish = new WelcomeMessage(Locale.US);
		WelcomeMessage displayMessageFrench = new WelcomeMessage(Locale.CANADA_FRENCH);

		Thread englishThread = new Thread(displayMessageEnglish);
		Thread frenchThread = new Thread(displayMessageFrench);

		englishThread.start();
		frenchThread.start();

		System.out.println("Testing time conversion: " + Timezone.convertTime());
	}

}
