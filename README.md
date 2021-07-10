### Java Demo
- Learn Basic of Unix/Linux
- Compiling and Exection in CLI based environment
- BalliSim for
	* Package management
- Making jar files
- Automating processes using makefile

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
- What to do when building a project and all is it even possible without plugins and stuff ?

## simBall

* Since not using any IDE, we will have to place packages manually and understand what's going on, how packages and import works.
* Careful while naming class and deciding thier visibility.
* imports and packages.


* what about messy class files ?
	> When on *nix do it nix-way, delete all *.class file recursively 
	 ```bash
	 find . -name "*.class" -type f -delete
	 ```

* What to do to compile your code ?
	- Do this
		```bash
			javac path/to/class_containing_main_function
		```
	- Use tab-completion for this step much easssier (avoid names like Main$1 it's for function in class)
		```bash
			java src.main.Main  
		```
* What if you don't want to share your code ?
	> Solution is to make a jar file
	> NOTE: making jar does'nt recompile your code rather it just uses existing *.class.
	```bash
	jar cvmf manifest.txt filename.jar ./src/pkg1/*.class ./src/pkg2/*.class
	```
	> what is "cvmf" ?
		>> c = create  
		>> v = verbose standard output  
		>> m = manifest file added  
		>> f = archive filename "filename.jar"  

	> what is manifest.txt ?  
		>> It contains path of main() function  
		>> Main-class: path/to/main  (it uses filename so don't append .class or .java or anything)</br>
		>> [ more ]( https://docs.oracle.com/javase/tutorial/deployment/jar/manifestindex.html ) on mainfest.txt
	
* Your don't want run this many commands again and again ? Do it in one go?
	- Create a make file.
	- Can automate all the work see makefile.


