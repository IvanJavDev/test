public class Programmer {
    String name ;
    String position;
    String company;

    public String getPosition() {
        System.out.println(position);
        return position;
    }

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }
    public  void work(){
        switch (position) {
            case "intern":
                position = "junior";
                break;
            case "junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
        }


    }
}
