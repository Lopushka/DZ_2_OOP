package Interfaces;

import Classes.Actor;
public interface iReturnOrder {
    void setRetornOrder(boolean RetornOrder);

    void setCash(boolean Cash);
    
    boolean isRetornOrder();
    boolean isCash();
    Actor getActor();

}
