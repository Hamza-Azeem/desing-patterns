package strategy_pattern;

public class SilentCallBehavior implements Callable{
    @Override
    public String call() {
        return "Silence...";
    }
}
