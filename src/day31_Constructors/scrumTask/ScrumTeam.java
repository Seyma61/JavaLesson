package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA,SM;

    public ArrayList<Tester> testerslist = new ArrayList<>();
    public ArrayList<Developer> devopList= new ArrayList<>();
    int daysofSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysofSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysofSprint = daysofSprint;
    }
    public void addTester(Tester tester){
        testerslist.add(tester);
    }
    public void addTesters (Tester[ ] testers){
        testerslist.addAll(Arrays.asList(testers));

    }
    public  void  addDeveloper(Developer developer){
        devopList.add(developer);

    }
public  void  addDevelopers(Developer[] developers) {
    devopList.addAll(Arrays.asList(developers));

}

public void  removeTester(int employeeID){
        testerslist.removeIf(p-> p.employeeID == employeeID);

}
public void removeDeveloper(int employeeID){
        devopList.removeIf(p-> p.employeeID == employeeID);

}


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of tester=" + testerslist.size() +
                ", total number of developers=" + devopList.size() +
                ", daysofSprint=" + daysofSprint +
                '}';
    }
}
