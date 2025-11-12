interface MealPlan {}
class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) { this.plan = plan; }
}

class MealPlanner {
    static <T extends MealPlan> void generateMealPlan(T plan) {
        System.out.println("Generated " + plan.getClass().getSimpleName() + " Plan");
    }

    public static void main(String[] args) {
        Meal<VeganMeal> m = new Meal<>(new VeganMeal());
        generateMealPlan(m.plan);
    }
}

