
class Node{
    Node prev,next;
    int k,v;
    Node(int k,int v){
        this.k=k;
        this.v=v;
    }
}
class LRUCache {
    private Map<Integer, Node> map;
    private int capacity;
    private Node head,tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();

        head=new Node(0,0);
        tail=new Node(0,0);
        
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))return -1;

        Node node=map.get(key);
        deleteNode(node);
        updateNode(node);

        return node.v;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.v=value;
            deleteNode(node);
            updateNode(node);
        }else{
        if(map.size()==capacity){
            map.remove(tail.prev.k);
            deleteNode(tail.prev);
        }
        Node node=new Node(key, value);
        updateNode(node);
        map.put(key,node);
        }
    }
    
    public void deleteNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void updateNode(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */



 /*My First Approach:-
 class Node{
    Node prev,next;
    int k,v;
    Node(int k,int v){
        this.k=k;
        this.v=v;
    }
}
class LRUCache {
    private Map<Integer, Node> map;
    private int capacity;
    private Node head,tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();

        head=new Node(0,0);
        tail=new Node(0,0);
        
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))return -1;

        Node node=map.get(key);
        deleteNode(node);
        updateNode(head,node);

        return node.v;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            deleteNode(map.get(key));
        }
        if(map.size()==capacity){
            map.remove(tail.prev.k);
            deleteNode(tail.prev);
        }
        Node node=new Node(key, value);
        updateNode(head, node);
        map.put(key,node);
    }
    
    public void deleteNode(Node node){
        if(node.prev!=null)
        node.prev.next=node.next;

        if(node.next!=null)
        node.next.prev=node.prev;
    }
    public void updateNode(Node head, Node node){
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headNext;
        if(headNext!=null)
        headNext.prev=node;
    }
} */