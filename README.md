# Sort Manager Project

## Table of Contents
> - [Summary](#Summary)
> - [Dependencies](#Dependencies)
> - [How to Set up the Project](#How-to-set-up-the-project)
> - [How to Use the Project](#How-to-use-the-project)
> - [Branches/Phases](#Branches/Phases)
> - [Testing and Outcome](#Testing-and-Outcome)

#Summary
> A software which allows the user to choose between ***bubble sort,
merge sort, and binary search tree*** to sort an array of integers which the 
users can decide whether to randomise or insert each value. It utilised the ***MVC*** 
and ***Factory design pattern*** to organise classes and packages. Finally, all 
user activities are logged using the ***log4j2*** property.

#Dependencies
> - ***JUnit Dependency*** (For testing model classes)
> - ***Log4j2 Dependency*** (For logging user activities)
```xml
<dependencies>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.17.1</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.2</version>
        </dependency>
    </dependencies>
```

#How to set up the project
> Download the code as a ZIP file and extract it on a directory of your choice 
and open that folder using the IDE of your choice.

![download](https://cdn.discordapp.com/attachments/881969703017386034/938889540482002944/unknown.png)

> Once opened, go to ***'pom.xml'*** file, right click and select generate
the following dependencies:

![generate](https://cdn.discordapp.com/attachments/881969703017386034/938890401828446308/unknown.png)
![dependency](https://cdn.discordapp.com/attachments/881969703017386034/938892345863209031/unknown.png)
![jupiter](https://cdn.discordapp.com/attachments/881969703017386034/938892805844107305/unknown.png)
![log4j](https://cdn.discordapp.com/attachments/881969703017386034/938893331805663342/unknown.png)

> As all of the ***dependencies*** has been added, open the ***maven*** view 
and click the refresh button.

![refresh](https://cdn.discordapp.com/attachments/881969703017386034/938893844383141938/unknown.png)

#How to use the project
> 1. Run the 'FactoryMain.java' class
> 2. Insert the desired sorter to sort the array:
'BubbleSort' | 'BS' for Bubble sort, 
'MergeSort' | 'MS' for Merge sort,
and 'BinarySearchTree' | 'BST' for Binary search tree.
> 3. Then enter either 'Random' | 'R' to randomise the array 
'Insert' | 'I' to insert the array manually.
> 4. If insert is chosen, then enter the size and the elements for the array
> 5. Results will then be printed with the chosen sorter, original array and the sorted array

Note: For all of the user inputs, the capitalisation of the letters does not matter.
Users can also exit the application by entering 'Exit'.

#Branches/Phases
> - [Phase 1 - Implementation of bubble/merge sort with Test cases](https://github.com/DalePBernardo/SortManagerProject/tree/main/src/main/java/com/spartaglobal/sortmanager/model)
> - [Phase 2 - Refactoring the project to follow the Design pattern of MVC and Factory](https://github.com/DalePBernardo/SortManagerProject/blob/main/src/main/java/com/spartaglobal/sortmanager/view/FactoryMain.java)
> - [Phase 3 - Added logs of user activities in a log file](https://github.com/DalePBernardo/SortManagerProject/blob/main/src/main/java/com/spartaglobal/sortmanager/controller/SorterController.java)
> - [Phase 4 - Algorithm time complexity calculation is added in the logs](https://github.com/DalePBernardo/SortManagerProject/blob/main/src/main/java/com/spartaglobal/sortmanager/view/SorterView.java)
> - [Phase 5 - Implementation of Binary Search Tree with Test cases](https://github.com/DalePBernardo/SortManagerProject/blob/main/src/main/java/com/spartaglobal/sortmanager/model/BinarySearchTree.java)
>> Note: For phase 5, the implementation of Binary Search Tree has an adaptor sorting method
>> in order to follow the way the other two sorting methods are called.

#Testing and Outcome
> For all of the sorting methods, I tested the following conditions:
>> - Given an array of negative numbers, sort method should return the sorted array
>> - Given an array of zero numbers, sort method is expected to return an array of zeros with the same size
>> - Given an array of both negative and positive numbers, sort method is expected to return the sorted array
>> - Given an array with no numbers, sort method is expected to return null
>> - Given an array of positive numbers, sort method is expected to return the sorted array
>> - Given a null array, sort method is expected to throw a NullPointer Exception

> Outcome:
>> All 6 test cases were passed for each sorting class, 
>> test coverage is shown below:

![bubble](https://cdn.discordapp.com/attachments/881969703017386034/938900402185850900/unknown.png)
![merge](https://cdn.discordapp.com/attachments/881969703017386034/938900796450418718/unknown.png)
![binarysearchtree](https://cdn.discordapp.com/attachments/881969703017386034/938899701556736110/unknown.png)