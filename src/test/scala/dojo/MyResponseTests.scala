package dojo

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith


@RunWith(classOf[JUnitRunner])
class MyResponseTests extends FunSuite with ShouldMatchers{

  test("should return pong when sent ping"){
    val response = new MailBox().handleMsg(Ping)
    response should equal (Pong)
  }

  test("should return ping when sent pong"){
    val response = new MailBox().handleMsg(Ping)
    response should equal (Pong)
  }

  test("should return pong when received ping"){
    val response = new MailBox().receive(Ping)
    response should equal (Pong)
  }

  test("should return ping when received pong"){
    val response = new MailBox().receive(Pong)
    response should equal (Ping)
  }

  test("should return stopped when received stop message"){
    val response = new MailBox().receive("stop")
    response should equal ("stopped")
  }

  test("should return Hello World when received echo message"){
    val response = new MailBox().receive(("echo", "Hello World"))
    response should equal ("Hello World")
  }

}