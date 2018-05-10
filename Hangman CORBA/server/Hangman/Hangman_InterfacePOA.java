package Hangman;


/**
* Hangman/Hangman_InterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hangman.idl
* Thursday, May 10, 2018 3:54:56 PM SGT
*/

public abstract class Hangman_InterfacePOA extends org.omg.PortableServer.Servant
 implements Hangman.Hangman_InterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("login", new java.lang.Integer (0));
    _methods.put ("play", new java.lang.Integer (1));
    _methods.put ("usedWord", new java.lang.Integer (2));
    _methods.put ("logout", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Hangman/Hangman_Interface/login
       {
         String name = in.read_string ();
         boolean $result = false;
         $result = this.login (name);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Hangman/Hangman_Interface/play
       {
         String name = in.read_string ();
         String $result = null;
         $result = this.play (name);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // Hangman/Hangman_Interface/usedWord
       {
         String name = in.read_string ();
         String word = in.read_string ();
         this.usedWord (name, word);
         out = $rh.createReply();
         break;
       }

       case 3:  // Hangman/Hangman_Interface/logout
       {
         String name = in.read_string ();
         String $result = null;
         $result = this.logout (name);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Hangman/Hangman_Interface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Hangman_Interface _this() 
  {
    return Hangman_InterfaceHelper.narrow(
    super._this_object());
  }

  public Hangman_Interface _this(org.omg.CORBA.ORB orb) 
  {
    return Hangman_InterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class Hangman_InterfacePOA