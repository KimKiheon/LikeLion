package _1130;

public class Teacher {
    private String name;
    private boolean isLikeAlgorithm;
    private boolean isLikeSpringBoot;
    public Teacher(String name, boolean isLikeAlgorithm, boolean isLikeSpringBoot){
        this.name=name;
        this.isLikeAlgorithm=isLikeAlgorithm;
        this.isLikeSpringBoot=isLikeSpringBoot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLikeAlgorithm(boolean likeAlgorithm) {
        isLikeAlgorithm = likeAlgorithm;
    }

    public void setLikeSpringBoot(boolean likeSpringBoot) {
        isLikeSpringBoot = likeSpringBoot;
    }

    public String getName() {
        return name;
    }

    public boolean isLikeAlgorithm() {
        return isLikeAlgorithm;
    }

    public boolean isLikeSpringBoot() {
        return isLikeSpringBoot;
    }
}
