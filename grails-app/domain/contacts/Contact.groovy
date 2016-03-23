package contacts

class Contact {

	String firstName
	String secondName
	String email
	int age
	Date birthDate
	char sex
	BigDecimal phone
	BigDecimal movil


    static constraints = {
    	firstName blank: false
    	secondName blank: true
    	email email: true, blank: false
    	age min: 15
    	movil blank: true
    }
}
