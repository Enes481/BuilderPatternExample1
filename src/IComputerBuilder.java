public interface IComputerBuilder {
    IComputerBuilder BuildCPU(int cpu);
    IComputerBuilder BuilderMotherBoard(String name);
    Computer Build();

}
