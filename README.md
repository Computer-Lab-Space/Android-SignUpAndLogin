# SignUp and SignIn Application

#### Clone the project

```sh
https://github.com/Computer-Lab-Space/Android-SignUpAndLogin.git
```

#### Implementation Video Link
> [SignUp and SignIn - UI Design](https://youtu.be/TUcWzaAIGGs)
>
> [SignUp and SignIn - Backend Operation | SignUp](https://youtu.be/K-utbXG7LSk)
>
> [SignUp and SignIn - Backend Operation | Login](https://youtu.be/7vu97hx4C6g)
>
> Please do Share, Like, Subscribe and support us, finally hit the bell icon.

#### Requirement
Create a SIGN Up activity with Username and Password. Validation of password should happen
based on the following rules:
- Password should contain uppercase and lowercase letters.
- Password should contain letters and numbers.
- Password should contain special characters.
- Minimum length of the password (the default value is 8)

On successful SIGN UP proceed to the next Login activity. Here the user should SIGN IN using
the Username and Password created during signup activity. If the Username and Password are
matched then navigate to the next activity which displays a message saying “Successful Login”
or else display a toast message saying “Login Failed”. The user is given only two attempts and
after that display a toast message saying “Failed Login Attempts” and disable the SIGN IN button.
Use Bundle to transfer information from one activity to another.

[SignUp and SignIn Wiremock](https://github.com/Computer-Lab-Space/Android-SignUpAndLogin/blob/develop/app/src/main/res/drawable/SignUp_SignIn_requirement.png)
