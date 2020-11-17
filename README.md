[![Build Status](https://travis-ci.org/rgorenko/calculator.svg?branch=master)](https://travis-ci.org/rgorenko/calculator)

### Reverse Polish notation calculator

It's simple console calculator that support for basic arithmetic operations: +,-,*,/ for two last operands
You should press input operand or operator and press Enter.
See examples of usage below or check functional tests in folder /src/test/groovy/com/company/functional
It can be started on Windows, Linux and Mac.

##### Requirements
- Java >= 1.8
- Apache Maven ≥ 3.0.4

##### Sources
- download sources by cloning git repository<br>
```bash
git clone https://github.com//rgorenko/calculator.git
```

##### How to compile ?

```bash
mvn clean install -DskipTests
```
- skipping test during build by<br>
```bash
mvn clean install -DskipTests
```
##### How to run ?

```bash
cd ./target
java -jar calculator-1.0-SNAPSHOT.jar
```

##### How to use ?

Please input first number, press Enter, input second number and press Enter.
After that you should input one supported operation: +, -, *, /
and press Enter to receive result.
You can press 'q' to quit.

##### Examples of usage
```bash
cd ./target
java -jar calculator-1.0-SNAPSHOT.jar

```
##### How to add new operation ?
1 Implement interface Operator
2 Register new Operator in OperatorsProvider
3 Add functional test to folder src/test/groovy/com/company/functional

##### How to add new command ?
1 Implement interface Command or extend AbstractExitCommand if this command to quit application 
2 Register new Command in CommandsProvider
3 Add functional test to folder src/test/groovy/com/company/commands

##### How to add new input source ?
Implement AbstractInputSource and register implementation in InputSources class

##### Architecture design description
Main idea of design - to have ability add new Input sources, Commands and Operator.
New operators can be added in OperatorProvider. Their will be registered in OperatorsRegistry after that.
During user's input of new operation application checks that our system has support of this operation.
It provides safety - application's flow do not handle row user's input but handle strict types of operators that supported by system. 
Similar approach used for CommandsProvider and CommandsRegistry.
Memory for operands intentionally limited by two numbers.

##### Ideas for future
1 Improve function testing. Create black box container for application,  send commands to container and check result.
2 More unit tests
3 Improve Exception handling
4 Remove message after start for java >= 9
5 Use BigDecimal instead of Double
6 Better support of graceful shutdown


