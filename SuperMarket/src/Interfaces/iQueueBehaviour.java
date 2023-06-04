/**
 * интерфейс  поведение очереди в магазине.
 */
package Interfaces;


public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);

    void releaseFromQueue();

    void takeOrder();

    void giveOrder();
}