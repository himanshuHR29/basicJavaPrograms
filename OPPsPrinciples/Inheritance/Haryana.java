package OPPsPrinciples.Inheritance;

public class Haryana {
    int num_of_depot;
    String best_route;
    int num_of_buses;

    public Haryana(){
        this.best_route=null;
        this.num_of_buses=0;
        this.num_of_depot=0;
    }
    public Haryana(int num_of_buses){
        this.num_of_buses=num_of_buses;
    }
    public Haryana(int num_of_depot,int num_of_buses,String best_route){
        this.num_of_depot=num_of_depot;
        this.num_of_buses=num_of_buses;
        this.best_route=best_route;
    }
    
}
