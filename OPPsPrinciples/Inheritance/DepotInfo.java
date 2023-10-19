package OPPsPrinciples.Inheritance;

public class DepotInfo extends Haryana{
    int depot_rank;
    public DepotInfo(int num_of_routes,int num_of_buses,String best_route,int depot_rank){
        super(num_of_routes, num_of_buses, best_route);
        this.depot_rank=depot_rank;
    }

}
