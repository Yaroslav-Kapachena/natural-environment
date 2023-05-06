package com.example.Main;

import com.example.Forest.Forest;

public class Main {
    public static void main(String[] args) {
        Forest<Object> pine = new Forest<>();
        Forest<Object> aspen = new Forest<>();
        pine.setTreeName(" Сосна ");
        aspen.setTreeName(" Осина ");

        Forest<Forest> forest = new Forest();
        forest.forestAdd(pine);
        forest.forestAdd(aspen);
        forest.getTree(forest);
    }
}
