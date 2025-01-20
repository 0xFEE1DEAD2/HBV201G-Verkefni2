package vinnsla;

public class Floskur {
    private int virdiDosir;
    private int fjoldiDosir;

    private int virdiFloskur;
    private int fjoldiFloskur;

    /**
     * Setur fjölda dósa og uppfærir viðri dósa.
     *
     * @param dosir
     */
    public void setFjoldiDosir(int dosir) {
        this.fjoldiDosir = dosir;
        this.virdiDosir = dosir * 25;
    }

    /**
     * Skilar virði dósa.
     *
     * @return virdiDosir
     */
    public int getISKDosir() {
        return this.virdiDosir;
    }



    /**
     * Setur fjölda flaska og uppfærir viðri dósa.
     *
     * @param floskur
     */
    public void setFjoldiFloskur(int floskur) {
        this.fjoldiFloskur = floskur;
        this.virdiFloskur = floskur * 25;
    }

    /**
     * Skilar virði flaska.
     *
     * @param dosir
     * @return virdiFloskur
     */
    public int getISKFloskur(int dosir) {
        return this.virdiFloskur;
    }

    /**
     * Hreinsar fjölda og virði dósa og flaska.
     */
    public void hreinsa() {
        this.fjoldiDosir = 0;
        this.fjoldiFloskur = 0;
        this.virdiDosir = 0;
        this.virdiFloskur = 0;
    }
}
