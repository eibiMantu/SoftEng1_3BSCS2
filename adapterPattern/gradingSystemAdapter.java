public class gradingSystemAdapter implements schoolManagementApp {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        gradingSystem.recordGrades();
    }
}
