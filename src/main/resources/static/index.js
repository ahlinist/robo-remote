const init = function() {
    const forward = document.querySelector("div#forward");
    const left = document.querySelector("div#left");
    const right = document.querySelector("div#right");
    const back = document.querySelector("div#back");
    forward.onclick = function() {
        send('FORWARD');
    };
    left.onclick = function() {
        send('LEFT');
    };
    right.onclick = function() {
        send('RIGHT');
    };
    back.onclick = function() {
        send('BACK');
    };
}

const send = function(direction) {
    const data = {
        direction: direction
    };
    const payload = {
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(data),
        method: 'POST'
    };
    fetch("/move", payload);
}

init();
