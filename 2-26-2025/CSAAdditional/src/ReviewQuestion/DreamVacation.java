package ReviewQuestion;

public class DreamVacation {
    private String destination;
    private double vacationCost;

    public DreamVacation(){
        this.destination = "unknown";
        this.vacationCost = 0;
    }

    public DreamVacation(String destination, double vacationCost){
        this.destination = destination;
        this.vacationCost = vacationCost;
    }

    public String getDestination(){
        return this.destination;
    }

    public double getVacationCost(){
        return this.vacationCost;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void setVacationCost(double vacationCost){
        this.vacationCost = vacationCost;
    }
}
