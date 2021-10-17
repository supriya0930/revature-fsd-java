let signup = document.getElementById("submit");
let firstName = document.getElementById("firstName");
let lastName = document.getElementById("lastName");
let email = document.getElementById("email");
let password = document.getElementById("password");

signup.addEventListener("click", function () {

    if (firstName.value == "") {
        let firstNameError = document.getElementById("firstNameError");
        firstNameError.innerText = "First name is required";
        return;
    }



});
 
firstName.addEventListener("keyup", function () {
    //console.log(firstName.value);
    if (firstName.value != "" && firstName.value.length > 20) {
        let firstNameError = document.getElementById("firstNameError");
        firstNameError.innerText = "First Name cannot exceed 20 characters";
        return;
    }
});
