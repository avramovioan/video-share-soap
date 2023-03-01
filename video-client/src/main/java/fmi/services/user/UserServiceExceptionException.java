
/**
 * UserServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package fmi.services.user;

public class UserServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1677687323656L;
    
    private fmi.services.user.UserServiceStub.UserServiceException faultMessage;

    
        public UserServiceExceptionException() {
            super("UserServiceExceptionException");
        }

        public UserServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public UserServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UserServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(fmi.services.user.UserServiceStub.UserServiceException msg){
       faultMessage = msg;
    }
    
    public fmi.services.user.UserServiceStub.UserServiceException getFaultMessage(){
       return faultMessage;
    }
}
    