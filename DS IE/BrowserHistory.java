// Java implementation of browser history
// using Doubly Linked List
class Node {
    String data;
    Node prev, next;

    Node(String x) {
        data = x;
        prev = null;
        next = null;
    }
}

public class BrowserHistory {
    // Pointer to the current URL
    private Node curr;

    // Constructor to initialize with the homepage
    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }

    // Function to visit a new URL
    public void visit(String url) {
        Node urlNode = new Node(url);
        urlNode.prev = curr;
        curr.next = urlNode;
        curr = urlNode;
    }

    // Function to move back by 'step' times
    public String back(int step) {
        Node trav = curr;

        while (trav.prev != null && step > 0) {
            trav = trav.prev;
            step--;
        }

        curr = trav;
        return curr.data;
    }

    // Function to move forward by 'step' times
    public String forward(int step) {
        Node trav = curr;

        while (trav.next != null && step > 0) {
            trav = trav.next;
            step--;
        }

        curr = trav;
        return curr.data;
    }

    public static void main(String[] args) {
        String homepage = "nykaa.org";
        BrowserHistory obj = new BrowserHistory(homepage);

        String url = "instagram.com";
        obj.visit(url);

        url = "bookmyshow.com";
        obj.visit(url);

        url = "tcet.com";
        obj.visit(url);

        System.out.println(obj.back(1));
        System.out.println(obj.back(1));
        System.out.println(obj.forward(1));

        obj.visit("linkedin.com");

        System.out.println(obj.forward(2));
        System.out.println(obj.back(2));
        System.out.println(obj.back(7));
    }
}