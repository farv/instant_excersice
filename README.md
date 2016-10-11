## ScotlandYard Heuristic Encoder Rapidly Or Cipherer Key.
### *S.H.E.R.L.O.C.K.*

*Yes, I made up the name for fun. To the point!*

To understand all of this first we need to reed **the problem**.
http://www.instantcredit.net/technical-exercise/

Owing to the fact that I have no server working in Java to made this code works
properly I made this two things. First, a server in NodeJS that solve the
requirement asked for in the problem. Second, a code executable in Java that
respond in the same way. To mix both solutions we only need a Java server that,
in each request (encode and decode), it returns the solution provided by the two
functions in *cipher.java*.

All of this is widely explined below:

### Front-end (Client)
#### client/index.html

We have an index.html where we can see two inputs to introduce words or code to
be ciphered. Next to them we have a button that execute the call to the server
and print the answer in the interrogation symbol below.

### Back-end (Server)
#### server.js

We have a server.js where we can see the two functions that are called when a
client press each button.

Encode function take each word and use a map for transform it in codes. It is
important to notice that it obviate the spaces.

Decode function take the sequence of codes and tries to match a word from the
vocabulary into the first characters of the sequence. It separate each word matched
with spaces and returns it.

More information in the files.

### JAVA
#### /java

Here we have the java code. Inside the folder **src** we can see a class cipher
and other named name:

* src/CIPHER.java contains the same functions and global variables from server.js
written in java.

* src/MAIN.java contains a function that is executed when we call it. It shows
the results of executing an example like in the server version of the solution.

