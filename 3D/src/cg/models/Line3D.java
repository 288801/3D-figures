package cg.models;

import cg.math.Vector3;
import cg.third.IModel;
import cg.third.PolyLine3D;

import java.util.Arrays;
import java.util.List;

public class Line3D implements IModel {
    private Vector3 p1, p2;

    public Line3D(Vector3 p1, Vector3 p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public List<PolyLine3D> getLines() {
        return Arrays.asList(new PolyLine3D(
                Arrays.asList(p1, p2)
            , false));
    }
    
}
