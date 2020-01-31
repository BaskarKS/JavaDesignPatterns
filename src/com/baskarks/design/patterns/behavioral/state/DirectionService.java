package com.baskarks.design.patterns.behavioral.state;

public class DirectionService {
    //private TravelMode travelMode;
    private ITravelMode travelMode;

    public Object getEta() {
        return travelMode.getEta();

/*        if (travelMode == TravelMode.DRIVING) {
            System.out.println("Calculating ETA (driving)");
            return 1;
        }
        else if (travelMode == TravelMode.BICYCLING) {
            System.out.println("Calculating ETA (bicycling)");
            return 2;
        }
        else if (travelMode == TravelMode.TRANSIT) {
            System.out.println("Calculating ETA (transit)");
            return 3;
        }
        else {
            System.out.println("Calculating ETA (walking)");
            return 4;
        }
        */
    }

    public Object getDirection() {
        return travelMode.getDirection();

/*        if (travelMode == TravelMode.DRIVING) {
            System.out.println("Calculating Direction (driving)");
            return 1;
        }
        else if (travelMode == TravelMode.BICYCLING) {
            System.out.println("Calculating Direction (bicycling)");
            return 2;
        }
        else if (travelMode == TravelMode.TRANSIT) {
            System.out.println("Calculating Direction (transit)");
            return 3;
        }
        else {
            System.out.println("Calculating Direction (walking)");
            return 4;
        }*/
    }

/*
    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
*/
    public ITravelMode getTravelMode() {
    return travelMode;
}

    public void setTravelMode(ITravelMode travelMode) {
        this.travelMode = travelMode;
    }

}
