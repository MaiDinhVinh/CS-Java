class InterfaceExecutor implements InterfaceExample1{
    boolean on;

    @Override
    public void on(){
        on = true;
    }

    @Override
    public void off(){
        on = false;
    }
}

