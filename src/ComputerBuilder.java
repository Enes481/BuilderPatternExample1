public class ComputerBuilder implements IComputerBuilder{

    Computer computer;

    public ComputerBuilder()
    {
        this.computer = new Computer();
    }

    @Override
    public IComputerBuilder BuildCPU(int cpu) {
        computer.setCPU(cpu);
        return this;
    }

    @Override
    public IComputerBuilder BuilderMotherBoard(String name) {
        computer.setmotherBoard(name);
        return this;
    }

    @Override
    public Computer Build() {
        return computer;
    }


}
