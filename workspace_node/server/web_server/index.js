// express 모듈 가져오기
const express = require('express');
const http = require('http');
const appRoot = require('app-root-path').path
const bodyParser = require('body-parser')
const ws = require('ws')

global.k = 1
function start(port=6000){
    // if(port == undefined)
    // if(port){
    //     port = 6000
    // }

    const app = express();
    const httpServer = http.createServer(app)
    const webServer = httpServer.listen(port, ()=>{
        console.log('web server START!! port:', port)
    })

    const websocket = new ws.Server({
        server : webServer
    })

    websocket.on('connection', function(sock, request){
        // 붙고 나서 보내는 것
        sock.on('message', function(msg){
        // 서버가 받은 것
            console.log('받은 메세지', msg)    

            websocket.clients.forEach(function(client){
                client.send(msg.toString())
            })
            // clients : 접속한 녀석의 배열
            // 받은 거 브라우저에 다시 보여주는 것
        })
    })

    app.set('view engine', 'ejs')
    app.set('views', appRoot+ '/view')
    app.use(bodyParser.urlencoded({extended: false}))
    app.use(bodyParser.json())

    app.get('/test', function(request, response){
        console.log('/test 접속')
        response.send("글씨 abc")
    })

    app.get('/login', function(request, response){
        console.log('/login 접속')
        response.render('login', {
            food : '저녁'
        })
    })

    app.get('/login_check_get', function(request, response){
        const id = request.query.id
        console.log('get 아이디 : ',id)

        response.render('login', {
            food : '저녁'
        })
    })


    app.post('/login_check_post', function(request, response){
        const id = request.body.id
        console.log('post 아이디 : ',id)

        response.render('login', {
            food : '저녁'
        })
    })


}

module.exports = {
    // start:start
    // 안에서 적어놓은 것만 사용할 수 있다.
    start
}
