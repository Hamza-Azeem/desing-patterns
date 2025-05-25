package strategy_pattern;

public class DuckCallBehavior implements Callable{
    @Override
    public String call() {
        return "Quacking like a duck";
    }
}
