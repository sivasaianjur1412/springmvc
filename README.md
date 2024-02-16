# Spring MVC

## BMI Calculator

### Intuition and implementation 
- Implement a `BMIController` in a Spring MVC project to process POST requests at `/user/bmi`.
- The controller will accept height in inches and weight in pounds from the request.
- It will calculate BMI using the formula: `BMI = (weight in pounds / (height in inches)^2) * 703`.
- The input JSP page will provide a form for users to enter their height and weight.
- Upon form submission, data is sent to `/user/bmi` via POST.
- The controller processes this data, calculates BMI, and prepares the result.
- Using `HttpSession` for maintaining the session for a user.
### Results
![image](https://github.com/sivasaianjur1412/springmvc/assets/156273955/1511d282-d7d7-4836-8816-82c8944c3827)


## BMI Calculator using REST controller

### Intuition and Implementation
- For creating a RESTful service to calculate BMI, we'll develop a Spring Boot application that includes a BMIRestController.
- This controller will handle POST requests to the `/bmirest` endpoint.
- Users will send their height and weight as parameters in the request body.
  
### Testing Results
![postManSnap](https://github.com/sivasaianjur1412/springmvc/assets/156273955/d8cdb921-b974-47ce-bd22-a2b13a27052a)
