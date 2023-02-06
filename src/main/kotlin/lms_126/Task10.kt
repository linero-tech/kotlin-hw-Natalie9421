package lms_126

fun task10(): String {

    return """ INPUT click create an account 
         INPUT fill first name and last name 
         INPUT fill username 
         IF username is taken 
         OUTPUT try another 
         ELSE continue 
         INPUT fill password more than six characters 
         IF password is right 
         OUTPUT continue 
         ELSE try another password 
         INPUT confirm password 
         INPUT phone number 
         INPUT verify your phone number with the verification code that you get as message text 
         INPUT recovery email address 
         INPUT birthday month, day , year 
         INPUT gender 
         INPUT accept the police 
         IF not 
         OUTPUT error 
         ELSE 
         OUTPUT new email account 
    """.trimMargin()
}
