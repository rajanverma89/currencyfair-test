var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
}
/**
Function to make connection with MessageBrocker i.e. RabbitMq
*/
function connect() {
    var socket = new SockJS('/currencyfair-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        stompClient.subscribe('/queue/orders', function (greeting) {
            drawRow(JSON.parse(greeting.body));
        });
    });
}

/**
Function to populate data in the table.
*/
function drawRow(data){
    $("#currencyFairTable").DataTable().row.add(data).draw();
}

$(function () {
    connect();
    $('#currencyFairTable').dataTable({
            "columns": [
                {"data": "userId"},
                {"data": "currencyFrom"},
                {"data": "currencyTo"},
                {"data": "amountSell"},
                {"data": "amountBuy"},
                {"data": "rate"},
                {"data": "timePlaced"},
                {"data": "originatingCountry"}
            ],
            "language": {
               "loadingRecords": ""
            }
        });
});

