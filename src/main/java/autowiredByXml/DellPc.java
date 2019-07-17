package autowiredByXml;

public class DellPc implements Computer {

    private Cpu cpu;
    /**强依赖使用构造器 弱依赖使用构造方法 */
    public DellPc(Cpu cpu) {
        this.cpu = cpu;
    }
    public void cpuRun(){
        cpu.run();
    }
}
