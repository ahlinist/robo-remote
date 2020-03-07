const connect = function() {
    const socket = new SockJS('/gs-guide-websocket');
    const stompClient = Stomp.over(socket);
    stompClient.connect({});
    return stompClient;
}

const stompClient = connect();

const sendDirection = function(direction) {
    stompClient.send("/direction", {}, JSON.stringify({'direction': direction}));
}

const init = function() {
    const forward = document.querySelector("div#forward");
    const left = document.querySelector("div#left");
    const right = document.querySelector("div#right");
    const back = document.querySelector("div#back");
    forward.onclick = function() {
        sendDirection('FORWARD');
    };
    left.onclick = function() {
        sendDirection('LEFT');
    };
    right.onclick = function() {
        sendDirection('RIGHT');
    };
    back.onclick = function() {
        sendDirection('BACK');
    };
}

init();
