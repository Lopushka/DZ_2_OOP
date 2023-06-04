/** 
 Абстрактный класс.
 интерфейс iActorBehaviour
 интерфейс iReturnOrder
  
*/
package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/** базовый класс */

public abstract class Actor implements iActorBehaviour,iReturnOrder {
    
    protected String name; 
   
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    /** Оплта */
    protected boolean isCash;
    /** Возврат */
    protected boolean isRetornOrder;

    /** конструктор */
    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();

}