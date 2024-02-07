# Interfaces:

- All methods in the interface are by default public and abstract.
  Three types of interfaces.
  1. **Normal**
     ```java
      interface A {
          void run();
          void show();
      }
     ```
  2. **Functional Interface** (SAM) -> Single Abstract Method Interface.
     ```java
      interface B {
          void run();
      }
     ```
  3. **Marker Interface** - No Methods - Blank Interface
     Serialization and De-serialization comes into picture with Marker Interface
     to store the values of the existing object and even after it is garbaged it
     stores the object values and can de serialize to get those values back to the
     memory using this marker Interface.

# Exceptions / Errors

1.  Compile Time Errors
    - Errors that can be caught at the compile time like.
      System.out.Println Here we used "P" instead of "p" so these kind of errors comes under the compile time errors category.
2.  Runtime Errors -> Exceptions:

    - These needs to be Handled. (Exception Handling)
    - Divide by Zero is a run time exception needs to be handled inorder not to make the page break at the laod time.

3.  Logical Errors
    - Errors based on the logic when if expect one output but the received output was different.
