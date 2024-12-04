public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();

        Habitat savannah = new Habitat("savannah", 100, 32);
        Habitat rainforest = new Habitat("rainforest", 110, 20);

        zoo1.addAnimal1("tiger", "big cats", 5, rainforest);
        zoo1.addAnimal2("asian elephant", "elephants", 10, savannah);
        zoo1.addAnimal3("giraffe", "giraffe", 8, savannah);
        zoo1.addAnimal4("lion", "big cats", 4, savannah);

        Staff staff1 = new Staff("Mina", "feeder", savannah);
        Staff staff2 = new Staff("Raya","cleaner", rainforest);
        Staff staff3 = new Staff("Elena", "cleaner", savannah);

        staff1.assignStaff(savannah);
        staff2.assignStaff(rainforest);
        staff3.assignStaff(savannah);

        staff1.Print();
        staff2.Print();
        staff3.Print();
    }
}

class Animal{
    private String name;
    private String species;
    private int age;
    Habitat habitat;

    public Animal(String name, String species, int age, Habitat habitat){
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
    }
}

class Habitat{
    private String type;
    private int size;
    private int temperature;

    public Habitat(String type, int size, int temperature){
        this.type = type;
        this.size = size;
        this.temperature = temperature;
    }
}

class Zoo{
    Animal a1;
    Animal a2;
    Animal a3;
    Animal a4;

    public void addAnimal1 (String name, String species, int age, Habitat habitat){
        a1 = new Animal(name, species, age, habitat);
    }

    public void addAnimal2 (String name, String species, int age, Habitat habitat){
        a2 = new Animal(name, species, age, habitat);
    }

    public void addAnimal3 (String name, String species, int age, Habitat habitat){
        a3 = new Animal(name, species, age, habitat);
    }

    public void addAnimal4 (String name, String species, int age, Habitat habitat){
        a4 = new Animal(name, species, age, habitat);
    }
}

class Staff{
    String nameH;
    String roleH;
    Habitat assignHabitat;

    public Staff(String nameH, String roleH, Habitat assignHabitat){
        this.nameH = nameH;
        this.roleH = roleH;
        this.assignHabitat = assignHabitat;
    }

    void assignStaff(Habitat habitat){
        this.assignHabitat = habitat;
    }

    void Print(){
        System.out.println(nameH + " is assigned to " + assignHabitat);
    }
}


