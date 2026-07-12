# **This project solves Task 22 EGE on Threads!**
***
***
# **Class ID**
***
## Description:

### This class reads ***.txt*** file and parse it to Map
***

## Constructors:

### public ID()
Constructor initializes:

***private final Map<Integer, Map<Integer, 
List<String>>> IDs = new HashMap<>()*** 

***private final int length***
***

## Fields:
### private final Map<Integer, Map<Integer,List<Integer>>> IDs = new HashMap<>()
Field is private, it contains parsed lines of txt file

### private final int length
Field is private, it has getter and field contains quantity
of lines in file
***

## Methods:

### public int getLength()
Method is public, it returns **private final int 
length** that contains quantity of lines in file.

### ~~public Integer getTime(int key)~~

### public int getTime(int id)
Method is public, it accepts **int id** parameter
to get time of Thread work time.

### ~~public Integer getLength()~~

### public int getNextFollowedID(int id)
Method is public, it returns **maximum** time of every followed IDs
by using stream().max(), if there are no followed IDs, method returns **0**.

### private int fill() throws FileNotFoundException
Method is private, it causes ***fill0()*** method 
returns quantity of lines in file, 
if there are **0** lines, method throws **new 
RuntimeException("Проверьте файл!\n\rКоллекции не заполнены!")**

### private int fill0() throws FileNotFoundException
Method is private, it parsing file and filling
***private final Map<Integer, Map<Integer,
List<String>>> IDs = new HashMap<>()***. 
Method returns quantity of lines in file.




