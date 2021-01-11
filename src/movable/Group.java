package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{
    private List<Movable> list;

    public Group(){
        list = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder toPrint = new StringBuilder();
        for (Movable movable : list){
            toPrint.append(movable.toString()).append("\n");
        }
        return toPrint.toString();
    }

    public void addToGroup(Movable movable){
        list.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : list){
            movable.move(dx, dy);
        }
    }
}
