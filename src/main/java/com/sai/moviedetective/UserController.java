package com.sai.moviedetective;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.*;

@RestController

@RequestMapping("/api/users")

public class UserController {

@GetMapping

public String getAllUsers() {

return "Hello, Man!";

}

}

@RestController

@RequestMapping("/user")

class greeting {

@GetMapping

public String greet() {

return "Hello SAI!";

}

}

@RestController

@RequestMapping("/search")

class fooling {

@GetMapping

public String fool (String q) {

String output_html = "<head> <link rel=\"stylesheet\" href=\"\\a.css\" /></head> <div class=\"output\"> <p style=\"font-size\": 30px;> <b> Your Movie Results are </b> </p> <ol> ";

try {

if(q.equals("")) {

return "<div> You have entered empty string </div>";

}

File myObj = new File("src\\main\\java\\com\\sai\\moviedetective\\mov.txt");

Scanner myReader = new Scanner(myObj);

while (myReader.hasNextLine()) {

String data = myReader.nextLine();

if(data.toLowerCase().contains(q.toLowerCase()))

{

output_html += "<li>" + data + "</li>";

}

}

output_html += "</ol> </div>";

myReader.close();

} catch (FileNotFoundException e) {

System.out.println("An error occurred.");

e.printStackTrace();

}

return output_html;

}

}