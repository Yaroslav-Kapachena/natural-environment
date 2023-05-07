package com.example.Forest;

import com.example.Habitat.Habitat;

import java.util.ArrayList;

public class Forest<T> implements Habitat {
    private ArrayList<T> forest = new ArrayList<>();
    public Forest(){
    }

    public Forest(ArrayList<T> forest) {
        this.forest = forest;
    }

    public ArrayList<T> getForest() {
        return forest;
    }

    public void setForest(ArrayList<T> forest) {
        this.forest = forest;
    }
    public void add(T tree){
        forest.add(tree);
    }
    public void delete(T tree){
        forest.remove(tree);
    }
    public void  allTrees( Forest forests){
        for(int i = 0;i<forest.size();i++){
            forest.get(i);
        }
    }
    public void numberOfTrees(Forest forests){
        forest.size();
        System.out.println(forest.size());
    }

    @Override
    public void animalAdd(T animal) {
        forest.add(animal);
    }

    @Override
    public void animalDelete(T animal) {
        forest.remove(animal);
    }

    @Override
    public void getAllAnimals(Forest forests) {
        for(int i =0;i< forest.size();i++){
            forest.get(i);
        }
    }

    @Override
    public void numberOfAnimals(Forest forests) {
        forest.size();
        System.out.println(forest.size());
    }
}
