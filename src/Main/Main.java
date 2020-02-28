package Main;

import MyBST.MyBST;

public class Main {
    public static void main(String[] args) {
        MyBST obj = new MyBST();
        obj.insert(25);
        obj.insert(23);
        obj.insert(21);
        obj.insert(29);

        obj.traverseInOrder(obj.getRoot());
    }
}
