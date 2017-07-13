
- Input number
```
class MyInput {
    static int inputIntNumber (String message, int minValue, int maxValue) {
        
        Scanner in = new Scanner(System.in);
        
        int inputNumber = 0;
        
        boolean bDone = false;
        while (!bDone) {
            if (message != null) {
                System.out.println(message);
            }
            
            try {
                inputNumber = in.nextInt();
                if (inputNumber < minValue) {
                    System.out.println("Input number should be greater or equal to " + minValue + ".");
                } else if (inputNumber > maxValue) {
                    System.out.println("Input number should be less or equal to " + maxValue + ".");
                } else {
                    bDone = true;
                }
            } catch (Exception ex) {
                System.out.println("Invalid input!");
            }
            
            // Consume carage return.
            in.nextLine();
        }
        in.close();
        return inputNumber;
    }
}

public class HelloWorld{
    
    public static void main(String []args){
        System.out.println("Hello World");
        
        int num = MyInput.inputIntNumber ("Type a number between 0 and 100:", 0, 100);
        System.out.println("Input number is " + num + "!!!");
        System.out.println("Bye World");
    }
}
```
- String pattern search
```
public class HelloWorld
{
    public static void main(String[] args)
    {
        String testString = 
        "Pages you view in incognito tabs won’t stick around in your browser’s history, " + 
        "cookie store, or search history after you’ve closed all of your incognito tabs. " + 
        "Any files you download or bookmarks you create will be kept. However, you aren’t " + 
        "invisible. Going incognito doesn’t hide your browsing from your employer, " + 
        "your internet service provider, or the websites you visit.";
        
        MyPatternSearch myPatternSearch = new MyPatternSearch(testString);
        
        myPatternSearch.search("lee");
        myPatternSearch.search("to ta");
        myPatternSearch.search("web");
        myPatternSearch.search("in");
    }
}

public class MyPatternSearch {
    private String mString = "";
    MyPatternSearch (String strToTest) {
        mString = new String(strToTest);
    }
    
    int search(String strToSearch) {
        if (strToSearch.isEmpty()) {
            return -1;
        }
        
        int idxStartMatching = -1;
        int currentIdxToMatch = 0;
        for (int i=0; i<mString.length(); i++) {
            char chFromTargetString = mString.charAt(i);
            char chFromInputString  = strToSearch.charAt(currentIdxToMatch);
            if (chFromTargetString == chFromInputString) {
                if (idxStartMatching == -1) {
                    idxStartMatching = i;
                }
                currentIdxToMatch++;
                if (currentIdxToMatch == strToSearch.length()) {
                    break;
                }
            } else {
                currentIdxToMatch = 0;
                idxStartMatching = -1;
            }
        }
        
        int idxStartMatching2 = mString.indexOf(strToSearch);
        
        System.out.println("MySearch = " + idxStartMatching);
        System.out.println("String   = " + idxStartMatching2);
        
        return idxStartMatching;
    }
}
```
- Anonymous class
```
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Eval1 = " + HelloWorld.eval1("123.456"));
        System.out.println("Eval2 = " + HelloWorld.eval2("123.456"));
        System.out.println("Eval3 = " + HelloWorld.eval3("123.456"));
    }
    
    public static double eval1(String expression) {
        MyParser parser = new MyParser();
        return parser.parse(expression);
    }
    public static double eval2(String expression) {
        return new MyParser().parse(expression);
    }
    public static double eval3(String expression) {
        return new Object() {
            double parse(String expr) {
                return Double.valueOf(expr);
            }
        }.parse(expression);
    }
}

public class MyParser {
    double parse(String expr) {
        return Double.valueOf(expr);
    }
}
```

- Huffman coding tree
```
import java.util.Scanner;
import java.util.*;

/** Define a Huffman coding tree */
class Tree implements Comparable<Tree> {
    Node root; // The root of the tree

    /** Create a tree with two subtrees */
    public Tree(Tree t1, Tree t2) {
        root = new Node();
        root.left = t1.root;
        root.right = t2.root;
        root.weight = t1.root.weight + t2.root.weight;
    }

    /** Create a tree containing a leaf node */
    public Tree(int weight, char element) {
        root = new Node(weight, element);
    }

    @Override /** Compare trees based on their weights */
    public int compareTo(Tree t) {
        if (root.weight < t.root.weight) // Purposely reverse the order
        return 1;
        else if (root.weight == t.root.weight)
        return 0;
        else
        return -1;
    }

    public class Node {
        char element; // Stores the character for a leaf node
        int weight; // weight of the subtree rooted at this node
        Node left; // Reference to the left subtree
        Node right; // Reference to the right subtree
        String code = ""; // The code of this node from the root

        /** Create an empty node */
        public Node() {
        }

        /** Create a node with the specified weight and character */
        public Node(int weight, char element) {
            this.weight = weight;
            this.element = element;
        }
    }
}

public class HelloWorld{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        int[] counts = getCharacterFrequency(text); // Count frequency

        System.out.printf("%-15s%-15s%-15s%-15s\n",
        "ASCII Code", "Character", "Frequency", "Code");

        Tree tree = getHuffmanTree(counts); // Create a Huffman tree
        String[] codes = getCode(tree.root); // Get codes

        for (int i = 0; i < codes.length; i++)
        if (counts[i] != 0) // (char)i is not in text if counts[i] is 0
        System.out.printf("%-15d%-15s%-15d%-15s\n",
        i, (char)i + "", counts[i], codes[i]);
    }

    /** Get Huffman codes for the characters
    * This method is called once after a Huffman tree is built
    */
    public static String[] getCode(Tree.Node root) {
        if (root == null) return null;
        String[] codes = new String[2 * 128];
        assignCode(root, codes);
        return codes;
    }

    /* Recursively get codes to the leaf node */
    private static void assignCode(Tree.Node root, String[] codes) {
        if (root.left != null) {
            root.left.code = root.code + "0";
            assignCode(root.left, codes);

            root.right.code = root.code + "1";
            assignCode(root.right, codes);
        }
        else {
            codes[(int)root.element] = root.code;
        }
    }

    /** Get a Huffman tree from the codes */
    public static Tree getHuffmanTree(int[] counts) {
        // Create a heap to hold trees
        Queue<Tree> heap = new LinkedList<Tree>();

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
            heap.add(new Tree(counts[i], (char)i)); // A leaf node tree
        }

        while (heap.size() > 1) {
            Tree t1 = heap.remove(); // Remove the smallest weight tree
            Tree t2 = heap.remove(); // Remove the next smallest weight
            heap.add(new Tree(t1, t2)); // Combine two trees
        }

        return heap.remove(); // The final tree
    }

    /** Get the frequency of the characters */
    public static int[] getCharacterFrequency(String text) {
        int[] counts = new int[256]; // 256 ASCII characters

        for (int i = 0; i < text.length(); i++)
        counts[(int)text.charAt(i)]++; // Count the character in text

        return counts;
    }
}

```
