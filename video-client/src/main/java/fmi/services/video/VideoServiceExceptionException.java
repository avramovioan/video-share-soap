
/**
 * VideoServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package fmi.services.video;

public class VideoServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1677688471318L;
    
    private fmi.services.video.VideoServiceStub.VideoServiceException faultMessage;

    
        public VideoServiceExceptionException() {
            super("VideoServiceExceptionException");
        }

        public VideoServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public VideoServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public VideoServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(fmi.services.video.VideoServiceStub.VideoServiceException msg){
       faultMessage = msg;
    }
    
    public fmi.services.video.VideoServiceStub.VideoServiceException getFaultMessage(){
       return faultMessage;
    }
}
    