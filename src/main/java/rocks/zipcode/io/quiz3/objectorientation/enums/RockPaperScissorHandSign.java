package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if(this == ROCK)
            return PAPER;
        if(this == SCISSOR)
            return ROCK;
        return SCISSOR;
    }

    public RockPaperScissorHandSign getLoser() {
        if(this == ROCK)
            return SCISSOR;
        if(this == SCISSOR)
            return PAPER;
        return ROCK;
    }
}
