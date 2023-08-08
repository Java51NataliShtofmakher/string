package telran.user.model;

public class User {
	private String email;
	private String password;

	public User(String email, String password) {
		setEmail(email);
		setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (isEmailValid(email)) {
			this.email = email;
		} else {
			System.out.println(email + "is not valid");
		}
	}

	private boolean isEmailValid(String email2) {
		int indexAt = email.indexOf('@');
		if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
			return false;
		}
		if (email.indexOf('.', indexAt) == -1) {
			return false;
		}
		if (email.lastIndexOf('.') > email.length() - 3) {
			return false;
		}
		for (int i = 0; i < email.length(); i++) {
			char c = email.charAt(i);
			if (!(c == '_' || c == '.' || c == '@' || c == '-' || Character.isDigit(c) || Character.isAlphabetic(c))) {
				return false;
			}
		}
		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (!isPasswordValid(password)) {
			System.out.println("Password doesn't meet the requirements");
		}

		this.password = password;
	}
	
	  private boolean isPasswordValid(String password) {
	        if (password.length() < 8) {
	            return false;
	        }

	        boolean hasDigit = false;
	        boolean hasUpperCase = false;
	        boolean hasLowerCase = false;
	        boolean hasSpecialSymbol = false;

	        for (char c : password.toCharArray()) {
	            if (Character.isDigit(c)) {
	                hasDigit = true;
	            } else if (Character.isUpperCase(c)) {
	                hasUpperCase = true;
	            } else if (Character.isLowerCase(c)) {
	                hasLowerCase = true;
	            } else if (c == '!' || c == '@' || c == '"' || c == '&') {
	                hasSpecialSymbol = true;
	            }
	        }

	        return hasDigit && hasUpperCase && hasLowerCase && hasSpecialSymbol;
	    }

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}

}
