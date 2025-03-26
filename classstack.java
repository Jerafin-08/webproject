//Stack implementation in Java
class Stack{
//Store element of Stack
private int arr[];
//represent top of the Stack
private int top;
//total capacity of the Stack
private int capacity;
//Creating a Stack
Stack(int Size){
//initialize the array
//initialize the Stack variables
arr=new int[Size];
capacity=Size;
top= -1;
}
//Push elements to the top of Stack 
public void push(int x){
if(isFull()){
System.out.println("StackOverFlow");
//terminates the program
System.exit(1);
}
//insert element on the top of Stack
System.out.println("Inserting"+x);
arr[++top]=x;
}
//pop elements from top of Stack
public int pop(){
//if stack is empty
//no elements to pop
if(isEmpty()){
System.out.println("STACK EMPTY");
//terminates the program
System.exit(1);
}
//pop elements from top of Stack
    return arr[top--];
}
//return size of the Stack
public int getSize(){
   return top+s1;
}
//check if the Stack is empty
public Boolean isEmpty(){
  return top==capacity-1;
}
//check if the Stack is full
public Boolean isFull(){
  return top==capacity-1;
}
//display elements of Stack
public void printStack(){
  for(int i=0; i<=top; i++){
   System.out.print(arr[i]+ ",");
   }
}
public static void main(String[] args){
Stack stack=new Stack(5);
stack.push(1);
stack.push(2);
stack.push(3);
System.out.print("Stack:");
stack.printStack();
//remove element from stack
stack.pop();
System.out.println("\n After popping out");
stack.printStack();
}
}


   