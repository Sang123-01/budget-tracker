public class BudgetCategory 
{
    private String category;
    private int limit;
    private int spent;

    public BudgetCategory(String category, int limit, int spent)
    {
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }
    
    //For Category
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }

    //For Limit
    public int getLimit()
    {
        return limit;
    }
    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    //For spent
    public int getSpent()
    {
        return spent;
    }
    public void setSpent(int spent)
    {
        this.spent = spent;
    }
    
    //String
    public String toString()
    {
        return "Category: " + category + "; Limit: " + limit + "; Spent: " + spent;
    }
}
