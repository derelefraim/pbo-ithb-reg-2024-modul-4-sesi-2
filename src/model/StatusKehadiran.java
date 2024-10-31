package model;

public enum StatusKehadiran {
    HADIR(1),    
    ALPHA(0);    

    private final int poin;
    
    StatusKehadiran(int poin) {
        this.poin = poin;
    }

    public int getPoin() {
        return poin;
    }
}