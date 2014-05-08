package com.redhat.gss;

@javax.jws.WebService
public interface Hello
{
  public String sayHello(Person p) throws Exception;
}
