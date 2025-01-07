class Swan1 {
    int numberEggs; // instance variable
    //what is the problem with this field ?
}

class Swan2{
    private int numberEggs;
    public int getNumberEggs() {
        return numberEggs;
    }
    public void setNumberEggs(int numberEggs) {
        if (numberEggs >= 0) this.numberEggs = numberEggs;
        /*Swan1 sw = new Swan1();
        sw.numberEggs = -1;*/
    }
}
