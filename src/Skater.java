public class Skater extends Competitor {
    private String level;
    private int age;

    public Skater(int competitorNumber, String name, String country, String level, int age) {
        super(competitorNumber, name, country);
        this.level = level;
        this.age = age;
    }

    @Override
    public double getOverallScore() {
        // Change the scoring logic as needed
        return 8.5;
    }

    @Override
    protected String getLevel() {return level;}
    @Override
    protected int getAge() {return age;}

    @Override
    protected String getInitials() {
        // Assuming initials are the first letter of each word in the name
        String[] nameParts = getName().split(" ");
        StringBuilder initials = new StringBuilder();
        for (String part : nameParts) {
            initials.append(part.charAt(0));
        }
        return initials.toString();
    }
}