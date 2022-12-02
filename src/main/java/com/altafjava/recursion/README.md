1. What is Recursion?
   So if a function is calling itself, then it is called recursive function and there must be some base condition that will terminate recursion. Otherwise it will go away and go to infinite calling.

2. Example of recursion.

   ```java
   static void fun(int n) {
   	if (n > 0) {
   		System.out.println(n);
   		fun(n - 1);
   	}
   }

   public static void main(String[] args) {
   	int x = 3;
   	fun(x);
   }
   ```

   Output:

   ```
   3
   2
   1
   ```

      <!-- add image -->

   ```java
   static void fun(int n) {
   	if (n > 0) {
   		fun(n - 1);
   		System.out.println(n);
   	}
   }

   public static void main(String[] args) {
   	int x = 3;
   	fun(x);
   }
   ```

   Output:

   ```
   1
   2
   3
   ```

   <!-- add image -->

3. Stack used in recursion
<!-- add image -->

4. Time complexity

   ```java
     System.out.println(n);
     fun(n-1);
   ```

   Now let us see what our function is doing. This is just printing. It is printing a value and printing this value it takes one unit of time.

   How many times print was written here? Only one time. But this is a recursive function. So it is calling itself again and again so total how many times it's printing. We are passing `x=3` in the `fun(int n)` parameter and for a value 3 it is printing 3 times. Means, for value 3 it takes 3 unit if times. If we pass 5 then it will print 5 times. Means we can say it takes 5 unit of time, and so on. Hence for n number of value it will take `n` number of units and we represent them as `O(n)`.

### Types of Recursion

1. Tail Recursion: If a recursive function is calling itself and that recursive call is the last statement in a function is called Tail Recursion. Every operation is performed at calling and no operation is performed at returning time.

   ```java
   void fun(int n){
     if(n>0){
        System.out.println(n);
        fun(n-1);
     }
   }
   ```

   If the recursive was like that

   ```
   if(n>0){
      System.out.println(n);
      fun(n-1)+n;
   }
   ```

   Then this is not a Tail recursion because recursive call has not performed at returning time. It performed before returning time.

   **Comparing Tail recursion with loop:**
   Tail recursion has O(n) time complexity and O(n) space complexity because it creates n number of activation record but if we write the same program using loop it will have O(n) time complexity and O(1) space complexity because it will have only one activation record. Hence when we need to write a tail recursion then better to write a loop.

2. Head Recursion:
   Before the recursive call if there is not any statement then it is head recursion. All the operation will be performed at returning time not at calling time.

   ```java
   void fun(int n){
     if(n>0){
        fun(n-1);
        System.out.println(n);
     }
   }
   ```

   Head recursion cannot be converted to loop so easily as we see in the tail recursion.

   ```java
   static void fun(int n) {
   	int i = 1;
   	while (i <= n) {
   		System.out.println(i);
   		i++;
   	}
   }
   ```

3. Tree Recursion
   If a recursion function calling more than one time then it is recursion tree recursion.

   ```java
   static void fun(int n) {
    if (n > 0) {
      System.out.println(n);
      fun(n - 1);
      fun(n - 1);
    }
   }
   ```

4. Indirect Recursion
   If the function f1 calls another function f2 and f2 calls f1 then it is indirect recursion (mutual recursion). Means if function calls making a circular function call then it is Indirect recursion.

   ```java
   static void funA(int n) {
   	if (n > 0) {
   		System.out.println(n);
   		funB(n - 1);
   	}
   }

   static void funB(int n) {
   	if (n > 1) {
   		System.out.println(n);
   		funA(n / 2);
   	}
   }
   ```

5. Nested Recursion
   If a recursion function passing the recurive function as parameter then it is called nested recursion.

   ```java
   static int fun(int n) {
       if (n > 100) {
         return n - 10;
       } else {
         return fun(fun(n + 11));
       }
     }
   ```

  Memoization: Storing the results of the function call so that that can utilized  again when we need the same call to avoid the excessive call is nothing but memoization.
  