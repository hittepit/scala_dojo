package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match{
    case Ping => Pong
    case Pong => Ping
    case _ => None
  }

  def receive(msg: Any) = msg match{
    case message:PingPongMessage => handleMsg(message)
    case "stop" => "stopped"
    case ("echo",message:Any) => message
  }

}
