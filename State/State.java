package state;

public abstract class State {
    public abstract void Init();
    public abstract void Update();
    public abstract void onEnter();
    public abstract void onExit();
}
