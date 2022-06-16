package classes.village;

public class VillagerBuilder {
    private static final int DEFAULT_HEALTH = 100;
    private static final boolean DEFAULT_LIFE = true;

    public VillagerBuilder() {
    }

    public VillagerPerson build() {
        return new VillagerPerson(this);
    }

    public int getHealth() {
        return DEFAULT_HEALTH;
    }

    public int getAge() {
        return (int) ((Math.random() * (100 - 22) - 22));
    }

    public String getGender() {
        int isMale = (int) (Math.floor(Math.random() * (1)));
        if (isMale == 0) {
            return "Female";
        }
        return "Male";
    }

    public void setGender(String gender) {
    }

    public boolean isAlive() {
        return DEFAULT_LIFE;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
