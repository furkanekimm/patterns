package com.ba.patterns.prototype;

public class Belge implements  Cloneable{
    private Long id;
    private String name;
    private BelgeTuru belgeTuru;
    private Categori categori;
    private String veri;

    public Belge(Long id, String name, BelgeTuru belgeTuru, Categori categori, String veri) {
        this.id = id;
        this.name = name;
        this.belgeTuru = belgeTuru;
        this.categori = categori;
        this.veri = veri;
    }

    public Belge(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BelgeTuru getBelgeTuru() {
        return belgeTuru;
    }

    public void setBelgeTuru(BelgeTuru belgeTuru) {
        this.belgeTuru = belgeTuru;
    }

    public Categori getCategori() {
        return categori;
    }

    public void setCategori(Categori categori) {
        this.categori = categori;
    }

    public String getVeri() {
        return veri;
    }

    public void setVeri(String veri) {
        this.veri = veri;
    }


//    /**
//     *
//     * Shallow Copy
//     * @return
//     * @throws CloneNotSupportedException
//     */
//    @Override
//    protected Belge clone() throws CloneNotSupportedException {
//        return (Belge) super.clone();
//    }

    /**
     * Deep Copy
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Belge clone() throws CloneNotSupportedException {
        Belge belge = (Belge) super.clone();
        BelgeTuru belgeTuru = belge.getBelgeTuru().clone();
        Categori categori = belge.getCategori().clone();
        belge.setCategori(categori);
        belge.setBelgeTuru(belgeTuru);
        return belge;
    }

    @Override
    public String toString() {
        return "Belge{" +
                "\nid=" + id +
                "\n, name='" + name + '\'' +
                "\n, belgeTuru=" + belgeTuru +
                "\n, categori=" + categori +
                "\n, veri='" + veri + '\'' +
                '}';
    }
}
