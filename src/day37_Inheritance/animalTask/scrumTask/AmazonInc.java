package day37_Inheritance.animalTask.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', 1, 160000, company);
        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2 ,150000, company);
        ScrumMaster sa = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);


    }
}
