package strategy_pattern;

public class Device {
    Callable callable;

    public Device(){
        callable = new SilentCallBehavior();
    }

    public void turnOnDevice(){
        System.out.println("Starting...");
    }

    public void turnOffDevice(){
        System.out.println("Shutting down...");
    }


    public void call(){
        System.out.println(callable.call());
    }

    public void setCallBehavior(Callable callable){
        this.callable = callable;
    }
}
