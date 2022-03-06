# JenLib v1.0 Documentation
## File Handling
There are two functions for opening a file, those being:<br>
>FileHandler.readLine(String filePath, int line, String extension);<br>
>FileHandler.readFile(String filePath, String extension);

Note: The filename parameter excludes the file name.<br>
To return text from a specific line, you use the readLine function.<br>
To return text from an entire file, you use the readFile function

## Language Types
There are three different language types, those being:<br>
>stackBased<br>
>variableBased<br>
>hybrid

In a stackBased language, only the builtin stacks are accessible for data storage.<br>
In a variableBased language, only the builtin variable maps are accessible for data storage.<br>
In a hybrid language, both the stack, and the variable maps are accessible for data storage.<br>
<br>
To set the language type, use the following method:
>LanguageType.setType("stackBased"/"variableBased"/"hybrid");

## Data Storage
There are four builtin primitive data types that JenLib supports, those being:
> Integers<br>
> Floats<br>
> Bytes<br>
> Strings<br>

To access the data types, you must initialize the variable maps and/or the stacks (depending on the language type)
If you have a stackBased language, use the following method:
>DataStorage.initStacks();<br>

If you have a variableBased language, use the following method:
>DataStorage.initVars();<br>

If you have a hybrid language, use both of the previous two methods.<br>

### Data Storage(Types)
Each data type has a prefix associated with it, which are added onto the front of the methods used to access data.<br>
These prefixes are:
> **i** (Integers)<br>
> **f** (Floats)<br>
> **b** (Bytes)<br>
> **s** (Strings)<br>

To access the stacks associated with each data type, simply use either of these two methods:
> **prefix**Push(**type associated with the prefix** value);<br>
> **prefix**Pop(**type associated with the prefix**);<br>

The **Pop** method returns the value of the type associated with the prefix from top of the stack associated<br>
with that prefix.<br>
<br>
To access the variable maps associated with each data type, simply use either of these two methods:
> **prefix**Save(String key, **prefix** value);<br>
> **prefix**Get(String key);<br>

The **Save** method is used to save a variable and put it into the variable map of the associated type.<br>
The **Get** method returns the value associated with the key, from the specified type.<br>

## Parsing
To initialize the parser, use the following two method(in order):
> Parsers.setContents(**insert string you want to parse here**);<br>
> Parsers.initTokenizer();

There are also currently two methods used for getting the next token, and checking if there are more tokens.<br>
Those methods are:
> Parsers.getNext();<br>
> Parsers.hasNext();<br>

The **Parsers.getNext();** method returns the next token as a String.<br>
The **Parsers.hasNext();** method returns true if there are more tokens, otherwise it returns false.<br>

## Miscellaneous methods
> Init.init(String type, String filePath, String extension)<br>

The **Init.init();** method does most of the work of loading the file you want to read and initializing the data storage.