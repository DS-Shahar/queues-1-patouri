class Main {
  public static void main(String[] args) {
    public static String bikers(Queue<biker> q,int cc){
    String id;
    q.insert(null);
    while(cc > q.head().getcc()){
        q.insert(q.remove());
    }
    id = q.head().getId();
    q.remove();
    while(q.head()!= null){
        q.insert(q.remove());
    }
    q.remove();
    return id;
}
  }
}
