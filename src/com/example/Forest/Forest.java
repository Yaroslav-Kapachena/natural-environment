package com.example.Forest;

import java.util.ArrayList;

public class Forest<T> {
    private ArrayList<T> forest = new ArrayList<>();
    private  String treeName;
    public Forest(){
    }
    public Forest(ArrayList<T> forest,String treeName) {
        this.forest = forest;
        this.forest = forest;
    }
    public ArrayList<T> getForest() {
        return forest;
    }
    public void setForest(ArrayList<T> forest) {
        this.forest = forest;
    }
    public String getTreeName() {
        return treeName;
    }
    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public void forestAdd(T tree){
        forest.add(tree);
    }
    public void forestDelete(T tree){
        forest.remove(tree);
    }
    public void getTree(Forest forests){
        for (int i = 0; i < forest.size();i++){
            System.out.println("Дерево в лесу: "+forest.get(i));
        }
    }

    @Override
    public String toString() {
        return forest+treeName;
    }
}
