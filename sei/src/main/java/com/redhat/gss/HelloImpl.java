package com.redhat.gss;

@javax.jws.WebService(endpointInterface="com.redhat.gss.Hello")
public class HelloImpl implements Hello
{
  public String sayHello(Person p) throws Exception
  {
    return "Hello, " + p.getFirstName() + p.getLastName() + ".";
  }
}
