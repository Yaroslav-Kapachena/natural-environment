package com.example.Habitat;

import com.example.Forest.Forest;

import java.util.ArrayList;

public interface Habitat<T> {
   void animalAdd(T animal);
   void animalDelete(T animal);
   void getAllAnimals(Forest forests);
   void numberOfAnimals(Forest forests);

}
