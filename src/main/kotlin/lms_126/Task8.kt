package lms_126

fun task8(): String {

    return """INPUT X is number 
        INPUT Foo = x * 3 
        INPUT Bar = x * 5 
        INPUT FooBar = x * 3 * 5 
        INPUT Qix =  x not * 3 or x not * 5 
        
        
        IF x = x * 3 
        OUTPUT Foo 
        
        IF x = x * 5
        OUTPUT Bar 
         
        IF x = x * 3 * 5
        OUTPUT FooBar 
        
        IF x = not x * 3 or x = not x * 5 
        OUTPUT Qix 
        ELSE error 
        
    """.trimMargin()
}
