package ru.appline.logic;

public class Model {
    private static final Model instance = new Model();

    public static Model getInstance() {
        return instance;
    }

    public Side choosingSide(int degree) {
        switch (degree){
            case 21: return Side.NORTH;
            case 66: return Side.NORTHWEST;
            case 111: return Side.WEST;
            case 156: return Side.SOUTHWEST;
            case 201: return Side.SOUTH;
            case 246: return Side.SOUTHEAST;
            case 291: return Side.EAST;
            case 337: return Side.NORTHEAST;
            case 360: return Side.NORTH;
        }
        return null;
    }
}
