import java.util.*;
/**
 * 
 */

/**
 * @author S544912
 *
 */
public class BobbalaAssignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem01();
		
		problem02();
		
		problem03();
		
		problem04();
		
		problem05();
		
		problem06();
		
		problem07();
		
		problem08();
		
		problem09();
		
		problem10();
		

	}
	
	private static void problem01() {

		Scanner scanner = new Scanner(System.in);
		
		// problem 01
		
		List<Integer> linkedList1 = new LinkedList<>();
		
		System.out.println("Enter the lenght of list for problem01: ");
		int LL1Length = scanner.nextInt();
		
		while(LL1Length > 0) {
			System.out.println("Enter numbers: ");
			int i = scanner.nextInt();
			linkedList1.add(i);
			LL1Length -- ;
		}
		List<Integer> linkedList2 = new LinkedList<>();
		
		Iterator<Integer> iterator = linkedList1.iterator();
		
		while(iterator.hasNext()) {
			int num = iterator.next();
			int sum = 0;
			for( int i=1; i< num; i++) {
				if(num%i == 0) {
					sum = sum + i;
				}
			}
			if( sum == num) {
				linkedList2.add(num);
			}
		}
		
		System.out.println("L2: " + linkedList2);
	}
	
private static void problem02() {
		
		Scanner scan = new Scanner(System.in);
		
		// problem 02
		
		List<Integer> linkedList1 = new LinkedList<>();
		
		System.out.println("Enter the lenght of list for problem02: ");
		int LL1Length = scan.nextInt();
		
		while(LL1Length > 0) {
			System.out.println("Enter numbers: ");
			int i = scan.nextInt();
			linkedList1.add(i);
			LL1Length --;
		}
		System.out.println("Enter the number to check sum equal to K: ");
		int j = scan.nextInt();
		List<ArrayList<Integer>> linkedList2 = new LinkedList<>();

		for (int i = 0; i < linkedList1.size() - 1; i++) {
            int currentNum = linkedList1.get(i);
            int nextNum = linkedList1.get(i+1);
           if(currentNum + nextNum == j) {
        	   ArrayList<Integer> l =  new ArrayList<>();
        	   l.add(currentNum);
        	   l.add(nextNum);
        	   linkedList2.add(l);
           }
        }
		
		System.out.println(linkedList2);
		
	}

private static void problem03() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the list for problem03: ");
		int size = scan.nextInt();
		List<Integer> list =  new ArrayList<>(size);

		for(int i=0; i <size; i++) {
			System.out.print("Enter the number: ");
			int n = scan.nextInt();
			list.add(n);
		}
		
		
		Collections.sort(list);
		
		if(list.size() == 0) {
			System.out.println(Integer.MIN_VALUE);
		} else {
			
			System.out.println(list.get(list.size()-1));
		}
		
	
}

private static void problem04() {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Problem04- Enter the size of Arraylist: ");
	int size = scanner.nextInt();
	ArrayList<String> list1 =  new ArrayList<>(size);
	ArrayList<String> list2 =  new ArrayList<>(size);
	for(int i=0; i <size; i++) {
		System.out.print("Enter string value: ");
		String x = scanner.next();
		list1.add(x);
	}
	for(String s: list1) {
		list2.add(s);
	}
	list2.sort((s1,s2) -> s1.length()-s2.length() );
	System.out.println(list2);
	
}

public static void problem05() 
{
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Problem05- Enter the expression: ");
	  String exp= scanner.next();
	  System.out.println("");
	  if (balancedExpression(exp))
         System.out.println("True ");
     else
         System.out.println("False ");
	  
}
static boolean balancedExpression(String exp1)
{
    // Using ArrayDeque is faster than using Stack class
    Deque<Character> stack = new ArrayDeque<Character>();

    // Traversing the Expression
    for (int i = 0; i < exp1.length(); i++)
    {
        char x = exp1.charAt(i);

        if (x == '(' || x == '[' || x == '{')
        {
            // Push the element in the stack
            stack.push(x);
            continue;
        }

        // If current character is not opening
        // bracket, then it must be closing. So stack
        // cannot be empty at this point.
        if (stack.isEmpty())
            return false;
        char check;
        switch (x) {
        case ')':
            check = stack.pop();
            if (check == '{' || check == '[')
                return false;
            break;

        case '}':
            check = stack.pop();
            if (check == '(' || check == '[')
                return false;
            break;

        case ']':
            check = stack.pop();
            if (check == '(' || check == '{')
                return false;
            break;
        }
    }

    return (stack.isEmpty());
}

