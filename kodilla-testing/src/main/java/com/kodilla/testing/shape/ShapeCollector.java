package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeCollection.add(shape);
    }

    public int getFigureQuantity() {
        return shapeCollection.size();
    }

    public boolean removeFigure(Shape shape){
        return shapeCollection.remove(shape);
    }

    public Shape getFigure(int n){

        if (n >= 0 && n < shapeCollection.size()) {
            return shapeCollection.get(n);
        }
        return null;
    }

    public void showFigures(){
        int i=0;
        while (i!=getFigureQuantity()) {
            System.out.println(shapeCollection.get(i).getShapeName());
            i++;
        }
    }

    public String pawel(int n){


        return shapeCollection.get(n).getShapeName();
    }


}
