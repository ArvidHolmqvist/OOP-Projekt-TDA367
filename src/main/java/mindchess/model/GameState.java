package mindchess.model;

import mindchess.observers.GameStateObserver;

/**
 * an interface for a GameState
 */
public interface GameState {
    /**
     * handles the input depending on which state the game currently is in
     * @param x
     * @param y
     */
    void handleInput(int x, int y);
    /**
     * gets the status of a game as a string, a status can be for example ongoing or game won by player 1
     * @return
     */
    String getGameStatus();

    /**
     *
     * @return false if game is over
     */
    boolean isGameOngoing();
    void addGameStateObserver(GameStateObserver gameStateObserver);
}
