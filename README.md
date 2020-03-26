# Roman Numerals

## Transformar números romanos

### Sobre
O projeto tem como objetivo converte um numero de 1 a 4999 pra numero romano.

### Pre-requisitos
* Maven
* Java 8 ou maior
### Executação
Na raiz do projeto Execute o comando

*Linux ou MacOS:*
> $ ./mvnw exec:java

*Windows*
> $ mvnw.cmd exec:java

```
 [...]
 
 [INFO] 
 [INFO] 
 [INFO] --- exec-maven-plugin:1.2.1:java (default-cli) @ romanNumerals ---
                 | _ \  ___   _ __    __ _   _ _     | \| |  _  _   _ __    ___   _ _   __ _  (_)  ___
                 |   / / _ \ | '  \  / _` | | ' \    | .` | | || | | '  \  / -_) | '_| / _` | | | (_-<
                 |_|_\ \___/ |_|_|_| \__,_| |_||_|   |_|\_|  \_,_| |_|_|_| \___| |_|   \__,_| |_| /__/
 
 Conversor de Numero Inteiros para Numero Romano.
 Informe o numero inteiro no intervalo de 1 a 4999:
```
Ao informa o número irá responder por exemplo passando o núero 200: 
```
200
O VALOR EM NUMERO ROMANO É CC
```

### Funcionamento
A classe com.ilegra.romanNumerals.service.Converter é responsavel por converter os numeros inteiros pra Romano.

A classe trabalha com a divisão decimal de cada casa e sua forma em Romano em com um switch de 0 a 9. 


### Teste unitários
*Linux ou MacOS:*
> $ ./mvnw exec:java

*Windows*
> $ mvnw.cmd test

```
[...]

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.ilegra.romanNumerals.MainTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.118 sec
Running com.ilegra.romanNumerals.service.ConverterTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.074 sec

Results :

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.153 s
[INFO] Finished at: 2020-03-26T07:29:58-03:00
[INFO] ------------------------------------------------------------------------

```