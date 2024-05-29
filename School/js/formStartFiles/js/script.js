//Joshua Stimpert - Week 9 GA - Web Development with Javascript - fall 2019

function formValidation(){
  const uid = document.registration.userid;
  const passid = document.registration.passid;
  const uname = document.registration.username;
  const uadd = document.registration.address;
  const ucountry = document.registration.country;
  const uzip = document.registration.zip;
  const uemail = document.registration.email;
  const umsex = document.registration.msex;
  const ufsex = document.registration.fsex;

  if(userid_validation(uid, 5, 12)){
    if(passid_validation(passid,7, 12)){
      if(allLetter(uname)){
        if(alphanumeric(uadd)){
          if(countryselect(ucountry)){
            if(allnumeric(uzip)){
              if(validateEmail(uemail)){
                if(validsex(umsex,ufsex)){

                }
              }
            }
          }
        }
      }
    }
  }
  return false;
}

function userid_validation(uid, mx, my){
  const uid_len = uid.value.length;
  if(uid_len == 0 || uid_len >= my || uid_len < mx){
    alert("User Id should not be empty / length be between "+mx+" to " +my);
    uid.focus();

    return false;
  }
  return true;
}

function passid_validation(passid,mx,my){
  const passid_len = passid.value.length;
  if(passid_len == 0 || passid_len >= my || passid_len < mx){
    alert("password should not be empty / legnth be between "+mx+"to "+mx);
    passid.focus();
    return false;
  }
  return true;
}

function allLetter(uname){
  const letters = /^[A-Za-z]+$/;
  if(uname.value.match(letters)){
    return true;
  }
  else{
    alert('Username must have alphabet characters only');
    uname.focus();
    return false;
  }
}

function alphanumeric(uadd){
  const letters = /^[0-9a-zA-Z]+$/;
  if(uadd.value.match(letters)){
    return true;
  }
  else{
    alert('User address must have alphanumeric characters only');
    uadd.focus();
    return false;
  }
}

function allnumeric(uzip){
  const numbers = /^[0-9]+$/;
  if(uzip.value.match(numbers)){
    return true;
  }
  else{
    alert('Zip code must have numeric characters only');
    uzip.focus();
    return false;
  }
}

function countryselect(ucountry){
  if(ucountry.value == "Default"){
    alert('Select your country from the list');
    ucountry.focus();
    return false;
  }
  else{
    return true;
  }
}

function validateEmail(uemail){
  const mailformat = /^\w+([/.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if(uemail.value.match(mailformat)){
    return true;
  }
  else{
    alert("you have entered an invalid email address!");
    uemail.focus();
    return false;
  }
}

function validsex(umsex, ufsex){
  x=0;
  if(umsex.checked){
    x++;
  }
  if(ufsex.checkeD){
    x++;
  }
  if(x==0){
    alert('Select Male/Female');
    umsex.focus();
    return false;
  }
  else{
    alert('Form Successfully Submitted');
    window.location.reload();
    return true;
  }
}
