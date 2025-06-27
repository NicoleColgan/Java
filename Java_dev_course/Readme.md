# Learnings from course

## Intro to Java 
- Java code we write is called source code which the computer doesnt directly understand so this is converted to a form run on the jvm.
- When java source code is compiled it's converted to java bytecode which is un by the jvm and produces the result
- int variables hold the integer value you assign to it but strings hold the address in memory of the string
- A constant value cannot be changes, use snake case and define as ```final int SOME_NUM = 150;```
- Primitive data types hold the actual value e.g. int, float, char, boolean.
- Reference type holds the address e.g. String
- Real values by default are doubles. for example "3.14" is the right size to fit in a float but by default its a double so in order to assign it to a float, we have to convert. -> ```float myFloat = 3.14    #will give error```
- two ways to type convert
     ```
    float f1 = 1.14f;
    float f2 = (float)3.14;
    ```
- type ``psvm`` then ``tab`` to write main method
- shortcut for println = ``sout + tab``
- integer division will remove the decimal part of result.. same with other operators wher your assigning result ot an int
