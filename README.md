Partner's Code:

//HomeController.java

import org. springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import model.addAttribute

@Controller

public class HomeController {

@RequestMapping ("/home")

public String index(){

return "home";

}

@RequestMapping ("/displaypage")

public String displaypage(){

return "displaypage";

}

}

model.addAttribute("var1, "Yes, you can!"

model.addAttribute("var2"), "Let's have fun!" 
//home.html

<!DOCTYPE html>

<head lang="en" xmlns:th="thymeleaf.org">

<meta charset= "UTF-8">

<title>Title</title>

<html>

<body>

<h1>${"var1"}</h1>

<h2>${"var2"}</h2>

</body>

</html>



//displaypage.html

<!DOCTYPE html>

<head lang="en" xmlns:th="thymeleaf.org">

<meta charset = "UTF-8">

<title>Title</title>

<html>

<body>

<p>Hello World!</p>

<p th:text="#{static.message}"></p>

<p th:text="#{static.message}"></p>

</body>

</html> 


//messageparameter

//messageparameter_hello

"Hello World"

//messageparameter_here

"Here I Come" 
