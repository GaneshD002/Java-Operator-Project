import java.util.*;
class Operators
{
	static Scanner sc = new Scanner(System.in);
	static boolean val = true;
	public static void arithmeticOprator()
	{
		System.out.println("                  Arithmetic Operator             ");
		System.out.println("--------------------------------------------------");
		System.out.println(" -We use Arithmetic operators to do basic mathmatical calculation on numeriac data type. ");
		System.out.println(" -Arithmetical operator has 2 types \n 1.Additive Arithmetic Operator (+,-) \n 2.Multiplicative Arithmetic Operator (*,/,%)");
		System.out.println(" -->for perform this operation we need two operand");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter a First Value  => ");
		int a = sc.nextInt();
		System.out.print("Enter a Second Value => ");
		int b = sc.nextInt();
		System.out.println("You entered " + a + " and " + b);
		System.out.println(" Addition of       => " + a + " + " + b + " = " + (a+b));
		System.out.println(" Substraction of   => " + a + " - " + b + " = " + (a-b));
		System.out.println(" Multiplication of => " + a + " * " + b + " = " + (a*b));
		System.out.println(" Division of       => " + a + " / " + b + " = " + (a/b));
		System.out.println(" Remainder of      => " + a + " % " + b + " = " + (a%b));
	}
	public static void ternaryOperator()
	{
		System.out.println("                  Ternary Operator                ");
		System.out.println("--------------------------------------------------");
		System.out.println(" -It is use as one line replacement if-then-else statement ");
		System.out.println(" -It is the only conditional operator which takes three operand \n -It syntax is --> if ? then : else ; \n if conditon true then excute if condition false else execute. ");
		System.out.println(" -->for perform this operation we need two operand");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter a First Value  => ");
		int a = sc.nextInt();
		System.out.print("Enter a Second Value => ");
		int b = sc.nextInt();
		System.out.println("You entered " + a + " and " + b);
		System.out.println("ternary operator   => ("+ a + " > " + b +")" + " ? " + a + " : " + b + " Result => " + ((a>b)? a : b));
	}
	public static void unaryOperator()
	{
		System.out.println("                  Unary Operator                  ");
		System.out.println("--------------------------------------------------");
		System.out.println(" -The java unary operator require only one operand");
		System.out.println(" -unary operator has two types \n 1.Unary Plus(++) \n  i] Pre-Increment(++a) \n  ii] Post-Increment(a++) \n 2. Unary Minus(--) \n  i] Pre-Decrement(--a) \n  ii] Post-Decrement(a--) ");
		System.out.println(" -->for perform this operation we need one operand");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter a First Value  => ");
		int a = sc.nextInt();
		System.out.println("You entered " + a);
		System.out.println(" Pre-Increment       => " + "++" + a + " = " + (++a));
		System.out.println(" Post-Increment      => " + a + "++ " + " = " + (a++));
		System.out.println(" Value of a is       => " + a );
		System.out.println(" Pre-Decrement       => " + "--" + a + " = " + (--a));
		System.out.println(" Post-Decrement      => " + a + "-- " + " = " + (a--));
		System.out.println(" Value of a is       => " + a );
	}
	public static void logicalOperator()
	{
		System.out.println("                  Logical Operator             ");
		System.out.println("--------------------------------------------------");
		System.out.println(" -Logical operators are generally used for combining two or more relational statements. They return Boolean values");
		System.out.println(" 1.Logical AND(&&): \n  Logical AND(&&) check first condition if it is true then it checks second condition");
		System.out.println(" 2.Logical OR(||): \n  Logical OR(||) doesn't check second condition if first condition is true \n  Logical OR(||) check second condition if first condition is false");
		System.out.println(" -->for perform this operation we need some operand");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter a First Value  => ");
		int a = sc.nextInt();
		System.out.print("Enter a Second Value => ");
		int b = sc.nextInt();
		System.out.print("Enter a Third Value => ");
		int c = sc.nextInt();
		System.out.println("You entered " + a + " and " + b);
		System.out.println("(a>b && c>(++b)) => " + ("("+a+" > "+b+")"+" && "+"("+c+" >"+" ++"+b+")" + "=>") + ((a>b)&&(c>(++b))));
		System.out.println("Value of b is =" + b);
		System.out.println("(a<b || c>(++b)) => " + ("("+a+" < "+b+")"+" || "+"("+c+" >"+" ++"+b+")" + "=>") + ((a<b)||(c>(++b))));
		System.out.println("Value of b is =" + b);
		System.out.println("(a>b || c>(++b)) => " + ("("+a+" > "+b+")"+" || "+"("+c+" >"+" ++"+b+")" + "=>") + ((a>b)||(c>(++b))));
		System.out.println("Value of b is =" + b);
	}
	public static void shiftOperator()
	{
		System.out.println("                  Shift Operator                  ");
		System.out.println("--------------------------------------------------");
		System.out.println(" -These operators are used to shift the bits of the numbers from left to right or right to left depending on the type of shift operator used \n there are three tyes of shift operators");
		System.out.println(" 1.Left Shift(<<) (left <------ right) : \n  Left Shift operator is use to shift all the bits in a value to left side of a specific number of times");
		System.out.println(" 2.Right Shift(>>) (left -----> right) : \n  Right Shift operator is use to shift all the bits in a value to right side of specific number of times");
		System.out.println(" 3.Unsigned Right Shift(>>>) : \n  It is same like right shift but when it move bits right side that time signed bit was filled with 0s");
		System.out.println(" -->for perform this operation we need some operand");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter a Value  => ");
		int a = sc.nextInt();
		System.out.print("Enter a  shifting value => ");
		int b = sc.nextInt();
		System.out.println("You entered " + a + " and " + b);
		System.out.println(a + " << " + b + " => " + a + " * " + "2^" + b + " => " + a + " * " + Math.pow(2, b) + " => " + (a<<b));
		System.out.println(a + " >> " + b + " => " + a + " / " + "2^" + b + " => " + a + " / " + Math.pow(2, b) + " => " + (a>>b));
		System.out.println(a + " >>> " + b + " => " + a + " / " + "2^" + b + " => " + a + " / " + Math.pow(2, b) + " => " + (a>>>b));
	}
	public static void bitwiseOperator()
	{
		
		System.out.println("                  Bitwise Operator             ");
		System.out.println("--------------------------------------------------");
		System.out.println(" -Bitwise operators are used to performing the manipulation of individual bits of a number. They can be used with any integral type (char, short, int, etc.).");
		System.out.println(" 1.Bitwise AND(&): \n  Bitwise AND(&) check both conditions");
		System.out.println(" 2.Bitwise OR(|): \n  Bitwise OR(|) always check both conditions wheather first condition is true or false");
		System.out.println(" -->for perform this operation we need some operand");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter a First Value  => ");
		int a = sc.nextInt();
		System.out.print("Enter a Second Value => ");
		int b = sc.nextInt();
		System.out.print("Enter a Third Value => ");
		int c = sc.nextInt();
		System.out.println("You entered " + a + " and " + b);
		System.out.println("(a>b & c>(++b)) => " + ("("+a+" > "+b+")"+" & "+"("+c+" >"+" ++"+b+")" + "=>") + ((a>b)&(c>(++b))));
		System.out.println("Value of b is =" + b);
		System.out.println("(a<b & c>(++b)) => " + ("("+a+" < "+b+")"+" & "+"("+c+" >"+" ++"+b+")" + "=>") + ((a<b)&(c>(++b))));
		System.out.println("Value of b is =" + b);
		System.out.println("(a<b | c>(++b)) => " + ("("+a+" < "+b+")"+" | "+"("+c+" >"+" ++"+b+")" + "=>") + ((a<b)|(c>(++b))));
		System.out.println("Value of b is =" + b);
		System.out.println("(a>b | c>(++b)) => " + ("("+a+" > "+b+")"+" | "+"("+c+" >"+" ++"+b+")" + "=>") + ((a>b)|(c>(++b))));
		System.out.println("Value of b is =" + b);
	}
	public static void assignmentOperator()
	{
		System.out.println("                  Assignment Operator             ");
		System.out.println("--------------------------------------------------");
		System.out.println(" -Assignment Operators are use to assign a value to variables");
		System.out.println(" -->for perform this operation we need some operand");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter a First Value  => ");
		int a = sc.nextInt();
		System.out.print("Enter a Second Value => ");
		int b = sc.nextInt();
		System.out.println("You entered " + a + " and " + b);
		System.out.println(a + " += " + b + " => " + a + " = " + a + " + " + b + " => " + (a+=b));
		System.out.println("Value of a is " + a);
		System.out.println(a + " -= " + b + " => " + a + " = " + a + " - " + b + " => " + (a-=b));
		System.out.println("Value of a is " + a);
		System.out.println(a + " *= " + b + " => " + a + " = " + a + " * " + b + " => " + (a*=b));
		System.out.println("Value of a is " + a);
		System.out.println(a + " /= " + b + " => " + a + " = " + a + " / " + b + " => " + (a/=b));
		System.out.println("Value of a is " + a);
		System.out.println(a + " %= " + b + " => " + a + " = " + a + " % " + b + " => " + (a%=b));
		System.out.println("Value of a is " + a);
	}
	public static void relationalOperator()
	{
		System.out.println("               Relational/Comparision Operators   ");
		System.out.println("--------------------------------------------------");
		System.out.println(" -These operators can be used to compare two values and return a boolean value.");
		System.out.println(" -->for perform this operation we need two operand");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter a First Value  => ");
		int a = sc.nextInt();
		System.out.print("Enter a Second Value => ");
		int b = sc.nextInt();
		System.out.println("You entered " + a + " and " + b);
		System.out.println("Equal to              => " + a + " == " + b + " => " + (a==b));
		System.out.println("Not Equal to          => " + a + " != " + b + " => " + (a!=b));
		System.out.println("Greater than          => " + a + " > " + b + " => " + (a>b));
		System.out.println("Greater than Equal to => " + a + " >= " + b + " => " + (a>=b));
		System.out.println("Less than             => " + a + " < " + b + " => " + (a<b));
		System.out.println("Less than Equal to    => " + a + " <= " + b + " => " + (a<=b));
	}
	public static void name()
	{
			System.out.println("--------------------------------------------------");
			System.out.print("Please choose number from above index => ");
			int y = sc.nextInt();
			System.out.println("--------------------------------------------------");
			switch(y)
			{
				case 1:
					arithmeticOprator();
				break;
				case 2:
					ternaryOperator();
				break;
				case 3:
					unaryOperator();
				break;
				case 4:
					logicalOperator();
				break;
				case 5:
					shiftOperator();
				break;
				case 6:
					bitwiseOperator();
				break;
				case 7:
					assignmentOperator();
				break;
				case 8:
					relationalOperator();
				break;
				case 9:
					val = false;
				break;
				default:
					System.out.println("Invalid Choise!!! please read above instruction and enter correct option**");
			}
	}
	public static void main(String args[])
	{
		System.out.println("--------------------------------------------------");
		System.out.print(" Enter your name => ");
		String name = sc.next();
		System.out.println(" Welcome " + name + " please read the below instruction and enjoy the operators!!!!");
		System.out.println("--------------------------------------------------");
		System.out.println("                     Operators                    ");
		System.out.println(" -Operators are symbol that perform operations   ");
		System.out.println(" -There are 8 types of operartor in java ATULS BAR");
		System.out.println("--------------------------------------------------");
		System.out.println(" 1.Arithmetic Operator \n 2.Ternary Operator \n 3.Unary Operator \n 4.Logical Operator \n 5.Shift Operator \n 6.Bitwise Operator \n 7.Assignment Operator \n 8.Relational/Comparision Operartor \n 9.End the game");
		System.out.println("Lets start a game for starting game enter 0 !!!");
		int x = sc.nextInt();
		while(val)
		{
			switch(x)
			{
				case 0:
					name();
				break;
				default:
					System.out.println("Enter 0 only");
				break;
			}
		}
		
			
	}
}