let account = document.getElementById("accno");
let bal = document.getElementById("password");
let form = document.getElementById("form");
let create = document.getElementById("sub");
// let valid = true;



create.addEventListener("click", function () {

    addAccount();
    alert("Account Created Succesfully");



});

async function addAccount() {



    let account = {
        accountNumber: form.account_number.value,
        balance: form.password.value,
    };


    var options = {
        method: 'POST',
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(account)
    };

        try {
            let response = await fetch("http://localhost:8080/bank-app-rest/accounts", options);

        } catch (err) {
        }
    
}
// create.addEventListener("click", function () {
//     if (account.value == "", bal.value == "") {
//         alert("Enter the Fields")
//     }


// });




