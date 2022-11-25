function func()
{
    let name=document.getElementById("nam");
    let r=document.getElementById("nres");
    if(name.value.charAt(0) >=0 && name.value.charAt(0) <10)
    {        
        r.innerText="Please Enter Valid name..!";
        r.style.color='red';
        name.style.borderColor='red';
    }
    else{
        r.innerText="Valid name..!";
        r.style.color='green';
        name.style.borderColor='green';
    }
     name=document.getElementById("emai");
     r=document.getElementById("eres");
    if(name.value.charAt(0) >=0 && name.value.charAt(0) <10 || name.value.includes("#$%^&*()"))
    {        
        r.innerText="Please Enter Valid email..!";
        r.style.color='red';
        name.style.borderColor='red';
    }
    else{
        r.innerText="Valid email..!";
        r.style.color='green';
        name.style.borderColor='green';
    }
    name=document.getElementById("pas");
    r=document.getElementById("pres");
    if(name.value.length<7)
    {        
        r.innerText="Please Enter Valid passsword..!";
        r.style.color='red';
        name.style.borderColor='red';
    }
    else{
        r.innerText="Valid password.!";
        r.style.color='green';
        name.style.borderColor='green';
    }
}
