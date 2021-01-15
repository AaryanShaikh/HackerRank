var btn = document.getElementById('btn');
var count = 0;
btn.onclick = function() {
    btn.innerHTML = ++count;
};