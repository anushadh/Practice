package problems.contest;
import java.util.*;

//Choose best index in array and where special sum of index is maximun.
//Special sumis calculated by adding first elementto sum and then pick next two elements, then next 3,
//and continues till it is possible to pick elements.
/*class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();                 // Reading input from STDIN
        if(N >= 1 && N <= Math.pow(10,5)) {
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = s.nextInt();
            }
            TestClass testClass = new TestClass();
            System.out.println(testClass.findBestIndex(array, N));
        }
        s.close();
        
        // Write your code here

    }
    
    public long findBestIndex(int[] array, int N) {
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i < N; i++) {
        	sum = array[i];
        	int j = 2;
        	int index = i;
        	while(index+j < N) {
        		int temp = index+j;
        		while(index < temp) {
        			index++;
        			sum += array[index];
        		}
        		j++;
        	}
        	maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}*/

/*class TestClass {
    public static void main(String args[] ) throws Exception {
        
         
         Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        

        // Write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Q = s.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = s.nextInt();
        }
        TestClass testClass = new TestClass();
        for(int i = 0; i < Q; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            testClass.findNearestIndex(array, N, x, y);    
        }
        
        s.close();
    }
    
    public void findNearestIndex(int[] array, int N, int x, int y) {
    	//System.out.println(x + "---" + y);
        if(x == 1 && y < N) {
            array[y] = 1;
        }
        if(x == 0) {
            int leftIndex = -1;
            int rightIndex = -1;
            for(int i = y-1; i >=0; i--) {
            	System.out.println(i);
                if(array[i] == 1) {
                    leftIndex = i;
                    break;
                }
            }
            for(int i = y+1; i < N; i++) {
                if(array[i] == 1) {
                    rightIndex = i;
                    break;
                }
            }
            System.out.println(leftIndex + " " + rightIndex);
        }
    }
}*/




/*class TestClass {
    public static void main(String args[] ) throws Exception {
    	Scanner s = new Scanner(System.in);
    	String name = s.nextLine();
    	TestClass testClass = new TestClass();
    	testClass.findMinMoves(name);
    	
    	s.close();

    }
    
    public void findMinMoves(String name) {
    	if(name.length() >= 8 && name.length() <= Math.pow(10, 5)) {
    		String barclays = "barclays";
    		char[] barArray = barclays.toCharArray();
    		char[] nameArray = name.toCharArray();
    		int count = 8;
    		int moves = 0;
    		int[] indices = new int[8];
    		while(name.indexOf("barclays") == -1) {
    			if(moves > 8) break;
    			if(name.indexOf(barclays) == -1) {
        			barclays = barclays.substring(0, barclays.length()-1);
        			count--;
        		} else  {
        			if(name.indexOf(barclays) + count >= name.length()) {
        				barclays = barclays.substring(0, barclays.length()-1);
        				count--;
        			} else {
        				nameArray[name.indexOf(barclays) + count] = barArray[count];
            			name = String.valueOf(nameArray);
            			indices[moves] = name.indexOf(barclays) + count+1;
            			barclays = "barclays";
            			count = 8;
            			moves++;
            			
        			}
        			
        		}
    		}
    		System.out.println(moves);
    		for(int i = 0; i < moves; i++) {
    			System.out.print( indices[i] + " ");
    		}
    	}
    }
}*/


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int Q = s.nextInt();
        for(int i = 0; i < Q; i++) {
        	long l = s.nextLong();
        	if(l%2 == 0) {
        		System.out.println("A");
        	} else {
        		System.out.println("B");
        	}
        }
    }
}