public static void problem06()
{
	 Stack<Integer> l = new Stack<>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Problem06- Enter length of Stack");
		
		int length = scanner.nextInt() ;
		if(length%2 == 0) { 
			System.out.println("Enter "+length+ " numbers");
			for(int i=0; i<length;i++) {
				l.add(scanner.nextInt());
			}
			System.out.println("List of Integers by user : " + l);
			
			List<Integer> l1 = new ArrayList<Integer>();
			
			for(int i=length;i>length/2;i--) {
				l1.add(l.get(i-1));
			}
			for(int i=0;i<length/2;i++) {
				l1.add(l.get(i));
			}
			System.out.println("List of Integers after rearranging : " + l1);
			
		}else {
			System.out.println("Enter the even number for length of the Stack");
		}
}

public static void problem07()
{
	Queue<String> q =new LinkedList<>();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Problem07- Enter binary elements: ");
	int a = scanner.nextInt();
	System.out.println("Enter binary values:");
	for(int i=0;i<a;i++) {
		q.add(scanner.next());
		}
	System.out.println("Entered list : "+q);
	System.out.println("binary number of entered list : "+binayCalculation(q));
}
public static int binayCalculation(Queue<String> queue1) 
{	
	String s = "";
	for (String item: queue1) {
		s = s+item;
    }
	
	return Integer.parseInt(s,2);
}

public static void problem08() {
	Deque<Integer> dq = new ArrayDeque<>();
	Scanner scanner = new Scanner(System.in);
	System.out.println("problem08- Enter elements:");
	int number = scanner.nextInt();
	System.out.println("Enter "+number+" numbers");
	while(number>0) {
		dq.add(scanner.nextInt());
		number--;
	}
	System.out.println(alternativeSequence(dq));
}

private static List<Integer> alternativeSequence(Deque<Integer> dq){
	List<Integer> list = new ArrayList<>();
	while (!dq.isEmpty()) {
		list.add(dq.pollLast());
		if (!dq.isEmpty())
			list.add(dq.pollFirst());

	}
	return list;
}	

public static void problem09() 
{
	Scanner scanner = new Scanner(System.in);
	
	Queue<Integer> arrayDeque1 = new ArrayDeque<>();
	System.out.println("problem09- Enter elements:");
	int size = scanner.nextInt();
	System.out.println("Enter "+size+" numbers");
	for (int i = 0; i < size; i++) {
		int j = scanner.nextInt();
		arrayDeque1.add(j);
	}
	
	System.out.println("Input (Q): "+arrayDeque1);
	List<Integer> l = oddEven(arrayDeque1);
	System.out.println("Output (A): "+l);
}

public static List<Integer> oddEven(Queue<Integer> queue1) {
	Queue<Integer> evenList = new LinkedList<>();
	Queue<Integer> oddList = new LinkedList<>();
	while (!queue1.isEmpty()) {
		int l1 = queue1.poll();
		if (l1 % 2 == 0) {
			evenList.add(l1);
		} else {
			oddList.add(l1);
		}

	}
	
	List<Integer> arrayList = new ArrayList<>();
	while (!evenList.isEmpty() || !oddList.isEmpty()) {
		if (!evenList.isEmpty()) {
			arrayList.add(evenList.poll());
		}
		if (!oddList.isEmpty()) {
			arrayList.add(oddList.poll());
		}
	}
	return arrayList;
}

public static void  problem10() 
{
	Scanner scanner=new Scanner(System.in);
	Deque<Character> linkedList1=new LinkedList<>();
	System.out.println("problem10- Enter Total Characters: ");
	int n=scanner.nextInt();
	System.out.println("Enter the Character : ");
	for(int j=0;j<n;j++)
	{
		linkedList1.addFirst(scanner.next().charAt(0));
	}
	System.out.println("Enter total number of Binary Numbers:");
	int num=scanner.nextInt();
	int arrayl[]=new int[num];
	System.out.println("Enter Binary Numbers: ");
	for(int i=0;i<num;i++) {
		arrayl[i]=scanner.nextInt();
	}
	scanner.close();
	removeCharacter(linkedList1,arrayl);
}

public static void removeCharacter(Deque<Character> d1,int[] array) {
	
	char ch = 0;
	String s="";
	for(int i=0;i<array.length;i++)
	{
		if(array[i]==1)
		{
			ch=d1.removeLast();
		}
		if(array[i]==0)
		{
			if(ch!=0)
			{
				d1.addLast(ch);
				ch=0;
			}
			
		}
	}
	int s1=d1.size();
	for(int i=0;i<s1;i++)
	{
		s = s+d1.removeLast();
	}
	System.out.println("The output string is: "+ s);
}


}

