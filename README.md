## ScotlandYard Heuristic Encoder Rapidly Or Cipherer Key.
### *S.H.E.R.L.O.C.K.*

*Yes, I made up the name for fun. To the point!*

To understand all of this first we need to read **the problem**.
http://www.instantcredit.net/technical-exercise/

Owing to the fact that I have no server working in Java to made this code works
properly I make this: Firstly, a server in NodeJS that solves the
requirement asked for in the problem. Secondly, a code executable in Java that
responds in the same way. To mix both solutions we only need a Java server that,
in each request (encode and decode), it returns the solution provided by the two
functions in *cipher.java*.

You can find further explanations below:

### Front-end (Client)
#### client/index.html

We have an index.html where we can see two inputs to introduce words or code to
be ciphered. Next to them we have a button that sends the call to the server
and prints the answer in the interrogation symbol below.

### Back-end (Server)
#### server.js

We have a server.js where we can see the two functions that are called when a
client press each button.

Encode function takes each word, using a map, to transform each one in codes. It
is important to notice that it obviate the spaces.

Decode function takes the sequence of codes and tries to match a word from the
vocabulary into the first characters of the sequence. It separates each matched
word with spaces and returns it.

More information inside the files.

To see how it works you can run it from https://ide.c9.io/farv/intantserver

### JAVA
#### /java

Here we have the java code. Inside the folder **src** we can see a class cipher
and other named name:

* src/CIPHER.java contains the same functions and global variables from server.js
written in java.

* src/MAIN.java contains a function that is executed when we call it. It shows
the results of executing an example like in the server version of the solution.

For executing main.java you have to compile src code.
**javac -sourcepath src/ -d classes/ src/\***