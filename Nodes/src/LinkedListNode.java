public class LinkedListNode extends LinkedList{

    private T data;
    private LinkedList<T> next;

    public LinkedListNode(Object obj) {
        super(obj);
    }


    public static <T> T LinkedListNode(data, LinkedListNode<T>next){
        this.data = data;
        this.next = next;
    }


}
