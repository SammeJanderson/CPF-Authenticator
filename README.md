## CPF_Authenticator

### About

A java application that allow to generate and verify CPFs (Cadastro de Pessoa Física). 


## Technologies
+ java 15

## The Algorithm.

The CPF is composed by eleven integers following the mask "###.###.###-##". To validate a CPF we need to process the first nine digits and the result must match the last two digits. 

To do that first we take the first nine digits and multiply them in decreasing order from 10 to 2 and add the result.

e.g:

````
For CPF 864.704.528-92 

(8*10)+(6*9)+(4*8)+(7*7)+(0*6)+(4*5)+(5*4)+(2*3)+(8*2)
(80)+(54)+(32)+(49)+(0)+(20)+(20)+(6)+(16)

The result is:
277
````

Next we multiply the result by 10 and MOD 11, observing if the result is equal to 10 we consider it a 0;

````
(277*10)%11
9
````

Now we do the second digit adding the first one in the process and multiplying from 11.

````
(8*11)+(6*10)+(4*9)+(7*8)+(0*7)+(4*6)+(5*5)+(2*4)+(8*3)+(9*2)
(88)+(60)+(36)+(56)+(0)+(24)+(25)+(8)+(24)+(18)
339

(339*10)%11
2
````

We got the result 92 confirming that 864.704.528-92 is a valid CPF.


### The program

#### Authentication
  
  To authenticate CPF the program just follow the algorithm above on the user input.
  
#### Generation

  To generate valid CPFs the program first randomly generated 9 numbers ranging from 0 to 9. Then do the math to generate the last two digits.
  One problem with this approach is that the program can generate invalid CPF that can be validated by the algorithm  like 000.000.000-00, 111.111.111-11 etc. 
  
  The program allows the generation of multiple CPFs.
    
