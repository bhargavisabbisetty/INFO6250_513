package GA;

public class Genotype implements Comparable<Genotype>{

    private boolean note;
    private int key;
    private int velocity;
    private Long gene_fitness;

    public boolean isNote() {
        return note;
    }

    public void setNote(boolean note) {
        this.note = note;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }


    public Long getGene_fitness() {
        return gene_fitness;
    }

    public void setFitness(Long fitness) {
        this.gene_fitness = fitness;
    }

    @Override
    public int compareTo(Genotype gene){
        return gene_fitness.compareTo(gene.getGene_fitness());
    }
}
