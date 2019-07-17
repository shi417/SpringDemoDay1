package dIandAOP.role;

import java.io.PrintStream;

public class Poet {
    private PrintStream printStream;
    public Poet(PrintStream printStream){
        this.printStream = printStream;
    }
    public void startReciting(){
        printStream.println("The Knight begin his heroic !");
    }
    public void endReciting(){
        printStream.println(" The Knight performed his heroic !");
    }
}
