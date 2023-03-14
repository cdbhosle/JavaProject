package com.bikkad.GitTestBranch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitTestBranchApplication {

	@PostMapping("/purchase")
	public String purchase(@PathVariable String userName,@PathVariable double  amount,
			@PathVariable String productName)
	{
		return "HI" +userName + "order for" +productName+ "with amount" +amount + "stored successfully..!";
	}
	
	public String order(@PathVariable String userName,@PathVariable double  amount)
	{
		return "HI" +userName + "with amount" +amount ;
	
		
	}
	public void message()
	{
		System.out.println("Hello");
	}
	public void method1()
	{
		System.out.println("Welcome");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(GitTestBranchApplication.class, args);
	}

}
