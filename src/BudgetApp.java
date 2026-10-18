import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        
        //Budget Category of gorceries:
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

        System.out.println(groceries);
        Scanner scan = new Scanner(System.in);

        //List of BudgetCategory
        List<BudgetCategory> BudgetC = new ArrayList<>();
        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            //Make new groceries:
            BudgetCategory NewGroceries = new BudgetCategory(category, limit, spent);
            //Add new groceries into list.
            BudgetC.add(NewGroceries);
            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
        }

        //Print BudgetC.
        System.out.println(BudgetC);

    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 4
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        return -1;
    }
}
