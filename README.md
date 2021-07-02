### Java Demo
- Learn Basic of Unix/Linux
- Compiling and Exection in CLI based environment
- Ball Bounce Animation (swing and awt)
	* Package management

####  Basic Unix commands
- cd => Change Directory
- ls => List Directory
- mkdir => Create Directory
- rm => Remove (-r is recursively)
- rm -r => Delete Directory
- tree => Shows directory Structures (super useful) {if using mac do "brew install tree"}
- Use TAB for auto-completion of file path, names etc.

#### Installing Java

- A quick google search will do! 
- > ##### Installing java your_OS

#### Command Line Based Editors to use

- Vim, nano, gedit(not on MacOS)
- I personally use Vim

###### Simple Hello World program to demonstrate compiling and execution in Unix

- To compile and execute do

```bash
	javac hello.java && java hello
```
- "javac" compiles the java program
- "&&" operator works as expected if LHS is true (means there is file named hello.java to compile) then move next command (in this case that is "java hello")
- Make sure to while running "java YourFile" contains MAIN class otherwise java will throw error. (don't write name as YourFile.class)

## Snake Game

* Since not using any IDE, we will have to place packages manually and understand what's going on, how packages and import works.
