package U9_INHERITANCE.Notes_9_5;
/**
 * The Animal class is created to demonstrate polymorphism
 * 
 * @author  Mrs. Denna
 */
public class Animal
{
    private String name;
        
    public Animal(String name)
    {
        this.name = name;
    }

    /**
     * Makes a sound for the specific animal type
     * 
    */
    public void speak()
    {
        System.out.println("The Animal " + name + " makes a sound.");
    }
    
    public String getName()
    {
        return name;
    }
}
