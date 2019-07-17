package dIandAOP.behavior;

import dIandAOP.service.Quest;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
    private PrintStream printStream;
    public SlayDragonQuest(PrintStream printStream){
        this.printStream = printStream;
    }
    public void action() {
        printStream.println("Slay The Dragon !");
    }
}
