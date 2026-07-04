class MyCircularDeque {

    int[] arr;
    int front;
    int rear;
    int size;
    int k;

    public MyCircularDeque(int k) {
        this.k = k;
        arr = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }
    
    public boolean insertFront(int value) {
        if(size == k)
        {
            return false;
        }
        front = (front - 1 + k) % k;
        arr[front] = value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(size == k)
        {
            return false;
        }
        arr[rear] = value;
        rear = (rear + 1) % k;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size == 0)
        {
            return false;
        }
        front = (front + 1) % k;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(size == 0)
        {
            return false;
        }
        rear = (rear - 1 + k) % k;
        size--;
        return true;
    }
    
    public int getFront() {
        if(size == 0)
        {
            return -1;
        }
        return arr[front];
    }
    
    public int getRear() {
        if(size == 0)
        {
            return -1;
        }
        return arr[(rear - 1 + k) % k];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == k;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */