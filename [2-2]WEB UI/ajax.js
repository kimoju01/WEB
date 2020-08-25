var oReq = new XMLHttpRequest();
oReq.addEventListener("load", function() {
    console.log(this.responseText);
});

oReq.open("GET", "./ajax_json.txt");    // 서버에 띄워야 예제 동작한다
oReq.send();