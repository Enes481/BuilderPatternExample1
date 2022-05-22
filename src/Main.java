public class Main {


    public static void main(String[] args){

        IComputerBuilder computerBuilder = new ComputerBuilder();
        Computer computer = computerBuilder.BuildCPU(100).BuilderMotherBoard("Intel").Build();

    }
}

