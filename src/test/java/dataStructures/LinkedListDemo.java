package dataStructures;

 class LinkedListDemo {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        public int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    public LinkedListDemo(int value){
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    /*
    * This method wil print the linkedlist */
    public void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void getHead(){
        System.out.println("The head is - "+head.value);
    }
    public void getTail(){
        System.out.println("The tail is - "+tail.value);
    }
    public void getLength(){
        System.out.println("The length is - "+length);
    }

    /*
    * This method will add an element in the linkedlist*/
    public void apppend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length==0)return null;
        Node temp = head;
        Node pre = head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0 ){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0 )return null;
        Node temp = head;
        head = temp.next;
        temp.next=null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(length <0 || length > length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public boolean set(int index , int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index<0 || index > length) return false;
        if(index==0){
            prepend(value);
            return true;
        }
        if(index == length)
        {
            apppend(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
    }
    public Node remove(int index){
        if(index<0 || index>length) return null;
        if(index == 0) return removeFirst();
        if(index==length) return removeLast();
        Node prev = get(index-1);
        Node temp=prev.next;
        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        //switched the head to tail and tail to head
        Node after = temp.next;
        Node before = null;
        for(int i =0 ; i <length ; i++){
            after=temp.next;
            temp.next=before;
            //changed the direction of to before
            before=temp;
            temp=after;
        }
    }


}
