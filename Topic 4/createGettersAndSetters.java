

public class createGettersAndSetters<string> {

	    private string _firstName;
	    private string _lastName;
	    private string _personDescription;
	    private string _other;

	    public createGettersAndSetters() { }

	    //same for lastName, personDescription, other
	    public string FirstName
	    {
	        get
	        {
	            return _firstName;
	        }
	        set
	        {
	            _firstName = FixValue(value);
	        }
	    }

	    private string FixValue(string value)
	    {
	        value = value.Trim();
	        if (value == string.Empty)
	        {
	            return null;
	        }

	        return value;
	    }
	}
