package state;

import java.util.ArrayList;

public class StateMachine {

    ArrayList<State> states;
    int currentState;

    public StateMachine(){
        states = new ArrayList<>();
    }
    public void Init(){
        for(State s:states){
            s.Init();
        }
    }
    public void Update() {
        states.get(currentState).Update();
    }
    public void AddState(State state){
        states.add(state);
    }
    public void RemoveState(State state){
        states.remove(state);
    }
    public void RemoveState(int index){
        states.remove(index);
    }
    public void ChangeState(int index){
        states.get(currentState).onExit();
        currentState = index;
        states.get(currentState).onEnter();
    }
}
