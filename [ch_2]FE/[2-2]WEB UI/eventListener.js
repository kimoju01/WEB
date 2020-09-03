/* eventListener.html 참고 */

var el = document.querySelector(".outside");

el.addEventListener("click", function(e) {
    var target = e.target;
    console.log(target.className, target.nodeName);
    console.log(target.innerText);
    console.log('clicked!', e);
});