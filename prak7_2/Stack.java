package prak7_2;

public class Stack {
  
  Node top;
  int height;

  public Stack(int value) {
      Node newNode = new Node(value);
      top = newNode;
      height = 1;
  }

  public void printStack() {
      Node temp = top;
      while (temp != null) {
          System.out.print(temp.value + " ");
          temp = temp.next;
      }
      System.out.println();
  }

  public void getTop() {
      if (top == null) {
          System.out.println("Top: null");
      } else {
          System.out.println("Top: " + top.value);
      }
  }

  public void getHeight() {
      System.out.println("Height: " + height);
  }

  public void push(int value) {
      Node newNode = new Node(value);
      if(height == 0) {
          top = newNode;
      } else {
          newNode.next = top;
          top = newNode;
      }
      height++;
  }

  public Node pop() {
      if(height == 0) return null;

      Node temp = top;
      top = top.next;
      temp.next = null;

      height--;
      return temp;
  }

  public void Double() {
    int get;
    Node current = top;
    Stack temp = new Stack(0);

    while(current!=null){
      get = current.value;
      temp.push(get);
      current = current.next;
    }

    while(temp.top != null && temp.top.value != 0){
      get = temp.pop().value;
      this.push(get);
    }
  }
}