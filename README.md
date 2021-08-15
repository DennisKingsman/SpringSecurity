# Author
## DennisKingsman 
# Resources
[you-tube-guide](https://www.youtube.com/playlist?list=PLqq-6Pq4lTTYTEooakHchTGglSvkZAjnE)  
[authenticating-ldap](https://spring.io/guides/gs/authenticating-ldap/)  
[default-user-schema](https://docs.spring.io/spring-security/site/docs/current/reference/html5/#user-schema)  
[jwt.io](https://jwt.io/)  
# Process
Step 1  
Creating a first-sample project  
Use WebSecurityConfigurerAdapter and AuthenticationManagerBuilder to do a simple config and simple authentication  
Step 2  
Use HttpSecurity to manage the authorization  
Step 3  
Move to the second sample  
Try to add a schema sql  
Explore usersByUsernameQuery and authoritiesByUsernameQuery  
Step 4  
JPA authentication(skipped)  
Step 5  
add ldap dependency  
add config .ldif file and other configurations  
Step 6  
add jwt dependency  
setup JwtUtil class  
/authenticate API endpoint  
go to postman and create a `post` request to `http://localhost:8080/authenticate` with body raw
```
{
    "username": "user",
    "password": "user"
}
```
and receive smth like 
```
{
    "jwt": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNjI5MDk2OTYwLCJpYXQiOjE2MjkwNjA5NjB9.0VQGwaTJIv2_20hIVq_TnrR9EycTBHIJMY7-2izJNis"
}
```
Step 7  
Intecept all incoming requests and check their tokens by creating a filter  
Get ur new JWT  
Go to the postman and create a `get` request to `http://localhost:8080/hello`  
and add to Headers `Authorization` key with value `Bearer <ur token>` and test it  
#Issues 
can't execute the schema from doc  
Spring Boot + Spring Security with JPA authentication and MySQL from scratch video skipped  
# Recommended to study
[full-stack-secure](https://spring.io/guides/tutorials/spring-security-and-angular-js/)  
