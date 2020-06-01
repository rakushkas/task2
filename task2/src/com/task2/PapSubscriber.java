package com.task2;
public class PapSubscriber implements PaperSubscriber {
    private int Pnumber;
    public int getPaperNumber() {
        return Pnumber;
    }
    @Override
    public void updatePaper(int Pnumber) {
        this.Pnumber = Pnumber;
    }
}
