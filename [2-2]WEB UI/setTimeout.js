
/* 비동기 콜백함수 */

function run() {
    console.log("run start");

    setTimeout(function() {
        var msg = "hello";
        console.log(msg);   // callback 함수 : 즉시 실행되지않고 나중에 실행된다.
        console.log("run . . . .ing");
    }, 1000);   // 1000ms = 1초 뒤 실행. 딜레이 시킬 때 사용하면 좋다.

    console.log("run end"); // start, end가 먼저 나온다
}

run();


/*
만약 
console.log("run start");
run();
console.log("run end");
로 해도 start -> end -> run() 순으로 실행된다!
그리고 지연시간이 0ms 여도 똑같이 run()이 늦게 실행된다
*/